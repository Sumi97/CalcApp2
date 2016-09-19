package com.example.sumi.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value1 = intent.getStringExtra("VALUE1");
        String value2 = intent.getStringExtra("VALUE2");
        int Calc = intent.getIntExtra("Calc", 0);

        if (value1.compareTo("") == 0) {
            value1 = "0";
        }

        if (value2.compareTo("") == 0) {
            value2 = "0";
        }

        if (Calc == 1) {
            Double a = Double.parseDouble(value1);
            Double b = Double.parseDouble(value2);
            Double c = a + b;
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setText(Double.toString(c));
        } else if (Calc == 2) {
            Double a = Double.parseDouble(value1);
            Double b = Double.parseDouble(value2);
            Double c = a - b;
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setText(Double.toString(c));
        } else if (Calc == 3) {
            Double a = Double.parseDouble(value1);
            Double b = Double.parseDouble(value2);
            Double c = a * b;
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setText(Double.toString(c));
        } else if (Calc == 4) {
            Double a = Double.parseDouble(value1);
            Double b = Double.parseDouble(value2);
            Double c = a / b;
            TextView textView1 = (TextView) findViewById(R.id.textView1);
            textView1.setText(Double.toString(c));
        }
    }
}
