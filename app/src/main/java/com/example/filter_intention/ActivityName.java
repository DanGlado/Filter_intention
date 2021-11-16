package com.example.filter_intention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Button btnOK = (Button) findViewById(R.id.btnOK);
        btnOK.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override

        public void onClick(View v) {
            EditText etName = (EditText) findViewById(R.id.etName);
            Intent intent = new Intent();
            intent.putExtra("name", etName.getText().toString());
            setResult(RESULT_OK, intent);
            finish();
        }
    };

}