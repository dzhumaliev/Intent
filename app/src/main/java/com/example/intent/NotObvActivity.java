package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class NotObvActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_obv);

        Intent intent = getIntent();
        if (intent != null){
            String text = intent.getStringExtra(Intent.EXTRA_TEXT);
            Log.d("ololo", text);
        }
    }
}
