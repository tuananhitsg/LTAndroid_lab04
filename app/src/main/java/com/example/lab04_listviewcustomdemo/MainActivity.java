package com.example.lab04_listviewcustomdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent layoutA = new Intent(MainActivity.this, Layout4aActivity.class);
                startActivity(layoutA);
                break;
            case R.id.button2:
                Intent layoutB = new Intent(MainActivity.this, Layout4bActivity.class);
                startActivity(layoutB);
                break;
        }
    }
}