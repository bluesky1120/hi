package com.example.baidu2018.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_client_id,tv_say,tv_word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_client_id = findViewById(R.id.tv_client_id);
        tv_say = findViewById(R.id.tv_say);
        tv_word = findViewById(R.id.tv_word);
        String clientId = BuildConfig.CLIENT_ID;
        String word = BuildConfig.WORD;
        tv_client_id.setText(clientId);
        tv_word.setText(word);
        Toast.makeText(this,"哈哈dd哈哈哈qq哈1",Toast.LENGTH_SHORT).show();
    }

    public String printString(String content){
        return content + "--mainactivity返回添加的";
    }
}
