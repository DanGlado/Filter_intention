package com.example.filter_intention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTime;
    Button btnDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnTime.setOnClickListener(clickListener);

        btnDate = (Button) findViewById(R.id.btnDate);
        btnDate.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;

            switch (v.getId()) {
                case R.id.btnTime:
                    intent = new Intent("ru.startandroid.intent.action.showtime");
                    startActivity(intent);
                    break;
                case R.id.btnDate:
                    intent = new Intent("ru.startandroid.intent.action.showdate");
                    startActivity(intent);
                    break;
            }
        }
    };
}