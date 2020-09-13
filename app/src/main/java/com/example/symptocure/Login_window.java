package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login_window extends AppCompatActivity {


    public void login_pressed(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Symptom_selection_window.class);
        startActivity(intent);
        finish();
    }

    public void take_to_signup(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Signup_window.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_window);



 }
}
