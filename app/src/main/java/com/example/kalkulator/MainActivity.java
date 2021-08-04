package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextAngka1,editTextAngka2;
    Button buttonTambah, buttonKali,buttonKurang,buttonBagi, buttonClean;
    String valueA,valueB;
    double numA,numB, hasil;
    TextView textViewHasil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAngka1 = findViewById(R.id.editTextAngka1);
        editTextAngka2 = findViewById(R.id.editTextAngka2);
        textViewHasil2 = findViewById(R.id.textViewHasil2);
        buttonTambah = findViewById(R.id.buttonTambah);
        buttonKurang = findViewById(R.id.buttonKurang);
        buttonKali = findViewById(R.id.buttonKali);
        buttonBagi = findViewById(R.id.buttonBagi);
        buttonClean = findViewById(R.id.buttonClean);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                valueA = editTextAngka1.getText().toString();
                numA = Double.parseDouble(valueA);

                valueB = editTextAngka2.getText().toString();
                numB = Double.parseDouble(valueB);

                hasil = numA+numB;
                textViewHasil2.setText("hasilnya: "+hasil);
            }
        });
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                valueA = editTextAngka1.getText().toString();
                numA = Double.parseDouble(valueA);

                valueB = editTextAngka2.getText().toString();
                numB = Double.parseDouble(valueB);

                hasil = numA-numB;
                textViewHasil2.setText("hasilnya: "+hasil);
            }
        });
        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                valueA = editTextAngka1.getText().toString();
                numA = Double.parseDouble(valueA);

                valueB = editTextAngka2.getText().toString();
                numB = Double.parseDouble(valueB);

                hasil = numA*numB;
                textViewHasil2.setText("hasilnya: "+hasil);
            }
        });
        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                valueA = editTextAngka1.getText().toString();
                numA = Double.parseDouble(valueA);

                valueB = editTextAngka2.getText().toString();
                numB = Double.parseDouble(valueB);

                hasil = numA/numB;
                textViewHasil2.setText("hasilnya: "+hasil);
            }
        });
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                textViewHasil2.setText("0");
            }
        });
    }

}
