package com.stone.picasso.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv = findViewById(R.id.iv);
        Picasso.get().load("https://qq.yh31.com/tp/zjbq/201810281602569026.gif").into(iv);
    }
}
