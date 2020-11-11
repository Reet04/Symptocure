package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Symptom_selection_window extends AppCompatActivity {

    int ff;
    String s2[];
    String selected_1[];
    int count;

    public void contin_btn1(View view) {

        String Symp[] ={"headache","breathlessness","sore throat","Sleeplessness","Viral","Fainting","loss of taste and smell","Red Rash","Sneezing","Dry cough","Swollen tummy","Feeling weak","Muscle and joint pain","Urinate more often","Urine in blood"};

        String diseases[][]={{"Commom cold","Bronchitis","Flu"},
                {"asthma","bronchitis","pneumonia","pneumothorax","anemia","lung cancer","inhalation injury","pulmonary embolism","anxiety","COPD","arrhythmia","allergic reaction","anaphylaxis","subglottic stenosis","interstitial lung disease"},
                {"Common cold","Flu","Mono (mononucleosis)","Measles","Chickenpox","COVID-19","Croup","Allergies","Dryness","Gastroesophageal reflux","Irritants","Muscle strain","HIV infection,tumors"},
                {"Rheumatoid","arthritis","osteoarthritis"},
                {"Chickenpox","Flu","Herpes","Human immunodeficiency virus","Human papillomavirus","Infectious mononucleosis","Mumps","measles and rubella","Shingles","Viral gastroenteritis (stomach flu)","Viral hepatitis","Viral meningitis","Viral pneumonia"},
                {"irregular heart beats","seizures","low blood sugar","anemia","low blood pressure"},
                {"Obesity","Diabetes","High blood pressure","Poor nutrition","Parkinson disease","Alzheimer disease","Multiple sclerosis","Common Cold","Flu","Head injury","Hormone changes","Dental or mouth problems","Nasal polyps","Exposure to certain chemicals","Certain medicines","Exposure to radiation therapy","Cocaine snorted through the nose","Cigarette smoking"},
                {"rubella","chickenpox","mononucleosis","roseola","hand, foot, and mouth disease","fifth disease","Zika virus","West Nile virus","dengue fever"},
                {"Common cold","flu","Other respiratory tract infections","Sinusitis"},
                {"asthma","lung infection","lung cancer","acute sinusitis","chronic sinusitis","bronchitis","cystic fibrosis","emphysema","laryngitis","pertussis (whooping cough)","COPD","heart failure","croup","tuberculosis","idiopathic pulmonary fibrosis (IPF)"},
                {"Chronic gut disorders","irritable bowel syndrome (IBS)","Crohns disease","Dengue"},
                {"the flu","thyroid disease","anemia","depression or anxiety","a lack of sleep","poorly managed or undiagnosed diabetes","congestive heart failure","vitamin B-12 deficiency"},
                {"Adult Still's disease","Ankylosing spondylitis","Avascular necrosis","Bone cancer","Broken bone","Bursitis (joint inflammation)","Complex regional pain syndrome","Disloca","Leukemia","Lupus","Lyme disease","Osteoarthritis","Osteomyelitis (a bone infection)","Pagets disease of bone","Polymyalgia rheumatica","Pseudogout","Psoriatic arthritis","Reactive arthritis","Rheumatic fever","Rheumatoid arthritis","Rickets","Sarcoidosis","Septic arthritis","Sprains","Tendinitis"},
                {"Anterior prolapse (cystocele)","Anxiety disorders","Benign prostatic hyperplasia (BPH)","Bladder stones","Change in kidney function","Diabetes insipidus","Diuretics","Excess consumption of total fluids, alcohol or caffeine"},
                {"Urinary tract or kidney infections","Bladder or kidney stones","inflammation in the filtering system (glomerulonephritis)","An enlarged prostate (benign prostatic hyperplasia) or prostate cancer","Inherited diseases such as sickle cell anemia and cystic kidney disease","Certain medications such as aspirin, cyclophosphamide, heparin, and penicillin","Cancer in your bladder or kidney","A kidney injury from an accident or sports","Vigorous exercise"}};


        String disease_list[] = {"Common cold","Bronchitis","Asthma","Low blood pressure","High blood pressure","Dengue","Flu","Pneumonia","Anemia","Chickenpox","Diabetes","Brest cancer","Chest pain","Diarrhoea","Food Poisoning"};

        String symptom_2d[][]={
                {"blocked or runny nose","sore throat","headache","muscle aches","coughs","sneezing","raised temperature","pressure in your ears and face","loss of taste and smell"},
                {"sore throat","headache","breathlessness","dry cough","runny or blocked nose","aches and pains","tiredness"},
                {"wheezing","breathlessness","chest pain","dry cough"},
                {"light headedness or dizziness","feeling sick","blurred vision","generally feeling weak","confusion","fainting"},
                {"tiredness","swollen ankles, feet or hands (due to water retention)","shortness of breath","blood in urine","urinating more often","itchy skin"},
                {"high temperature","feeling hot or shivery","headache","pain behind the eyes","muscle and joint pain","feeling or being sick","widespread red rash","tummy pain and loss of appetite","severe tummy pain","swollen tummy","being sick repeatedly and vomiting blood","bleeding gums or bleeding under the skin","breathing difficulties or fast breathing","cold","clammy skin","weak but fast pulse","drowsiness or loss of consciousness"},
                {"sudden fever","Body Ache","feeling tired or exhausted","dry cough","sore throat","headache","difficulty sleeping","loss of appetite","diarrhoea or tummy pain","feeling sick"},
                {"dry cough","wet cough","difficulty breathing","breathless","rapid heartbeat","high temperature","feeling generally unwell","sweating and shivering","loss of appetite","chest pain","coughing up blood","headache","fatigue","feeling sick","wheezing","joint and muscle pain"},
                {"tiredness","shortness of breath","noticeable heartbeats","pale skin"},
                {"high temperature","aches and pains","loss of appetite"},
                {"feeling very thirsty","peeing more often","feeling very tired","weight loss","itching around the penis or vagina,","cuts or wounds that heal slowly","blurred vision"},
                {"lump or area of thickened tissue in either breast","change in the size or shape of one or both breast","discharge from either of your nipples (which may be streaked with blood)","lump or swelling in either of your armpits","dimpling on the skin of your breasts","rash on or around your nipple","change in the appearance of your nipple such as becoming sunken into your breast" },
                {"persistent cough","coughing up yellow or green phlegm","coughing up blood","breathlessness","rapid and shallow breathing","wheezing","high temperature","a rapid heartbeat","chest pain","feeling confused"},
                {"stomach cramps","nausea and vomiting","headache","loss of appetite"},
                {"feeling sick","vomiting","diarrhoea","stomach cramps and abdominal pain","lack of energy and weakness","loss of appetite","high temperature","aching muscles","chills"},
        };

        int inde[]=new int[100];
        selected_1=new String[20];
        count=0;
        CheckBox[] che = new CheckBox[100];
        for(int i=0; i<15; i++) {
            String che_id = "checkBox" + (i + 1);
            inde[i]=0;
            int resID = getResources().getIdentifier(che_id, "id", getPackageName());
            che[i] = ((CheckBox) findViewById(resID));
            //che[i].setOnClickListener(this);
            if(che[i].isChecked())
            {
                inde[i]=1;
                selected_1[count]="";
                selected_1[count]=selected_1[count]+che[i].getText();
                count++;
            }
        }
        if(count>10)
        {
            Toast toast=Toast.makeText(getApplicationContext(),"Selections getting out of Limit(10)",Toast. LENGTH_SHORT);
            toast.show();
        }
        else {
            String s[] = new String[100];       // array to store the disease names to avoid repetition
            int f = 0;          // int to keep count of disease in s array
            Log.i("Step 1", "Successful");


            //----------------collects the diseases according to the symptoms and stores them in array s------------------
            for (int i = 0; i < 15; i++) {
                if (inde[i] == 1) {
                    for (int j = 0; j < diseases[i].length; j++) {
                        int flag = 0;
                        for (int k = 0; k < f; k++) {
                            if (diseases[i][j].equalsIgnoreCase(s[k])) {
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            s[f] = diseases[i][j];
                            f++;
                        }
                    }
                }
            }

            Log.i("Step 2", "Successful");

            //-----------------Makes all the current views invisible-----------------

            for (int i = 0; i < 58; i++) {
                String che_id = "checkBox" + (i + 1);
                inde[i] = 0;
                int resID = getResources().getIdentifier(che_id, "id", getPackageName());
                che[i] = ((CheckBox) findViewById(resID));
                che[i].setVisibility(view.INVISIBLE);
                che[i].setChecked(false);
            }
            Log.i("Step 3", "Successful");

            //--------------update the symptoms in the new array s2------------------------
            s2 = new String[100];
            ff = 0;
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < 15; j++) {
                    if (s[i].equalsIgnoreCase(disease_list[j])) {
                        for (int k = 0; k < symptom_2d[j].length; k++) {
                            int flag = 0;
                            for (int l = 0; l < ff; l++) {
                                if (symptom_2d[j][k].equalsIgnoreCase(s2[l])) {
                                    flag = 1;
                                    break;
                                }
                            }
                            for(int l=0;l<count;l++)
                            {
                                if(symptom_2d[j][k].equalsIgnoreCase(selected_1[l]))
                                {
                                    flag = 1;
                                    break;
                                }
                            }
                            if (flag == 0) {
                                s2[ff] = symptom_2d[j][k];
                                ff++;
                            }
                        }
                    }
                }
            }
            Log.i("Step 4", "Successful");

            for (int i = 0; i < ff; i++) {
                Log.i("ddd", "is " + s2[i]);
                String che_id = "checkBox" + (i + 1);
                inde[i] = 0;
                int resID = getResources().getIdentifier(che_id, "id", getPackageName());
                che[i] = ((CheckBox) findViewById(resID));
                che[i].setVisibility(view.VISIBLE);
                che[i].setText(s2[i]);

            }

            Button ctn_btn1=(Button) findViewById(R.id.ctn_btn1);
            Button ctn_btn2=(Button) findViewById(R.id.ctn_btn2);
            ctn_btn1.setVisibility(view.INVISIBLE);
            ctn_btn2.setVisibility(view.VISIBLE);

        }
    }



    public void contin_btn2(View view) {

        String Symp[] = {"Headache", "Breathlessness", "Sore throat", "Sleeplessness", "Viral", "Fainting", "loss of taste and smell", "Red Rash", "Sneezing", "Dry cough", "Swollen tummy", "Feeling weak", "Muscle and joint pain", "Urinate more often", "Urine in blood"};

        String diseases[][]={{"Commom cold","Bronchitis","Flu"},
                {"asthma","bronchitis","pneumonia","pneumothorax","anemia","lung cancer","inhalation injury","pulmonary embolism","anxiety","COPD","arrhythmia","allergic reaction","anaphylaxis","subglottic stenosis","interstitial lung disease"},
                {"Common cold","Flu","Mono (mononucleosis)","Measles","Chickenpox","COVID-19","Croup","Allergies","Dryness","Gastroesophageal reflux","Irritants","Muscle strain","HIV infection,tumors"},
                {"Rheumatoid","arthritis","osteoarthritis"},
                {"Chickenpox","Flu","Herpes","Human immunodeficiency virus","Human papillomavirus","Infectious mononucleosis","Mumps","measles and rubella","Shingles","Viral gastroenteritis (stomach flu)","Viral hepatitis","Viral meningitis","Viral pneumonia"},
                {"irregular heart beats","seizures","low blood sugar","anemia","low blood pressure"},
                {"Obesity","Diabetes","High blood pressure","Poor nutrition","Parkinson disease","Alzheimer disease","Multiple sclerosis","Common Cold","Flu","Head injury","Hormone changes","Dental or mouth problems","Nasal polyps","Exposure to certain chemicals","Certain medicines","Exposure to radiation therapy","Cocaine snorted through the nose","Cigarette smoking"},
                {"rubella","chickenpox","mononucleosis","roseola","hand, foot, and mouth disease","fifth disease","Zika virus","West Nile virus","dengue fever"},
                {"Common cold","flu","Other respiratory tract infections","Sinusitis"},
                {"asthma","lung infection","lung cancer","acute sinusitis","chronic sinusitis","bronchitis","cystic fibrosis","emphysema","laryngitis","pertussis (whooping cough)","COPD","heart failure","croup","tuberculosis","idiopathic pulmonary fibrosis (IPF)"},
                {"Chronic gut disorders","irritable bowel syndrome (IBS)","Crohns disease","Dengue"},
                {"the flu","thyroid disease","anemia","depression or anxiety","a lack of sleep","poorly managed or undiagnosed diabetes","congestive heart failure","vitamin B-12 deficiency"},
                {"Adult Still's disease","Ankylosing spondylitis","Avascular necrosis","Bone cancer","Broken bone","Bursitis (joint inflammation)","Complex regional pain syndrome","Disloca","Leukemia","Lupus","Lyme disease","Osteoarthritis","Osteomyelitis (a bone infection)","Pagets disease of bone","Polymyalgia rheumatica","Pseudogout","Psoriatic arthritis","Reactive arthritis","Rheumatic fever","Rheumatoid arthritis","Rickets","Sarcoidosis","Septic arthritis","Sprains","Tendinitis"},
                {"Anterior prolapse (cystocele)","Anxiety disorders","Benign prostatic hyperplasia (BPH)","Bladder stones","Change in kidney function","Diabetes insipidus","Diuretics","Excess consumption of total fluids, alcohol or caffeine"},
                {"Urinary tract or kidney infections","Bladder or kidney stones","inflammation in the filtering system (glomerulonephritis)","An enlarged prostate (benign prostatic hyperplasia) or prostate cancer","Inherited diseases such as sickle cell anemia and cystic kidney disease","Certain medications such as aspirin, cyclophosphamide, heparin, and penicillin","Cancer in your bladder or kidney","A kidney injury from an accident or sports","Vigorous exercise"}};


        CheckBox[] che = new CheckBox[100];
        String disease_results[] = new String[100];
        int result_count[] = new int[100];

        for (int i = 0; i < 100; i++) {
            result_count[i] = 1;
            if(i<20 && i>=count)
            selected_1[i]="";
        }
        //-----------------Stores the symptoms in an array disease_results--------------
        for (int i = 0; i < ff; i++) {
            String che_id = "checkBox" + (i + 1);
            int resID = getResources().getIdentifier(che_id, "id", getPackageName());
            che[i] = ((CheckBox) findViewById(resID));
            if (che[i].isChecked()) {
                selected_1[count] = selected_1[count] + che[i].getText();
                count++;
            }
        }
        if (count > 10) {
            Toast toast = Toast.makeText(getApplicationContext(), "Selections getting out of Limit(10)", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            int f = -1;          // int to keep count of disease in s array
            Log.i("Step 2.1", "Successful");
            Log.i("St", "count= "+count);



            //----------------collects the diseases according to the symptoms and stores them in array s------------------
            for (int i = 0; i < count; i++) {
                Log.i("Check1","yes");
                for (int m = 0; m < 15; m++) {
                    Log.i("Check2","yes"+selected_1[i]+"      and   "+Symp[m]);

                    if (selected_1[i].equalsIgnoreCase(Symp[m])) {
                        Log.i("m", "m= "+m+"   i=   "+i);

                        for (int j = 0; j < diseases[m].length; j++) {
                            int flag = 0;
                            int pos = 0;
                            for (int k = 0; k < f; k++) {
                                if (diseases[m][j].equalsIgnoreCase(disease_results[k])) {
                                    flag = 1;
                                    pos = k;
                                }
                            }
                            Log.i("St", "f= "+f+"   "+flag);
                            Log.i("Stepss", "Succ" + f + "    " + m + "   " + j);
                            if (flag == 0) {
                                f+=1;
                                disease_results[f] = diseases[m][j];
                            } else {
                                result_count[pos] += 1;
                            }
                        }
                    }
                }
            }
            Log.i("Step 2.2", "Successful");


            for (int i = 0; i < f; i++) {
                Log.i("ddd", "is " + disease_results[i] + "    " + result_count[i]);
            }
            Log.i("Step 2.3", "en    f="+f);




            Bundle b=new Bundle();
            b.putStringArray("Result array", disease_results);
            b.putIntArray("Result count",result_count);

            Intent intent=new Intent(getApplicationContext(),Result_window.class);
            intent.putExtras(b);
            intent.putExtra("Index", f);
            startActivity(intent);
            finish();
        }
    }






        /*

*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_selection_window);
    }
}