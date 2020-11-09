package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Result_window extends AppCompatActivity {


    public void recheck(View view){
        Button btn=(Button) findViewById(R.id.recheck_btn);
        Intent intent=new Intent(getApplicationContext(),Symptom_selection_window.class);
        startActivity(intent);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_window);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        String disease_results[]=b.getStringArray("Result array");
        int result_count[]=b.getIntArray("Result count");
        int f=(int) b.get("Index");

        Log.i("Hello","------------------------------------------------------------");
        Log.i("Hello","index is"+f);


        TextView tx[]=new TextView[10];

        int sum=0;
        for(int i=0;i<f;i++)
        {
            if(result_count[i]>1) {
                sum += result_count[i];
                Log.i("heheheehhe", "sum=  " + sum + "    count    " + result_count[i]);
            }
        }




        int flag=0;

        int count=0;
        double percentd=1;
        for(int i=0;i<f;i++)
        {
            if(result_count[i]>1)
            {
                flag=1;
                percentd=1.0*result_count[i]/sum*100;
                int ppp=(int)(percentd);
                String tx_id = "result_" + (count + 1);
                int resID = getResources().getIdentifier(tx_id, "id", getPackageName());
                tx[count] = ((TextView) findViewById(resID));
                tx[count].setVisibility(View.VISIBLE);
                tx[count].setText(ppp+"%      "+disease_results[i]);
                count++;
            }
        }


        if(flag==0)
        {
            TextView ttxx=(TextView) findViewById(R.id.note_text);
            ttxx.setText("SORRY!  As this application is still under Construction, so we couldn't fetch your results right now. Try after sometime");
        }



    }
}