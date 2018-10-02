package com.example.baidu2018.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_puffer extends AppCompatActivity {
    TextView tv_client_id,tv_say,tv_word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_client_id = findViewById(R.id.tv_client_id);
        tv_say = findViewById(R.id.tv_say);
        tv_word = findViewById(R.id.tv_word);
        String clientId = BuildConfig.CLIENT_ID;
        String say = BuildConfig.SAY;
        String word = BuildConfig.WORD;
        tv_client_id.setText(clientId);
        tv_say.setText(say);
        tv_word.setText(word);
        android.widget.Toast.makeText(this, "lallalalallala", Toast.LENGTH_SHORT).show();

    }
}
