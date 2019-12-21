package com.example.sherlock.aptitudet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int result=intent.getIntExtra("Result",0);
        TextView text=findViewById(R.id.result_text);
        text.setText(String.valueOf(result)+"/5");
    }
}



