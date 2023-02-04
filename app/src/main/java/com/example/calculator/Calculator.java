package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    EditText txtfirstnumber, txtsecondnumber;
    Button btnplus, btnminus, btntimes, btndivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtfirstnumber = (EditText) findViewById(R.id.txtfirstnumber);
        txtsecondnumber = (EditText) findViewById(R.id.txtsecondnumber);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnminus = (Button) findViewById(R.id.btnminus);
        btntimes = (Button) findViewById(R.id.btntimes);
        btndivide = (Button) findViewById(R.id.btndivide);

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtfirstnumber.getText().toString());
                int angka2 = Integer.parseInt(txtsecondnumber.getText().toString());
                int Hasil = angka1 + angka2;

                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtfirstnumber.getText().toString());
                int angka2 = Integer.parseInt(txtsecondnumber.getText().toString());
                int Hasil = angka1 - angka2;

                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btntimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtfirstnumber.getText().toString());
                int angka2 = Integer.parseInt(txtsecondnumber.getText().toString());
                int Hasil = angka1 * angka2;

                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1 = Integer.parseInt(txtfirstnumber.getText().toString());
                int angka2 = Integer.parseInt(txtsecondnumber.getText().toString());
                int Hasil = angka1 / angka2;

                Toast.makeText(getApplicationContext(), "Hasil = " + Hasil, Toast.LENGTH_SHORT).show();
            }
        });
    }
}