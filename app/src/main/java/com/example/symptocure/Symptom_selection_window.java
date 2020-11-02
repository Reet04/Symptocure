package com.example.symptocure;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Symptom_selection_window extends AppCompatActivity {

    public void contin_btn(View view) {

        String Symp[] ={"Headache","Breathlessness","Sore throat","Sleeplessness","Viral","Fainting","loss of taste and smell","Red Rash","Sneezing","Dry cough","Swollen tummy","Feeling weak","Muscle and joint pain","Urinate more often","Urine in blood"};

        String diseases[][]={{"Commom cold","Bronchitis","Flu"},
                {"asthma","bronchitis","pneumonia","pneumothorax","anemia","lung cancer","inhalation injury","pulmonary embolism","anxiety","COPD","arrhythmia","allergic reaction","anaphylaxis","subglottic stenosis","interstitial lung disease"},
                {"Common cold","Flu (influenza)","Mono (mononucleosis)","Measles","Chickenpox","COVID-19","Croup","Allergies","Dryness","Gastroesophageal reflux(GERD)","Irritants","Muscle strain","HIV infection,tumors"},
                {"Rheumatoid","arthritis","osteoarthritis"},
                {"Chickenpox","Flu (influenza)","Herpes","Human immunodeficiency virus (HIV/AIDS)","Human papillomavirus (HPV)","Infectious mononucleosis","Mumps","measles and rubella","Shingles","Viral gastroenteritis (stomach flu)","Viral hepatitis","Viral meningitis","Viral pneumonia"},
                {"irregular heart beats","seizures","low blood sugar","anemia","low blood pressure"},
                {"Obesity","Diabetes","High blood pressure","Poor nutrition","Parkinson disease","Alzheimer disease","Multiple sclerosis","Illness such as cold or flu, sinus infection, and allergies","Head injury","Hormone changes","Dental or mouth problems","Nasal polyps","Exposure to certain chemicals","Certain medicines","Exposure to radiation therapy","Cocaine snorted through the nose","Cigarette smoking"},
                {"rubella","chickenpox","mononucleosis","roseola","hand, foot, and mouth disease","fifth disease","Zika virus","West Nile virus","dengue fever"},
                {"Common cold","Influenza (flu)","Other respiratory tract infections","Sinusitis"},
                {"lung infection","lung cancer","acute sinusitis","chronic sinusitis","bronchiolitis","cystic fibrosis","emphysema","laryngitis","pertussis (whooping cough)","COPD","heart failure","croup","tuberculosis","idiopathic pulmonary fibrosis (IPF)"},
                {"Chronic gut disorders","irritable bowel syndrome (IBS)","Crohns disease","Dengue"},
                {"the flu","thyroid disease","anemia","depression or anxiety","a lack of sleep","poorly managed or undiagnosed diabetes","congestive heart failure","vitamin B-12 deficiency"},
                {"Adult Still's disease","Ankylosing spondylitis","Avascular necrosis","Bone cancer","Broken bone","Bursitis (joint inflammation)","Complex regional pain syndrome","Disloca","Leukemia","Lupus","Lyme disease","Osteoarthritis","Osteomyelitis (a bone infection)","Pagets disease of bone","Polymyalgia rheumatica","Pseudogout","Psoriatic arthritis","Reactive arthritis","Rheumatic fever","Rheumatoid arthritis","Rickets","Sarcoidosis","Septic arthritis","Sprains","Tendinitis"},
                {"Anterior prolapse (cystocele)","Anxiety disorders","Benign prostatic hyperplasia (BPH)","Bladder stones","Change in kidney function","Diabetes insipidus","Diuretics (water retention relievers)","Excess consumption of total fluids, alcohol or caffeine"},
                {"Urinary tract or kidney infections","Bladder or kidney stones","inflammation in the filtering system (glomerulonephritis)","An enlarged prostate (benign prostatic hyperplasia) or prostate cancer","Inherited diseases such as sickle cell anemia and cystic kidney disease","Certain medications such as aspirin, cyclophosphamide, heparin, and penicillin","Cancer in your bladder or kidney","A kidney injury from an accident or sports","Vigorous exercise"}};


        String disease_list[] = {"Common cold","Bronchitis","Asthma","Low blood pressure","High blood pressure","Dengue","Flu","Pneumonia","Anemia","Chickenpox","Diabetes","Brest cancer","Chest pain","Diarrhoea","Food Poisoning"};

        String symptom_2d[][]={
                {"a blocked or runny nose","a sore throat","headaches","muscle aches","coughs","sneezing","a raised temperature","pressure in your ears and face","loss of taste and smell"},
                {"a sore throat","a headache","a runny or blocked nose","aches and pains","tiredness"},
                {"wheezing (a whistling sound when breathing)","breathlessness","a tight chest – it may feel like a band is tightening around it","coughing"},
                {"lightheadedness or dizziness","feeling sick","blurred vision","generally feeling weak","confusion","fainting"},
                {"tiredness","swollen ankles, feet or hands (due to water retention)","shortness of breath","blood /or protein in your urine","urinating more often, particularly at night (nocturia)","itchy skin"},
                {"a high temperature, or feeling hot or shivery","a severe headache","pain behind the eyes","muscle and joint pain","feeling or being sick","a widespread red rash","tummy pain and loss of appetite","severe tummy pain","a swollen tummy","being sick repeatedly and vomiting blood","bleeding gums or bleeding under the skin","breathing difficulties or fast breathing","cold","clammy skin","a weak but fast pulse","drowsiness or loss of consciousness"},
                {"a sudden fever – a temperature of 38C or above","an aching body","feeling tired or exhausted","a dry cough","a sore throat","a headache","difficulty sleeping","loss of appetite","diarrhoea or tummy pain","feeling sick and being sick"},
                {"a cough – which may be dry, or produce thick yellow, green, brown or blood-stained mucus (phlegm)","difficulty breathing – your breathing may be rapid and shallow, and you may feel","breathless, even when resting","rapid heartbeat","high temperature","feeling generally unwell","sweating and shivering","loss of appetite","chest pain – which gets worse when breathing or coughing","coughing up blood (haemoptysis)","headaches","fatigue","feeling sick or being sick","wheezing","joint and muscle pain","feeling confused and disorientated, particularly in elderly people"},
                {"tiredness and lack of energy","shortness of breath","noticeable heartbeats (heart palpitations)","pale skin"},
                {"a high temperature above 38C","aches and pains, and generally feeling unwell","loss of appetite"},
                {"feeling very thirsty","peeing more frequently than usual, particularly at night","feeling very tired","weight loss and loss of muscle bulk","itching around the penis or vagina, or frequent episodes of thrush","cuts or wounds that heal slowly","blurred vision"},
                {"a lump or area of thickened tissue in either breast","a change in the size or shape of one or both breast","discharge from either of your nipples (which may be streaked with blood)","a lump or swelling in either of your armpits","dimpling on the skin of your breasts","a rash on or around your nipple","a change in the appearance of your nipple such as becoming sunken into your breast" },
                {"a persistent cough","coughing up yellow or green phlegm (thick mucus), or coughing up blood","breathlessness or rapid and shallow breathing","wheezing","a high temperature (fever)","a rapid heartbeat","chest pain or tightness","feeling confused and disorientated"},
                {"stomach cramps","nausea and vomiting","headache","loss of appetite"},
                {"feeling sick (nausea)","vomiting","diarrhoea, which may contain blood or mucus","stomach cramps and abdominal pain","a lack of energy and weakness","loss of appetite","a high temperature (fever)","aching muscles","chills"},
        };

        int inde[]=new int[100];
        String sa="";
        String selected_1[]=new String[10];
        int count=0;
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
            }
            Log.i("Step 3", "Successful");

            //--------------update the symptoms in the new array s2------------------------
            String s2[] = new String[100];
            int ff = 0;
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < 15; j++) {
                    if (s[i].equalsIgnoreCase(disease_list[j])) {
                        for (int k = 0; k < symptom_2d[j].length; k++) {
                            s2[ff] = symptom_2d[j][k];
                            ff++;
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
        }
    }









        /*
        Intent intent=new Intent(getApplicationContext(),Symptom_selection_2.class);
        intent.putExtra("Index_array", inde);
        startActivity(intent);
        finish();
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_selection_window);
    }
}