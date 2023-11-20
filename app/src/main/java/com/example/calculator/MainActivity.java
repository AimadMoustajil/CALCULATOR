package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    RadioButton plus, moin, produit, mul;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("My First APP on appstore");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        plus = findViewById(R.id.plus);
        moin = findViewById(R.id.moin);
        produit = findViewById(R.id.produit);
        mul = findViewById(R.id.mul);
        btn1 = findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(n1.getText().toString());
                Double num2 = Double.parseDouble(n2.getText().toString());
                Double res = 0.0;

                if (plus.isChecked()) {
                    res = num1 + num2;
                }
                if (moin.isChecked()) {
                    res = num1 - num2;
                }
                if (produit.isChecked()) {
                    res = num1 * num2;
                }
                if (mul.isChecked()) {
                    if (num2 == 0 ) return;
                    res = num1 / num2;

                }

                Toast.makeText(MainActivity.this, String.valueOf(res), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
