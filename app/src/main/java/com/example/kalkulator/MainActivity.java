package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button tombol1,tombol2,tombol3,tombol4,tombol5,tombol6,tombol7,tombol8,tombol9,tombol0,tomboltambah,tombolminus,tombolkali,tombolbagi,tombolclear,samadengan;
    Boolean doTambah,doKurang,doKali,doBagi;
    EditText teksTampil;
    Float nilai1,nilai2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol0 = (Button) findViewById(R.id.tombol0);
        tombol1 = (Button) findViewById(R.id.tombol1);
        tombol2 = (Button) findViewById(R.id.tombol2);
        tombol3 = (Button) findViewById(R.id.tombol3);
        tombol4 = (Button) findViewById(R.id.tombol4);
        tombol5 = (Button) findViewById(R.id.tombol5);
        tombol6 = (Button) findViewById(R.id.tombol6);
        tombol7 = (Button) findViewById(R.id.tombol7);
        tombol8 = (Button) findViewById(R.id.tombol8);
        tombol9 = (Button) findViewById(R.id.tombol9);
        tomboltambah = (Button) findViewById(R.id.tomboltambah);
        tombolminus = (Button) findViewById(R.id.tombolminus);
        tombolkali = (Button) findViewById(R.id.tombolkali);
        tombolbagi = (Button) findViewById(R.id.tombolbagi);
        tombolclear = (Button) findViewById(R.id.tombolclear);
        samadengan = (Button) findViewById(R.id.samadengan);
        teksTampil = (EditText) findViewById(R.id.hasil);

        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"0");
            }
        });
        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"1");
            }
        });
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"2");
            }
        });
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"3");
            }
        });
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"4");
            }
        });
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"5");
            }
        });
        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"6");
            }
        });
        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"7");
            }
        });
        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"8");
            }
        });
        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"9");
            }
        });
        tomboltambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Float.parseFloat(teksTampil.getText().toString()+"");
                doTambah=true;
                teksTampil.setText("+");
            }
        });
        tombolminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Float.parseFloat(teksTampil.getText().toString()+"");
                doKurang=true;
                teksTampil.setText("-");

            }
        });
        tombolkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Float.parseFloat(teksTampil.getText().toString()+"");
                doKali=true;
                teksTampil.setText("x");
            }
        });
        tombolbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Float.parseFloat(teksTampil.getText().toString()+"");
                doBagi=true;
                teksTampil.setText("/");
            }
        });
        tombolclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=null;
                nilai2=null;
                teksTampil.setText(null);
            }
        });
        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai2 = Float.parseFloat(teksTampil.getText().toString()+"");
                if(doTambah==true){
                    teksTampil.setText(nilai1+nilai2+"");
                    doTambah=false;

                }else if(doKurang==true){
                    teksTampil.setText(nilai1-nilai2+"");
                    doKurang=false;

                }else if (doKali==true){
                    teksTampil.setText(nilai1*nilai2+"");
                    doKali=false;

                }else if (doBagi==true){
                    teksTampil.setText(nilai1/nilai2+"");
                    doBagi=false;

                }
            }
        });

    }
}
