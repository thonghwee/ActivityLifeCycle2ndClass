package com.example.taruc.activitylifecycle;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int counter = 0;
    private static final String TAG = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate() is called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
        Log.d(TAG,"onSaveInstanceState() is called and counter value is saved");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState() is called and counter value is restore" + savedInstanceState.getInt("counter"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(getApplicationContext(),"You have switched your screen to portrait mode", Toast.LENGTH_LONG).show();
        }else if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast.makeText(getApplicationContext(),"You have switched your screen to Landscape mode", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"Testing", Toast.LENGTH_LONG).show();

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter++;
        Log.d(TAG,"onResume() is called and counter value is : " + counter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop() is called");
    }


}
