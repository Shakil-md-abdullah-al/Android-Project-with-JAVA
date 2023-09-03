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

public class AboutUsActivity extends AppCompatActivity {

    private String[][] aboutus =
            {
                    {"Md Abdullah Al Shakil","Email : shakil3300bd@gmail.com","Contact : 01517868256","Details"},
                    {"Md Nahid Hasan","Email : nahid2887@gmail.com","Contact : 01726930828","Details"},
                    {"Sabbir Ahamed","Email : mdsabbirahamed187@gmail.com","Contact : 01989621322","Details"},
                            {"Md Khaled Mahmud ","Email : khaledmahmud821@gmail.com","Contact : 01794300754","Details"},
                            {"Afia Anzum Emul","Email : emuafiya@gmail.com","Contact : 01545726345","Details"},
            };

    private  int[] about_images ={
            R.drawable.shakil,
            R.drawable.nahid,
            R.drawable.sabbir,
            R.drawable.shovon,
            R.drawable.h5
    };

    TextView tv;
//    String [][] abou_us = {};
    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        lst = findViewById(R.id.listViewAb);

        list = new ArrayList();
        for (int i = 0; i<aboutus.length; i++) {
            item = new HashMap<String, String>();
            item.put("line1", aboutus[i][0]);
            item.put("line2", aboutus[i][3]);
            list.add(item);
        }
        sa = new SimpleAdapter(this, list,
                R.layout.about,
                new String[]{"line1","line2"},
                new int[]{R.id.line_a,R.id.line_b}
        );
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(AboutUsActivity.this,AboutUsDetailsActivity.class);
                it.putExtra("text1",about_images[i]);
                it.putExtra("text2",aboutus[i][0]);
                it.putExtra("text3",aboutus[i][1]);
                it.putExtra("text4",aboutus[i][2]);
                startActivity(it);
            }
        });
    }
}