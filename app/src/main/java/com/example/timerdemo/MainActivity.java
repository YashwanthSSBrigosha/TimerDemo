package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,100){
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Seconds Left!",String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                Log.i("We are Done","Countdown has Stopped");
            }
        }.start();

       /* Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Inside run","A Second Has Passed");
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);*/
    }
}