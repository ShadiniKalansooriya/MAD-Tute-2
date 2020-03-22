package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btnOk;

    EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnOk = (Button)findViewById(R.id.buttonOk);
        num1 = findViewById(R.id.editTextnumber1);
        num2 = findViewById(R.id.editTextnumber2 );
                btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);

                intent.putExtra("number1",num1.getText().toString());
                intent.putExtra("number2",num2.getText().toString());


                Toast.makeText(getApplicationContext(),"You clicked Ok",Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });


    }
}
