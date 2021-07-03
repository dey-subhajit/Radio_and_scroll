package com.example.registrationpage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rbm, rbf;
    Button btn;
    ToggleButton tgbtn;
    LinearLayout body;

    String gender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbm = findViewById(R.id.rbm);
        rbf = findViewById(R.id.rbf);
        btn = findViewById(R.id.btnSub);
        tgbtn = findViewById(R.id.tgbtn);
        body = findViewById(R.id.body);

        rbm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true) {
                    gender = "Male";
                    // Toast.makeText(MainActivity.this, "Gender is male", Toast.LENGTH_LONG).show();
                }
            }
        });
        rbf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true) {
                    gender = "Female";
                    // Toast.makeText(MainActivity.this, "Gender is male", Toast.LENGTH_LONG).show();
                }
            }
        });

        tgbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    body.setBackgroundColor(Color.GREEN);
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_LONG).show();
                }
                else{
                    body.setBackgroundColor(Color.RED);
                    Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_LONG).show();
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // System.out.println(gender);
                Toast.makeText(MainActivity.this, "Gender is: "+gender, Toast.LENGTH_SHORT).show();
            }
        });
    }
}