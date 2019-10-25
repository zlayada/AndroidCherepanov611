package com.netology.androidcherepanov611;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private String STATE = "state";
    private String TAG = "Lifecycle";

    private TextView mLog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Log.v( TAG, "App started (Verbose)");
            Log.d( TAG, "App started (Debug)");
            Log.e( TAG, "App started (Error)");
            Log.i( TAG, "App started (Info)");
            Log.w( TAG, "App started (Warn)");


        mLog = findViewById(R.id.log_activity);
        Log.d( TAG, "OnCreate");

        if (savedInstanceState == null) {

            Log.d( TAG, "savedInstanceState is null");
            mLog.append('\n' + "OnCreate");
            mLog.append('\n' + "savedInstanceState is null");

        } else {

            Log.d( TAG, "savedInstanceState is NOT null");
            mLog.setText(savedInstanceState.getString(STATE));
            mLog.append('\n' + "OnCreate");
            mLog.append('\n' + "savedInstanceState is NOT null");

        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {

        Log.d( TAG, "onPostCreate");
        mLog.append('\n' + "onPostCreate");
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onRestart() {

        Log.d( TAG, "onRestart");
        mLog.append('\n' + "onRestart");
        super.onRestart();

    }

    @Override
    protected void onStart() {

        Log.d( TAG, "onStart");
        mLog.append('\n' + "onStart");
        super.onStart();

    }

    @Override
    protected void onResume() {

        Log.d( TAG, "onResume");
        mLog.append('\n' + "onResume");
        super.onResume();

    }

    @Override
    protected void onPostResume() {

        Log.d( TAG, "onPostResume");
        mLog.append('\n' + "onPostResume");
        super.onPostResume();

    }

    @Override
    protected void onPause() {

        Log.d( TAG, "onPause");
        mLog.append('\n' + "onPause");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Log.d( TAG, "onStop");
        mLog.append('\n' + "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {

        Log.d( TAG, "onDestroy");
        mLog.append('\n' + "onDestroy");
        super.onDestroy();

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        Log.d( TAG, "onKeyDown");
        mLog.append('\n' + "onKeyDown");
        event.startTracking();

        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {

        Log.d( TAG, "onKeyLongPress");
        mLog.append('\n' + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);

    }

    @Override
    public void onBackPressed() {

        Log.d( TAG, "onBackPressed");
        mLog.append('\n' + "onBackPressed");
        super.onBackPressed();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {

        Log.d( TAG, "onSaveInstanceState");
        mLog.append('\n' + "onSaveInstanceState");
        outState.putString(STATE, mLog.getText().toString());
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onRestoreInstanceState(@Nullable Bundle savedInstanceState) {

        Log.d( TAG, "onRestoreInstanceState");
        mLog.append('\n' + "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);

    }
}
