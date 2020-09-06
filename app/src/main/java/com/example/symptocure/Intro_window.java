package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Intro_window extends AppCompatActivity {

    public void Notes(View view)    //When the "Next" button is clicked, the user will be shown Terms and Condition from Introduction.
    {
        TextView heading_intro=(TextView) findViewById(R.id.heading_login);
        TextView text_greeting=(TextView) findViewById(R.id.text_greeting);
        TextView text_para=(TextView) findViewById(R.id.text_para);
        ImageView image_intro=(ImageView) findViewById(R.id.image_login);
        Button button_next=(Button) findViewById(R.id.button_next);
        Button button_back=(Button) findViewById(R.id.button_back);
        Button button_next2=(Button) findViewById(R.id.button_next2);
        CheckBox checkBox=(CheckBox) findViewById(R.id.checkBox);


        heading_intro.setText("Terms and Conditions");
        text_greeting.setText("Note:");
        text_para.setText("• DO NOT USE IN EMERGENCY: This application is not meant for emergency cases. In case of any emergency, contact you local Doctor.\n" +
                "• CHECKUP IS NOT A DIAGNOSIS: Checkup is just for self Information, and it is not Medically Qualified or verified.\n" +
                "• NO PRESCRIPTION WILL BE GIVEN: The Prescription for the resulted disease will not be provided.\n" +
                "• DATA WILL BE SAFE: The Personal Details of the user will remain confidential at any cost.");

        button_back.setVisibility(view.VISIBLE);
        button_next.setVisibility(view.INVISIBLE);
        button_next2.setVisibility(view.VISIBLE);
        checkBox.setVisibility(view.VISIBLE);
    }


    public void go_back(View view)    //When the "Back" button is clicked, the user will get back Introduction from Terms and Conditions.
    {
        TextView heading_intro=(TextView) findViewById(R.id.heading_login);
        TextView text_greeting=(TextView) findViewById(R.id.text_greeting);
        TextView text_para=(TextView) findViewById(R.id.text_para);
        ImageView image_intro=(ImageView) findViewById(R.id.image_login);
        Button button_next=(Button) findViewById(R.id.button_next);
        Button button_back=(Button) findViewById(R.id.button_back);
        Button button_next2=(Button) findViewById(R.id.button_next2);
        CheckBox checkBox=(CheckBox) findViewById(R.id.checkBox);


        heading_intro.setText("Introduction");
        text_greeting.setText("Greetings!");
        text_para.setText("Symptocure is a safe and fast Self Check-up tool. Your symptoms would be carefully analyzed and according to your answers," +
                " the Expected Problem, it's Precaution and the type of Doctor to be concerned will be displayed.");

        button_back.setVisibility(view.INVISIBLE);
        button_next.setVisibility(view.VISIBLE);
        button_next2.setVisibility(view.INVISIBLE);
        checkBox.setVisibility(view.INVISIBLE);
        checkBox.setChecked(false);
    }

    public void login_next(View view)    //When the "Back" button is clicked, the user will get back Introduction from Terms and Conditions.
    {
        Button button_next2=(Button) findViewById(R.id.button_next2);
        CheckBox checkBox=(CheckBox) findViewById(R.id.checkBox);

        if(checkBox.isChecked())
        {
            Intent intent=new Intent(getApplicationContext(),Login_window.class);
            startActivity(intent);
            finish();
        }
        else
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Accept the Terms and Conditions to proceed",Toast. LENGTH_SHORT);
            //toast.setMargin(50,50);
            toast.show();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_window);


        Button button_next2=(Button) findViewById(R.id.button_next2);
        CheckBox checkBox=(CheckBox) findViewById(R.id.checkBox);


        if(checkBox.isChecked())
            button_next2.setEnabled(true);



    }
}