package com.example.matcha_memoapp_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PointAddActivity extends AppCompatActivity {


    private static final String[] foods={
            "1pt","10pt","6pt","13pt","1pt","10pt","6pt","13pt"
    };


    // 画面要素
    ListView LV;
    FloatingActionButton toOtherBt;
    FloatingActionButton toMemoBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_add);

        // 画面要素を取得
        LV=(ListView) findViewById(R.id.lv);
        toOtherBt = findViewById(R.id.toOtherBt);
        toMemoBt = findViewById(R.id.toMemoBt);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        LV.setAdapter(arrayAdapter);

        toOtherBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PointAddActivity.this, OptionActivity.class);
                startActivity(intent);
            }
        });

        toMemoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PointAddActivity.this,MemoActivity.class);
                startActivity(intent);
            }
        });


    }
}