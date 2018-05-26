package me.blog.pssin1.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View v)
    {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(n1 + n2));
    }

    public void subClick(View v)
    {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(n1 - n2));
    }

    public void multiClick(View v)
    {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(n1 * n2));
    }

    public void divideClick(View v)
    {
        EditText number1 = findViewById(R.id.number1);
        EditText number2 = findViewById(R.id.number2);
        TextView result = findViewById(R.id.result);
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());
        result.setText(Double.toString(n1 / n2));
    }
}
