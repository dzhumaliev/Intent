package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.SQLTransactionRollbackException;

public class ForResultActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result);

        editText = findViewById(R.id.fra_edit_text);
        button = findViewById(R.id.fra_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();


                Intent intent = new Intent();
                intent.putExtra("key",text);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

        // полученный результат отправляем назад
    }
}
