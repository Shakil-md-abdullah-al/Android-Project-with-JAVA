package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailActivity extends AppCompatActivity {

    private String[][] doctor_details1 =
            {
                    {"Doctor Name: Dr. Walid Hossain","Address: 2/3 Ring Road Golden Street","Description:A dedicated family physician, fosters strong doctor-patient relationships. His holistic approach ensures comprehensive care for all ages, promoting wellness through preventive strategies and lifestyle guidance","Exp : 5 Years", "Mobile : 01989878987","800","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Habib Reza","Address: 5/3 Rupnagor Mirpur2,Dhaka,","Description: A compassionate family doctor, provides a comforting haven for families. With open communication, she empowers patients to make informed health choices, building a foundation for long-term vitality.","Exp : 5 Years", "Mobile : 01989878987","600","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Tarin Afroz","Address: 2/5 Ring Road Golden Street","Description:A versatile family physician, adeptly balances acute care and chronic disease management. His expertise in multiple specialties ensures families receive tailored medical solutions under one roof.","Exp : 5 Years", "Mobile : 01989878987","500","Schedule Day : Sunday,Tuesday,Wednesday","Time : 01:00PM to 05:00 PM"},
                    {"Doctor Name:Dr. Avishek Kndu","Address:  Faridpur Medicale collage","Description:A nurturing family doctor, navigates generations with grace. Her empathetic demeanor creates a supportive atmosphere, where patients find solace in her guidance for physical and emotional well-being.","Exp : 5 Years", "Mobile : 01989878987","900","Schedule Day : Friday,Monday,Thrusday","Time : 01:00PM to 05:00 PM"},
                    {"Doctor Name: Dr. Arafat Hoaasin","Address: Rupnagor Mirpur2,Dhaka ","Description:A community-focused family physician, advocates for local health initiatives. Beyond medical treatment, his commitment to education and outreach strengthens families, fostering a healthier, united neighborhood.","Exp : 5 Years", "Mobile : 01989878987","1000","Schedule Day : Friday,Satarday,Thrusday","Time : 10:00 AM to 01:00PM"},
            };

    private String[][] doctor_details2 =
            {
                    {"Doctor Name: Dr. Zaman Hossain","Address: 2/3 Ring Road Golden Street","Description:A dedicated family physician, fosters strong doctor-patient relationships. His holistic approach ensures comprehensive care for all ages, promoting wellness through preventive strategies and lifestyle guidance","Exp : 5 Years", "Mobile : 01989878987","800","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Habib Reza","Address: 5/3 Rupnagor Mirpur2,Dhaka,","Description: A compassionate family doctor, provides a comforting haven for families. With open communication, she empowers patients to make informed health choices, building a foundation for long-term vitality.","Exp : 5 Years", "Mobile : 01989878987","600","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Sadia Islam","Address: 2/5 Ring Road Golden Street","Description:A versatile family physician, adeptly balances acute care and chronic disease management. His expertise in multiple specialties ensures families receive tailored medical solutions under one roof.","Exp : 5 Years", "Mobile : 01989878987","500","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name:Dr. Avishek Kndu","Address:  Faridpur Medicale collage","Description:A nurturing family doctor, navigates generations with grace. Her empathetic demeanor creates a supportive atmosphere, where patients find solace in her guidance for physical and emotional well-being.","Exp : 5 Years", "Mobile : 01989878987","900","Schedule Day : Sunday,Tuesday,Wednesday","Time : 01:00PM to 05:00 PM"},
                    {"Doctor Name: Dr. Afzal Hoaasin","Address: Rupnagor Mirpur2,Dhaka ","Description:A community-focused family physician, advocates for local health initiatives. Beyond medical treatment, his commitment to education and outreach strengthens families, fostering a healthier, united neighborhood.","Exp : 5 Years", "Mobile : 01989878987","1000","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
            };

    private String[][] doctor_details3 =
            {
                    {"Doctor Name: Dr. Shamim Hossain","Address: 2/3 Ring Road Golden Street","Description:A dedicated family physician, fosters strong doctor-patient relationships. His holistic approach ensures comprehensive care for all ages, promoting wellness through preventive strategies and lifestyle guidance","Exp : 5 Years", "Mobile : 01989878987","800","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Habib Reza","Address: 5/3 Rupnagor Mirpur2,Dhaka,","Description: A compassionate family doctor, provides a comforting haven for families. With open communication, she empowers patients to make informed health choices, building a foundation for long-term vitality.","Exp : 5 Years", "Mobile : 01989878987","600","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Meherin Afroz","Address: 2/5 Ring Road Golden Street","Description:A versatile family physician, adeptly balances acute care and chronic disease management. His expertise in multiple specialties ensures families receive tailored medical solutions under one roof.","Exp : 5 Years", "Mobile : 01989878987","500","Schedule Day : Friday,Satarday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name:Dr. Sumon Kndu","Address:  Faridpur Medicale collage","Description:A nurturing family doctor, navigates generations with grace. Her empathetic demeanor creates a supportive atmosphere, where patients find solace in her guidance for physical and emotional well-being.","Exp : 5 Years", "Mobile : 01989878987","900","Schedule Day : Friday,Satarday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Arafat Hoaasin","Address: Rupnagor Mirpur2,Dhaka ","Description:A community-focused family physician, advocates for local health initiatives. Beyond medical treatment, his commitment to education and outreach strengthens families, fostering a healthier, united neighborhood.","Exp : 5 Years", "Mobile : 01989878987","1000","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
            };

    private String[][] doctor_details4 =
            {
                    {"Doctor Name: Dr. Sagor Ahamed","Address: 2/3 Ring Road Golden Street","Description:A dedicated family physician, fosters strong doctor-patient relationships. His holistic approach ensures comprehensive care for all ages, promoting wellness through preventive strategies and lifestyle guidance","Exp : 5 Years", "Mobile : 01989878987","800","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Nobin Ahamed","Address: 5/3 Rupnagor Mirpur2,Dhaka,","Description: A compassionate family doctor, provides a comforting haven for families. With open communication, she empowers patients to make informed health choices, building a foundation for long-term vitality.","Exp : 5 Years", "Mobile : 01989878987","600","Schedule Day : Sunday,Tuesday,Wednesday","Time : 01:00PM to 05:00 PM"},
                    {"Doctor Name: Dr. Tarin Afroz","Address: 2/5 Ring Road Golden Street","Description:A versatile family physician, adeptly balances acute care and chronic disease management. His expertise in multiple specialties ensures families receive tailored medical solutions under one roof.","Exp : 5 Years", "Mobile : 01989878987","500","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name:Dr. Oishi Ahamed","Address:  Faridpur Medicale collage","Description:A nurturing family doctor, navigates generations with grace. Her empathetic demeanor creates a supportive atmosphere, where patients find solace in her guidance for physical and emotional well-being.","Exp : 5 Years", "Mobile : 01989878987","900","Schedule Day : Friday,Satarday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Arafat Hoaasin","Address: Rupnagor Mirpur2,Dhaka ","Description:A community-focused family physician, advocates for local health initiatives. Beyond medical treatment, his commitment to education and outreach strengthens families, fostering a healthier, united neighborhood.","Exp : 5 Years", "Mobile : 01989878987","1000","Schedule Day : Friday,Satarday,Thrusday","Time : 10:00 AM to 01:00PM"},
            };

    private String[][] doctor_details5 =
            {
                    {"Doctor Name: Dr. Nisat ","Address: 2/3 Ring Road Golden Street","Description:A dedicated family physician, fosters strong doctor-patient relationships. His holistic approach ensures comprehensive care for all ages, promoting wellness through preventive strategies and lifestyle guidance","Exp : 5 Years", "Mobile : 01989878987","800","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Habib Reza","Address: 5/3 Rupnagor Mirpur2,Dhaka,","Description: A compassionate family doctor, provides a comforting haven for families. With open communication, she empowers patients to make informed health choices, building a foundation for long-term vitality.","Exp : 5 Years", "Mobile : 01989878987","600","Schedule Day : Friday,Satarday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name: Dr. Tamanna Afroz","Address: 2/5 Ring Road Golden Street","Description:A versatile family physician, adeptly balances acute care and chronic disease management. His expertise in multiple specialties ensures families receive tailored medical solutions under one roof.","Exp : 5 Years", "Mobile : 01989878987","500","Schedule Day : Sunday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
                    {"Doctor Name:Dr. Avishek Kndu","Address:  Faridpur Medicale collage","Description:A nurturing family doctor, navigates generations with grace. Her empathetic demeanor creates a supportive atmosphere, where patients find solace in her guidance for physical and emotional well-being.","Exp : 5 Years", "Mobile : 01989878987","900","Schedule Day : Sunday,Tuesday,Wednesday","Time : 01:00PM to 05:00 PM"},
                    {"Doctor Name: Dr. Bipul Das","Address: Rupnagor Mirpur2,Dhaka ","Description:A community-focused family physician, advocates for local health initiatives. Beyond medical treatment, his commitment to education and outreach strengthens families, fostering a healthier, united neighborhood.","Exp : 5 Years", "Mobile : 01989878987","1000","Schedule Day : Satarday,Monday,Thrusday","Time : 10:00 AM to 01:00PM"},
            };


    TextView tv;
    String [][] doctor_details = {};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        tv = findViewById(R.id.textViewDDtitle);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physicians")==0)
            doctor_details=doctor_details1;
        else
        if (title.compareTo("Ditesian")==0)
            doctor_details=doctor_details2;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details=doctor_details3;
        else
        if (title.compareTo("Cardiologist")==0)
            doctor_details=doctor_details4;
        else
            doctor_details=doctor_details5;



        list = new ArrayList();
            for (int i = 0; i<doctor_details.length; i++) {
                item = new HashMap<String, String>();
                item.put("line1", doctor_details[i][0]);
                item.put("line2", doctor_details[i][1]);
                item.put("line3", doctor_details[i][2]);
                item.put("line4", doctor_details[i][3]);
                item.put("line5", doctor_details[i][4]);
                item.put("line6", "Fee: " + doctor_details[i][5] + "/=");
                item.put("line7", doctor_details[i][6]);
                item.put("line8", doctor_details[i][7]);
                list.add(item);
            }
        sa = new SimpleAdapter(this, list,
                R.layout.docdel,
                new String[]{"line1","line2","line3","line4","line5","line6","line7","line8"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e,R.id.line_f,R.id.line_g,R.id.line_h}
                );

        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailActivity.this,BookAppopintmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][4]);
                it.putExtra("text5",doctor_details[i][5]);
                it.putExtra("text6",doctor_details[i][6]);
                it.putExtra("text7",doctor_details[i][7]);
                startActivity(it);
            }
        });
    }
}