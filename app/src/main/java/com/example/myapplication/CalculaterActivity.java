package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class CalculaterActivity extends AppCompatActivity {
    TextView number1;
    TextView number2;
    TextView result;
    Button add;
    Button sub;
    Button div;
    Button mul;
    Calculater calculater;
    float num1;
    float num2;
    Intent intent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater);
        number1 = findViewById(R.id.number1view);
        number2 = findViewById(R.id.number2view);
        result = findViewById(R.id.result);
        add = findViewById(R.id.addbtn);
        sub = findViewById(R.id.subbtn);
        div = findViewById(R.id.divbtn);
        mul = findViewById(R.id.mulbtn);
        number1.setText(intent.getStringExtra("Number1"));
        number2.setText(intent.getStringExtra("Number2"));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.valueOf(number1.getText().toString());
                num2 = Float.valueOf(number2.getText().toString());
                calculater = new Calculater(num1,num2) ;
                result.setText(num1+" + "+num2+" = "+calculater.add());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.valueOf(number1.getText().toString());
                num2 = Float.valueOf(number2.getText().toString());
                calculater = new Calculater(num1,num2) ;
                result.setText(num1+" - "+num2+" = "+calculater.sub());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.valueOf(number1.getText().toString());
                num2 = Float.valueOf(number2.getText().toString());
                calculater = new Calculater(num1,num2) ;
                result.setText(num1+" / "+num2+" = "+calculater.div());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Float.valueOf(number1.getText().toString());
                num2 = Float.valueOf(number2.getText().toString());
                calculater = new Calculater(num1,num2) ;
                result.setText(num1+" * "+num2+" = "+calculater.mul());
            }
        });
    }
}