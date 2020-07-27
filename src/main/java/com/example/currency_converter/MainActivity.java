package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
  Button euro, dollar, pound , rubel, audollar, candollar, yen , dinnar, bitcoin;
  EditText editText;
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.display_pallete);
        editText = findViewById(R.id.edit_text);
        euro = findViewById(R.id.euro);
        pound = findViewById(R.id.pound);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        dinnar = findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        audollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
    euro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String str = editText.getText().toString();

            if (TextUtils.isEmpty(str)){
                editText.setError("Input field is empty");
            }else{
                double a, b ;
                a = Double.parseDouble(str);
                b = a * 0.0114;
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                textView.setText("" +decimalFormat.format(b));
                editText.setText(null);
            }
        }
    });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.0135;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.01042;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.956;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });
        audollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.018;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.0178;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.708;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });
        dinnar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);
                    b = a * 0.0041;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                if (TextUtils.isEmpty(str)){
                    editText.setError("Input field is empty");
                }else{
                    double a, b ;
                    a = Double.parseDouble(str);

                    b = a * 0.00000132;
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" +decimalFormat.format(b));
                    editText.setText(null);
                }
            }
        });


    }
}