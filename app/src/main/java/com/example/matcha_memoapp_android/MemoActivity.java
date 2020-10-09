package com.example.matcha_memoapp_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MemoActivity extends AppCompatActivity {

    ListView LV;
    private static final String[] foods = {
            "メモ画面", "あ", "i", "う"
    };

    FloatingActionButton toPointBt;
    FloatingActionButton toOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        // 画面要素を取得
        toPointBt = findViewById(R.id.toPointBt);
        toOther = findViewById(R.id.toOther);

        LV = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        LV.setAdapter(arrayAdapter);

        toPointBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MemoActivity.this, PointAddActivity.class);
                startActivity(intent);
            }
        });

        toOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MemoActivity.this, OptionActivity.class);
                startActivity(intent);
            }
        });

    }
}