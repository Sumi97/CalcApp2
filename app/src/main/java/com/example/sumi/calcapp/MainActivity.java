package com.example.sumi.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

    }

    @Override
    public void onClick(View v) {

        //Calc = 和:1, 差:2, 積:3, 商:4

        if (v.getId() == R.id.button1) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("VALUE1", mEditText1.getText().toString());
            intent.putExtra("VALUE2", mEditText2.getText().toString());
            intent.putExtra("Calc", 1);
            startActivity(intent);
        } else if (v.getId() == R.id.button2) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("VALUE1", mEditText1.getText().toString());
            intent.putExtra("VALUE2", mEditText2.getText().toString());
            intent.putExtra("Calc", 2);
            startActivity(intent);
        } else if (v.getId() == R.id.button3) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("VALUE1", mEditText1.getText().toString());
            intent.putExtra("VALUE2", mEditText2.getText().toString());
            intent.putExtra("Calc", 3);
            startActivity(intent);
        } else if (v.getId() == R.id.button4) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("VALUE1", mEditText1.getText().toString());
            intent.putExtra("VALUE2", mEditText2.getText().toString());
            intent.putExtra("Calc", 4);
            startActivity(intent);
        }
    }
}
