package com.example.matcha_memoapp_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OptionActivity extends AppCompatActivity {

    FloatingActionButton toMemoBt;
    FloatingActionButton toPointBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        // 画面要素を取得
        toMemoBt = findViewById(R.id.toMemoBt);
        toPointBt = findViewById(R.id.toPointBt);

        toMemoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionActivity.this,MemoActivity.class);
                startActivity(intent);
            }
        });

        toPointBt.setOnClickListenegnew View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionActivity.this,PointAddActivity.class);
                startActivity(intent);
            }
        });

    }
}