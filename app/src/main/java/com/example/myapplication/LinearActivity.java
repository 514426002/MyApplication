package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        Button Linear1 = (Button) findViewById(R.id.linear1);
        Button Linear2 = (Button) findViewById(R.id.linear2);
        Button Linear3 = (Button) findViewById(R.id.linear3);
        final LinearLayout Lin = (LinearLayout) findViewById(R.id.linearlayout);
        Button back1 = (Button) findViewById(R.id.back1);
        Linear1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Lin.setGravity(Gravity.CENTER);
                Lin.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        Linear2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Lin.setGravity(Gravity.CENTER);
                Lin.setOrientation(LinearLayout.VERTICAL);
            }
        });
        Linear3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Lin.setGravity(Gravity.LEFT);
                Lin.setGravity(Gravity.CENTER_VERTICAL);
            }
        });
        back1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
