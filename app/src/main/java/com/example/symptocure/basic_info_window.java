package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class basic_info_window extends AppCompatActivity {


    public void gender_selected(View view)
    {
        Button btn1=(Button) findViewById(R.id.male_button);
        Button btn2=(Button) findViewById(R.id.female_button);
        Button btn3=(Button) findViewById(R.id.next_age_button);
        TextView ques=(TextView) findViewById(R.id.ques_text);
        com.google.android.material.textfield.TextInputLayout age_in=(com.google.android.material.textfield.TextInputLayout) findViewById(R.id.age_input);
        ques.setText("How old are you?");
        btn1.setVisibility(view.INVISIBLE);
        btn2.setVisibility(view.INVISIBLE);
        btn3.setVisibility(view.VISIBLE);
        age_in.setVisibility(view.VISIBLE);
    }

    public void age_entered(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Symptom_selection_window.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_info_window);
    }
}