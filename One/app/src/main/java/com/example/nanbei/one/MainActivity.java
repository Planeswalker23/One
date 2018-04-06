package com.example.nanbei.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在第一次创建活动时调用
        ImageButton PictureButton;
        Button CalendarButton;
        Button MusicButton;

        //获取ImageButton对象
        PictureButton = (ImageButton) findViewById(R.id.PictureButton);
        //获取Button对象
        CalendarButton = (Button) findViewById(R.id.bt_calendar);
        MusicButton = (Button) findViewById(R.id.button);

        //获取当前年月日
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        //更新CalendarButton按钮文字为当前时间年月日
        CalendarButton.setText(year + "    /    " + month + "    /    " + day);

        //设置事件监听
        PictureButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, Word.class);
                startActivity(it);
                finish();
            }
        });
        CalendarButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, RiLi.class);
                startActivity(it);
                finish();
            }
        });
        MusicButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(MainActivity.this, Music.class);
                startActivity(it);
                finish();
            }
        });
    }
}
