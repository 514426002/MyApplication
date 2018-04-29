package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        Button Linear = (Button) findViewById(R.id.Linear);
        Button Relative = (Button) findViewById(R.id.Relative) ;
        Button Frame = (Button) findViewById(R.id.Frame) ;
        Button Table = (Button) findViewById(R.id.Table) ;
        Button Grid = (Button) findViewById(R.id.Grid) ;
        Linear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent);
            }
        });
        Relative.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent);
            }
        });
        Frame.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(intent);
            }
        });
        Table.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(intent);
            }
        });
        Grid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(intent);
            }
        });
    }
}
