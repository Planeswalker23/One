package com.example.nanbei.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by nanbei on 2017/12/15.
 */

public class WelCome extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_welcome);

        //在第一次创建活动时调用
        ImageButton Welcome;

        //获取ImageButton对象
        Welcome =(ImageButton)findViewById(R.id.WelcomePage);

        //设置事件监听
        Welcome.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(WelCome.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent();
                it.setClass(WelCome.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        },3*1000);
    }

}
