package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class FrameActivity extends AppCompatActivity {
    FrameLayout frame = null;
    Handler handler = new Handler()
    {
        int i=0;
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0x123) {
                i++;
                move(i % 5);
            }
            super.handleMessage(msg);
        }
    };
    void move(int i)
    {
        Drawable a = getDrawable(R.drawable.a1);
        Drawable b = getDrawable(R.drawable.a2);
        Drawable c = getDrawable(R.drawable.a3);
        Drawable d = getDrawable(R.drawable.a4);
        Drawable e = getDrawable(R.drawable.a5);
        switch(i)
        {
            case 0:
                frame.setForeground(a);
                break;
            case 1:
                frame.setForeground(b);
                break;
            case 2:
                frame.setForeground(c);
                break;
            case 3:
                frame.setForeground(d);
                break;
            case 4:
                frame.setForeground(e);
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
        Button back3 = (Button) findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });
        frame = (FrameLayout)findViewById(R.id.framelayout);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,300);
    }
}
