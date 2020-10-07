package com.example.symptocure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Symptom_selection_window extends AppCompatActivity {


    public void check(String s){

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

    }




    public void contin_btn(View view) {

        int inde[]=new int[100];
        String sa="";
        CheckBox[] che = new CheckBox[100];
        for(int i=0; i<58; i++) {
            String che_id = "checkBox" + (i + 1);
            inde[i]=0;
            int resID = getResources().getIdentifier(che_id, "id", getPackageName());
            che[i] = ((CheckBox) findViewById(resID));
            //che[i].setOnClickListener(this);
            if(che[i].isChecked())
            {
                inde[i]=1;
//                sa=sa+" "+che[i].getText()+i+"   ";
            }
        }
        //Toast.makeText("Here: ","is"sa);

  //      Toast toast=Toast. makeText(getApplicationContext(),sa,Toast. LENGTH_SHORT);
        //toast. setMargin(50,50);
   //     toast.show();
        Intent intent=new Intent(getApplicationContext(),Symptom_selection_2.class);
        intent.putExtra("Index_array", inde);
        startActivity(intent);
        finish();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom_selection_window);





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





    }
}