package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class GridActivity extends AppCompatActivity
{
    GridLayout gridLayout;
    String [] chars = new String[]
            {
                    "1","2","3",
                    "4","5","6",
                    "7","8","9",
                    "0","+","-",
                    "*","/","=",
            };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        Button back5 = (Button) findViewById(R.id.back5);
        back5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
        gridLayout = (GridLayout) findViewById(R.id.gridlayout);
        for(int i = 0 ; i < chars.length ; i++)
        {
            Button bn = new Button(this);
            bn.setText(chars[i]);
            bn.setTextSize(40);
            bn.setPadding(5,35,5,35);
            GridLayout.Spec rowSpec = GridLayout.spec(i/3);
            GridLayout.Spec columnSpec = GridLayout.spec(i%3);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec , columnSpec);
            params.setGravity(Gravity.FILL);
            gridLayout.addView(bn , params);
        }
    }
}
