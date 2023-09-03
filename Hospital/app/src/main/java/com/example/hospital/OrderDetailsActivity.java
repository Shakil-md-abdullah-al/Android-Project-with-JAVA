package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderDetailsActivity extends AppCompatActivity {

    private String[][] order_details= {};

    HashMap<String,String>item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        lst = findViewById(R.id.listViewOD);


        Database db = new Database(getApplicationContext(),"healthcare",null,1);
        SharedPreferences sharedPreferences = getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("username","").toString();
        ArrayList dbData = db.getOrderDataa(username);


        order_details = new String[dbData.size()][];
        // Assuming you have initialized order_details array with the appropriate size

        for (int i = 0; i < order_details.length; i++) {
            order_details[i] = new String[5];
            String arrData = dbData.get(i).toString();
            String[] strData = arrData.split("\\$"); // Changed the split delimiter to "$"
            order_details[i][0] = strData[0];
            order_details[i][1] = strData[1];

            if (strData.length >= 8) { // Check if there is enough data to access strData[7]
                if (strData[7].equals("medicine")) {
                    //date and time
                    order_details[i][3] = "Date: " + strData[4];
                } else {
                    order_details[i][3] = "Date: " + strData[4] + "Time: " + strData[5];
                }
            } else {
                // Handle the case where strData does not have enough elements
                // You can log an error or set a default value for order_details[i][3]
                order_details[i][3] = "Unknown Delivery";
            }

            order_details[i][2] = "TK. " + strData[6];

            if (strData.length >= 8) { // Check if there is enough data to access strData[7]
                order_details[i][4] ="Order Type: " + strData[7];
            } else {
                // Handle the case where strData does not have enough elements
                // You can log an error or set a default value for order_details[i][4]
                order_details[i][4] = "Unknown";
            }
        }

        list = new ArrayList();
        for (int i=0; i<order_details.length; i++){
            item = new HashMap<String, String>();
            item.put("line1",order_details[i][0]);
            item.put("line2",order_details[i][1]);
            item.put("line3",order_details[i][2]);
            item.put("line4",order_details[i][3]);
            item.put("line5",order_details[i][4]);
//            item.put("line6",order_details[i][5]);
            list.add(item);
        }

        sa = new SimpleAdapter(this,list,
                R.layout.orderpage,
                new String[] {"line1","line2","line3","line4","line5"},
                new int [] {R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e});
        lst.setAdapter(sa);

    }
}