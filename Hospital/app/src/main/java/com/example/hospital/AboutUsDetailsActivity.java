package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUsDetailsActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_details);

        tv1 = findViewById(R.id.textViewA1);
        tv2 = findViewById(R.id.textViewA2);
        tv3 = findViewById(R.id.textViewA3);
        img = findViewById(R.id.imageViewAbD);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("text1");
            img.setImageResource(resId);
        }

        Intent intent = getIntent();
        tv1.setText(intent.getStringExtra("text2"));
        tv2.setText(intent.getStringExtra("text3"));
        tv3.setText(intent.getStringExtra("text4"));


    }
}