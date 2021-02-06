package com.example.intent;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button obvIntent;
    Button notObvIntent;
    Button intentForResult;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        obvIntent = findViewById(R.id.obv_intent);
        notObvIntent = findViewById(R.id.not_obv_intent);
        intentForResult = findViewById(R.id.intent_for_result);
        textView = findViewById(R.id.m_text_view);


//        Явный интент
        obvIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ObvActivity.class);
                startActivity(intent);
            }
        });
////////////////////////////////////////////////////////////////////////


//не явный интент


        notObvIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // сообщения
//                Intent intent = new Intent();
//                intent.putExtra(Intent.EXTRA_TEXT, "GeekTech");
//                intent.setAction(Intent.ACTION_SEND);
//                intent.setType("text/plain");

                // контакты
//                String data = "tel: (+996)1234567890";
//                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(data));


                //камера
//                Intent intent = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA); // фото
//                Intent intent = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);  //видео
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }

                //поиск в гугле
//                String q = "Андроид";
//                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
//                intent.putExtra(SearchManager.QUERY, q);
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }

            }
        });

        ///////////////////////////////////////////////////////////////////


//        Интент на результат


        intentForResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ForResultActivity.class);
                startActivityForResult(intent, 202);

            }
        });

        /// Что то отправляем запрос, отсюда к Фор Резалт Активити


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 202) {   //указываем отправленный код

            if (resultCode == RESULT_OK) {
                String text = data.getStringExtra("key");
                textView.setText(text);
            }
        }
    }


    // тут получаем результат связано с запросом.
}
