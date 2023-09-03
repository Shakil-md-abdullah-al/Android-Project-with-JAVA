package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LabTestActivity extends AppCompatActivity {

    private String[][] packages =
            {
                    {"Package-01 : Full Body Checkup", "","","","","999"},
                    {"Package-02 : Dengue Test", "","","","","999"},
                    {"Package-03 : COVID-19 Check", "","","","","999"},
                    {"Package-04 : Thyroid Check", "","","","","999"},
                    {"Package-05 : X-Ray", "","","","","999"},
            };

    private String [] package_details ={
            "Blood Glucose Fasting \n"+
                    "Complete Hormnons \n"+
                    "Kidny Function Test \n"+
                    "Kidny Function Test \n"+
                    "Kidny Function Test \n"+
                    "Liver Function Test",
            "Dengu Test",
            "COVID-19 Test",
            "Thyroid Check (T3, T4, TSH)",
            "Complete Hemogram \n"+
                    "CRP \n"+
                    "Iron  Studies \n"+
                    "Kideny Function Test \n"+
                    "Vitamin D Test \n"+
                    "Liver FinctionTest \n"+
                    "Lipid Profile"
    };

    HashMap<String,String>item;
    ArrayList list;
    SimpleAdapter sa;

    Button btnGoToCart;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);

        btnGoToCart = findViewById(R.id.buttonLTGoToCart);
        listView = findViewById(R.id.listViewLT);


        list = new ArrayList();
        for (int i =0; i<packages.length; i++){
            item = new HashMap<String, String>();

            item.put("Line1",packages[i][0]);
            item.put("Line2",packages[i][1]);
            item.put("Line3",packages[i][2]);
            item.put("Line4",packages[i][3]);
            item.put("Line5",packages[i][4]);
            item.put("Line6","Total Cost : "+packages[i][5]+"/-");
            list.add(item);
        }

        sa = new SimpleAdapter(this,list,
                R.layout.labtest_lines,
                new String[]{"Line1","Line2","Line3","Line4","Line5","Line6",},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e,R.id.line_f});

        listView.setAdapter(sa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(LabTestActivity.this,LabTestDetailsActivity.class);
                it.putExtra("text1",packages[i][0]);
                it.putExtra("text2",package_details[i]);
                it.putExtra("text3",packages[i][5]);
                startActivity(it);
            }
        });

        btnGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LabTestActivity.this,CartLabActivity.class));
            }
        });

    }
}