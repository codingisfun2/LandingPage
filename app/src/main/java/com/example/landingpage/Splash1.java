package com.example.landingpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent mInHome = new Intent(Splash1.this, MainActivity.class);
                Splash1.this.startActivity(mInHome);
                Splash1.this.finish();
            }
        }, 4000);
    }
}