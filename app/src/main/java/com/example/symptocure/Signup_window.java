package com.example.symptocure;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Signup_window extends AppCompatActivity {

    public void signup_pressed(View view)
    {
        EditText editText1=(EditText)findViewById(R.id.input_name);
        EditText editText2=(EditText)findViewById(R.id.input_username);
        EditText editText3=(EditText)findViewById(R.id.input_phonenum);
        EditText editText4=(EditText)findViewById(R.id.input_password);
        String name= editText1.getText().toString();
        String username= editText2.getText().toString();
        String phonenum= editText3.getText().toString();
        String password= editText4.getText().toString();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_window);



    }
}
