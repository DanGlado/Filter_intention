package com.example.filter_intention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTime;
    Button btnDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnName = (Button) findViewById(R.id.btnName);
        btnName.setOnClickListener(clickListener);

        btnTime = (Button) findViewById(R.id.btnTime);
        btnTime.setOnClickListener(clickListener);

        btnDate = (Button) findViewById(R.id.btnDate);
        btnDate.setOnClickListener(clickListener);

        TextView tvView = (TextView) findViewById(R.id.textView2);


    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            EditText eName = (EditText) findViewById(R.id.etLName);
            switch (v.getId()) {
                case R.id.btnTime:
                    intent = new Intent("ru.startandroid.intent.action.showtime");
                    intent.putExtra("lname", eName.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.btnDate:
                    intent = new Intent("ru.startandroid.intent.action.showdate");
                    intent.putExtra("lname", eName.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.btnName:
                    intent = new Intent(getApplicationContext(), ActivityName.class);
                    startActivityForResult(intent, 1);
                    break;
            }
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView tvName = (TextView) findViewById(R.id.tvName1);
        if (data == null) {
            return;
        }
        String name = data.getStringExtra("name");
        tvName.setText("Your name is " + name);
    }
}


