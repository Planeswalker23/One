package com.example.nanbei.one;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by nanbei on 2017/12/16.
 */

public class Word extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_word);

        //在第一次创建活动时调用
        Button back;

        //获取ImageButton对象
        back =(Button)findViewById(R.id.back);

        //设置事件监听
        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent();
                it.setClass(Word.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
}
