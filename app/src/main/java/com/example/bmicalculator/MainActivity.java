package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    EditText weight, hf, hi;
    MaterialButton btn;
    LinearLayout ll;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.weight);
        hf = findViewById(R.id.hf);
        hi = findViewById(R.id.hi);
        ll = findViewById(R.id.ll);
        btn = findViewById(R.id.btn);
        result = findViewById(R.id.result);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int weightint = Integer.parseInt(weight.getText().toString());
                int hfi = Integer.parseInt(hf.getText().toString());
                int hii = Integer.parseInt(hi.getText().toString());
                int totlinch = hfi*12 + hii;
                double centimeter = totlinch*2.53;
                double meter = centimeter/100;
                double bmi = weightint/(meter*meter);
                if (bmi>25){
                    result.setText("OverWeight");
                    ll.setBackgroundColor(getResources().getColor(R.color.over));
                } else if (bmi<18) {
                    result.setText("UnderWeight");
                    ll.setBackgroundColor(getResources().getColor(R.color.under));

                }else {
                    result.setText("You are Healthy");
                    ll.setBackgroundColor(getResources().getColor(R.color.norml));

                }

            }
        });
    }
}