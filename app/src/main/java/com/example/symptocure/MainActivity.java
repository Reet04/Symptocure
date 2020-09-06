package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void show(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ImageView logo = (ImageView)findViewById(R.id.logo);
        TextView maintext=(TextView)findViewById(R.id.maintext);
        TextView maintext2=(TextView)findViewById(R.id.maintext2);
        logo.startAnimation(animation1);
        maintext.startAnimation(animation1);
        maintext2.startAnimation(animation1);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),Intro_window.class);
                startActivity(intent);
                finish();
            }
        },4000);


    }
}