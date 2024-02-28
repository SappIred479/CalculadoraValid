package com.example.calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    TextView Results;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.editTextNumber);
        etNum2 = (EditText) findViewById(R.id.editTextNumber2);

        Results = (TextView) findViewById(R.id.textView2);

    }
    public void suma(View view) {
        if(etNum1.getText().toString().isEmpty() && etNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if (etNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else if(etNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int value1 = Integer.parseInt(etNum1.getText().toString());
            int value2 = Integer.parseInt(etNum2.getText().toString());

            int suma= value1+value2;

            String res = String.valueOf(suma);
            Results.setText(res);
        }
    }
    public void resta(View view){

         if(etNum1.getText().toString().isEmpty() && etNum2.getText().toString().isEmpty()){
            Toast.makeText( this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if(etNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        } else if (etNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int value1 = Integer.parseInt(etNum1.getText().toString());
            int value2 = Integer.parseInt(etNum2.getText().toString());

            int resta= value1-value2;

            String res = String.valueOf(resta);
            Results.setText(res);
        }

    }
    public void divi(View view){

        if(etNum1.getText().toString().isEmpty() && etNum2.getText().toString().isEmpty()){
            Toast.makeText( this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if(etNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        } else if (etNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int value1 = Integer.parseInt(etNum1.getText().toString());
            int value2 = Integer.parseInt(etNum2.getText().toString());

            int divi= value1/value2;

            String res = String.valueOf(divi);
            Results.setText(res);
        }
    }
    public void mult(View view){

        if(etNum1.getText().toString().isEmpty() && etNum2.getText().toString().isEmpty()){
            Toast.makeText( this, "Debes ingrear todos los numeros", Toast.LENGTH_LONG).show();
        }else if(etNum1.getText().toString().isEmpty()) {
            Toast.makeText(this, "El primer campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        } else if (etNum2.getText().toString().isEmpty()) {
            Toast.makeText( this, "El segundo campo esta vacio, por favor rellenar", Toast.LENGTH_LONG).show();
        }else {
            int value1 = Integer.parseInt(etNum1.getText().toString());
            int value2 = Integer.parseInt(etNum2.getText().toString());

            int mult=value1*value2;

            String res = String.valueOf(mult);
            Results.setText(res);
        }

    }

}
