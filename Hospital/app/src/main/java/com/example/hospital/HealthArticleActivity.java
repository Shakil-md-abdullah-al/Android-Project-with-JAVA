package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class HealthArticleActivity extends AppCompatActivity {

    private String[][] health_details =
            {
                    {"Walking Daily","Click More Details"},
                    {"Home Care of COVID-19","Click More Details"},
                    {"Stop Smoking","Click More Details"},
                    {"Healthy GUT","Click More Details"},
                    {"Human Phycology and enviornment","Click More Details"},
                    {"Early rising","Click More Details"}
            };

    private String[][] desc =
            {
                    {"Walking is a simple and accessible form of exercise that holds remarkable health benefits. Incorporating a daily walking routine into your lifestyle can have a profound impact on your physical and mental well-being. Whether you stroll through a park, walk to work, or take a brisk evening walk, dedicating just 30 minutes to walking each day can make a world of difference.\n" +
                            "\n" +
                            "First and foremost, walking is an excellent cardiovascular exercise. It strengthens the heart, improves blood circulation, and lowers the risk of heart disease and stroke. Regular walking also aids in maintaining a healthy weight, as it burns calories and boosts metabolism. Moreover, it enhances muscle tone, particularly in the legs and buttocks, while promoting bone density and reducing the risk of osteoporosis.\n" +
                            "\n" +
                            "Beyond the physical benefits, daily walking has significant mental health advantages. It releases endorphins, the \"feel-good\" hormones, which can alleviate stress, anxiety, and depression. Walking outdoors allows for exposure to sunlight, which aids in the production of Vitamin D, further contributing to mood enhancement.\n" +
                            "\n" +
                            "Additionally, walking fosters better sleep patterns and cognitive function, enhancing memory and creativity. It provides an opportunity to connect with nature, promoting mindfulness and reducing mental fatigue.\n" +
                            "\n" +
                            "In conclusion, incorporating a daily walking routine is a simple yet powerful step towards a healthier and happier life. So put on your walking shoes, step outside, and reap the countless rewards that walking has to offer. Your body and mind will thank you for it!"},
                    {"Walking is a simple and accessible form of exercise that holds remarkable health benefits. Incorporating a daily walking routine into your lifestyle can have a profound impact on your physical and mental well-being. Whether you stroll through a park, walk to work, or take a brisk evening walk, dedicating just 30 minutes to walking each day can make a world of difference.\n" +
                            "\n" +
                            "First and foremost, walking is an excellent cardiovascular exercise. It strengthens the heart, improves blood circulation, and lowers the risk of heart disease and stroke. Regular walking also aids in maintaining a healthy weight, as it burns calories and boosts metabolism. Moreover, it enhances muscle tone, particularly in the legs and buttocks, while promoting bone density and reducing the risk of osteoporosis.\n" +
                            "\n" +
                            "Beyond the physical benefits, daily walking has significant mental health advantages. It releases endorphins, the \"feel-good\" hormones, which can alleviate stress, anxiety, and depression. Walking outdoors allows for exposure to sunlight, which aids in the production of Vitamin D, further contributing to mood enhancement.\n" +
                            "\n" +
                            "Additionally, walking fosters better sleep patterns and cognitive function, enhancing memory and creativity. It provides an opportunity to connect with nature, promoting mindfulness and reducing mental fatigue.\n" +
                            "\n" +
                            "In conclusion, incorporating a daily walking routine is a simple yet powerful step towards a healthier and happier life. So put on your walking shoes, step outside, and reap the countless rewards that walking has to offer. Your body and mind will thank you for it!"},
                    {"Walking is a simple and accessible form of exercise that holds remarkable health benefits. Incorporating a daily walking routine into your lifestyle can have a profound impact on your physical and mental well-being. Whether you stroll through a park, walk to work, or take a brisk evening walk, dedicating just 30 minutes to walking each day can make a world of difference.\n" +
                            "\n" +
                            "First and foremost, walking is an excellent cardiovascular exercise. It strengthens the heart, improves blood circulation, and lowers the risk of heart disease and stroke. Regular walking also aids in maintaining a healthy weight, as it burns calories and boosts metabolism. Moreover, it enhances muscle tone, particularly in the legs and buttocks, while promoting bone density and reducing the risk of osteoporosis.\n" +
                            "\n" +
                            "Beyond the physical benefits, daily walking has significant mental health advantages. It releases endorphins, the \"feel-good\" hormones, which can alleviate stress, anxiety, and depression. Walking outdoors allows for exposure to sunlight, which aids in the production of Vitamin D, further contributing to mood enhancement.\n" +
                            "\n" +
                            "Additionally, walking fosters better sleep patterns and cognitive function, enhancing memory and creativity. It provides an opportunity to connect with nature, promoting mindfulness and reducing mental fatigue.\n" +
                            "\n" +
                            "In conclusion, incorporating a daily walking routine is a simple yet powerful step towards a healthier and happier life. So put on your walking shoes, step outside, and reap the countless rewards that walking has to offer. Your body and mind will thank you for it!"},
                    {"Walking is a simple and accessible form of exercise that holds remarkable health benefits. Incorporating a daily walking routine into your lifestyle can have a profound impact on your physical and mental well-being. Whether you stroll through a park, walk to work, or take a brisk evening walk, dedicating just 30 minutes to walking each day can make a world of difference.\n" +
                            "\n" +
                            "First and foremost, walking is an excellent cardiovascular exercise. It strengthens the heart, improves blood circulation, and lowers the risk of heart disease and stroke. Regular walking also aids in maintaining a healthy weight, as it burns calories and boosts metabolism. Moreover, it enhances muscle tone, particularly in the legs and buttocks, while promoting bone density and reducing the risk of osteoporosis.\n" +
                            "\n" +
                            "Beyond the physical benefits, daily walking has significant mental health advantages. It releases endorphins, the \"feel-good\" hormones, which can alleviate stress, anxiety, and depression. Walking outdoors allows for exposure to sunlight, which aids in the production of Vitamin D, further contributing to mood enhancement.\n" +
                            "\n" +
                            "Additionally, walking fosters better sleep patterns and cognitive function, enhancing memory and creativity. It provides an opportunity to connect with nature, promoting mindfulness and reducing mental fatigue.\n" +
                            "\n" +
                            "In conclusion, incorporating a daily walking routine is a simple yet powerful step towards a healthier and happier life. So put on your walking shoes, step outside, and reap the countless rewards that walking has to offer. Your body and mind will thank you for it!"},
                    {"Walking is a simple and accessible form of exercise that holds remarkable health benefits. Incorporating a daily walking routine into your lifestyle can have a profound impact on your physical and mental well-being. Whether you stroll through a park, walk to work, or take a brisk evening walk, dedicating just 30 minutes to walking each day can make a world of difference.\n" +
                            "\n" +
                            "First and foremost, walking is an excellent cardiovascular exercise. It strengthens the heart, improves blood circulation, and lowers the risk of heart disease and stroke. Regular walking also aids in maintaining a healthy weight, as it burns calories and boosts metabolism. Moreover, it enhances muscle tone, particularly in the legs and buttocks, while promoting bone density and reducing the risk of osteoporosis.\n" +
                            "\n" +
                            "Beyond the physical benefits, daily walking has significant mental health advantages. It releases endorphins, the \"feel-good\" hormones, which can alleviate stress, anxiety, and depression. Walking outdoors allows for exposure to sunlight, which aids in the production of Vitamin D, further contributing to mood enhancement.\n" +
                            "\n" +
                            "Additionally, walking fosters better sleep patterns and cognitive function, enhancing memory and creativity. It provides an opportunity to connect with nature, promoting mindfulness and reducing mental fatigue.\n" +
                            "\n" +
                            "In conclusion, incorporating a daily walking routine is a simple yet powerful step towards a healthier and happier life. So put on your walking shoes, step outside, and reap the countless rewards that walking has to offer. Your body and mind will thank you for it!"},
                    {"Walking is a simple and accessible form of exercise that holds remarkable health benefits. Incorporating a daily walking routine into your lifestyle can have a profound impact on your physical and mental well-being. Whether you stroll through a park, walk to work, or take a brisk evening walk, dedicating just 30 minutes to walking each day can make a world of difference.\n" +
                            "\n" +
                            "First and foremost, walking is an excellent cardiovascular exercise. It strengthens the heart, improves blood circulation, and lowers the risk of heart disease and stroke. Regular walking also aids in maintaining a healthy weight, as it burns calories and boosts metabolism. Moreover, it enhances muscle tone, particularly in the legs and buttocks, while promoting bone density and reducing the risk of osteoporosis.\n" +
                            "\n" +
                            "Beyond the physical benefits, daily walking has significant mental health advantages. It releases endorphins, the \"feel-good\" hormones, which can alleviate stress, anxiety, and depression. Walking outdoors allows for exposure to sunlight, which aids in the production of Vitamin D, further contributing to mood enhancement.\n" +
                            "\n" +
                            "Additionally, walking fosters better sleep patterns and cognitive function, enhancing memory and creativity. It provides an opportunity to connect with nature, promoting mindfulness and reducing mental fatigue.\n" +
                            "\n" +
                            "In conclusion, incorporating a daily walking routine is a simple yet powerful step towards a healthier and happier life. So put on your walking shoes, step outside, and reap the countless rewards that walking has to offer. Your body and mind will thank you for it!"},
            };

    private  int[] images ={
            R.drawable.h1,
            R.drawable.h2,
            R.drawable.h3,
            R.drawable.h4,
            R.drawable.h5,
            R.drawable.h6,
    };

    HashMap<String, String> item;
    ArrayList list;
    SimpleAdapter sa;
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_article);
        lst = findViewById(R.id.listViewHA);

        list = new ArrayList();
        for (int i = 0; i<health_details.length; i++) {
            item = new HashMap<String, String>();
            item.put("line1", health_details[i][0]);
            item.put("line2", health_details[i][1]);
            list.add(item);
        }
        sa = new SimpleAdapter(this, list,
                R.layout.buymedicine,
                new String[]{"line1","line2"},
                new int[]{R.id.line_a,R.id.line_b}
        );
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(HealthArticleActivity.this,HealthArticleDetailsActivity.class);
                it.putExtra("text1",health_details[i][0]);
                it.putExtra("text2",images[i]);
                it.putExtra("text3",desc[i][0]);
                startActivity(it);
            }
        });
    }
}