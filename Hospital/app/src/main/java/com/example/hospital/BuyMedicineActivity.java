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

public class BuyMedicineActivity extends AppCompatActivity {

    private String[][] packages =
            {
                    {"Uprise-03","50"},
                    {"HealthVit 200mg Capsul","350"},
                    {"Dolo 650 Tablet","250"},
                    {"Paracitamol 500mg Tablet","220"},
                    {"Tata 1mg Calcium + Vitamin D3","450"},
                    {"Feroina XT Tablet","30"},
                    {"Vitamin B Complex-03","305"},
                    {"Napa Extra","70"},
                    {"Vitamin B Complex-03","350"},
            };

    private String[] package_details = {
            "Building and keeping the bones and Teeth Strong \n"+
                    "Reducing Fat \n"+
                    "Boosting Immunity",
            "Provide relifes from vitamine",
            "Supporting cardiovascular health \n"+
                    "Promoting digestive health",
            "Enhancing brain function \n"+
                    "Improving skin health",
            "Weight management \n"+
                    "Increasing energy levels",
            "Strengthening muscles \n"+
                    "Improving flexibility",
            "Regulating blood sugar levels \n"+
                    "Supporting joint health",
            "Enhancing immune response \n"+
                    "Promoting better sleep",
            "Enhancing brain function \n"+
                    "Improving skin health"
    };

    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    Button btnGoToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_medicine);

        lst = findViewById(R.id.listViewBM);
        btnGoToCart = findViewById(R.id.buttonBMGoToCart);

        btnGoToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BuyMedicineActivity.this,CartBuyMedicineActivity.class));
            }
        });

        list = new ArrayList();
        for (int i=0; i<packages.length; i++){
            item = new HashMap<String, String>();
            item.put("line1",packages[i][0]);
            item.put("line2","Total Cost: "+packages[i][1]);
//            item.put("line3",packages[i][2]);
//            item.put("line4",packages[i][3]);
//            item.put("line5",packages[i][4]);
//            item.put("line6",order_details[i][5]);
            list.add(item);
        }

        sa = new SimpleAdapter(this,list,
                R.layout.buymedicine,
                new String[] {"line1","line2"},
                new int [] {R.id.line_a,R.id.line_b});
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(BuyMedicineActivity.this,BuyMedicineDetailsActivity.class);
                it.putExtra("text1",packages[i][0]);
                it.putExtra("text2",package_details[i]);
                it.putExtra("text3",packages[i][1]);
                startActivity(it);
            }
        });

    }
}