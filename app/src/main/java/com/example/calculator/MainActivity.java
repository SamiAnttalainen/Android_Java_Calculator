package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText numberInputOne, numberInputTwo;
    private TextView result;
    int NumOne, NumTwo, Sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInputOne = findViewById(R.id.editTextNumberOne);
        numberInputTwo = findViewById(R.id.editTextNumberTwo);
        result = findViewById(R.id.resultText);
    }


    public void sumNumbers(View view) {
        System.out.println(("Summataan"));
        NumOne = Integer.parseInt(numberInputOne.getText().toString());
        NumTwo = Integer.parseInt(numberInputTwo.getText().toString());
        Sum = NumOne + NumTwo;
        result.setText(String.format(Locale.getDefault(), "%d", Sum));
    }

    public void subNumbers(View view) {
        System.out.println("Vähennetään");
        NumOne = Integer.parseInt(numberInputOne.getText().toString());
        NumTwo = Integer.parseInt(numberInputTwo.getText().toString());
        Sum = NumOne - NumTwo;
        result.setText(String.format(Locale.getDefault(), "%d", Sum));
    }

    public void multiplyNumbers(View view) {
        System.out.println("Kerrotaan");
        NumOne = Integer.parseInt(numberInputOne.getText().toString());
        NumTwo = Integer.parseInt(numberInputTwo.getText().toString());
        Sum = NumOne * NumTwo;
        result.setText(String.format(Locale.getDefault(), "%d", Sum));
    }

    public void divNumbers(View view) {
        System.out.println(("Jaetaan"));
        NumOne = Integer.parseInt(numberInputOne.getText().toString());
        NumTwo = Integer.parseInt(numberInputTwo.getText().toString());
        Sum = NumOne / NumTwo;
        result.setText(String.format(Locale.getDefault(), "%d", Sum));
    }
}