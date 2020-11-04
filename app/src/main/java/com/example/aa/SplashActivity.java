package com.example.aa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private Handler handler;
    private SplashHandler spHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onResume(){
        super.onResume();

        handler = new Handler();
        spHandler = new SplashHandler();
        handler.postDelayed(spHandler, 2000);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Intent intent = null;
        handler.removeCallbacks(spHandler);
    }

    class SplashHandler implements Runnable {
        @Override
        public void run() {
            Intent intent = new Intent(getApplication(), Home.class);
            startActivity(intent);
            SplashActivity.this.finish();
        }
    }
}