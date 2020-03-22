package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText editTextnum1, editTextnum2;
    TextView textviewdisplay;
    Button btnAdd,btnSub,btnMulti,btnDivi;
    int n1, n2, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editTextnum1 = findViewById(R.id.editTextnumber1);
        editTextnum2 = findViewById(R.id.editTextnumber2);
        textviewdisplay = findViewById(R.id.textViewAns);
        btnAdd = (Button)findViewById(R.id.buttonAdd);
        btnSub = (Button)findViewById(R.id.buttonSub);
        btnMulti = (Button)findViewById(R.id.buttonmulti);
        btnDivi = (Button)findViewById(R.id.buttonDivi);


        Intent intent = getIntent();

        String number1 = intent.getStringExtra("number1");
        String number2 = intent.getStringExtra("number2");

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

        editTextnum1.setText(Integer.toString(n1));
        editTextnum2.setText(Integer.toString(n2));


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addition();
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                substraction();
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplication();
            }
        });

        btnDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                division();
            }
        });

    }

    public void addition()
    {
        int ans = n1 + n2;

        textviewdisplay.setText(n1+" + " +n2+" = "+ans);

    }

    public void substraction()
    {
        int ans = n1 - n2;

        textviewdisplay.setText(n1+" - " +n2+" = "+ans);

    }

    public void multiplication()
    {
        int ans = n1 * n2;

        textviewdisplay.setText(n1+" * " +n2+" = "+ans);

    }

    public void division()
    {
        int ans = n1 / n2;

        textviewdisplay.setText(n1+" / " +n2+" = "+ans);

    }
}
