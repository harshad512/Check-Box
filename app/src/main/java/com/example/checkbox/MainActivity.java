package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox mad_c,cn_c,daa_c,maap_c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maap_c = (CheckBox) findViewById(R.id.MAAP);
        maap_c.setOnClickListener(this);
        mad_c = (CheckBox) findViewById(R.id.MAD);
        mad_c.setOnClickListener(this);
        cn_c = (CheckBox) findViewById(R.id.CN);
        cn_c.setOnClickListener(this);
        daa_c = (CheckBox) findViewById(R.id.DAA);
        daa_c.setOnClickListener(this);
    }
        @Override
        public void onClick(View view) {

            switch (view.getId()) {
                case R.id.MAAP:
                    if (maap_c.isChecked())
                        Toast.makeText(getApplicationContext(), "MAAP", Toast.LENGTH_LONG).show();
                    break;
                case R.id.MAD:
                    if (mad_c.isChecked())
                        Toast.makeText(getApplicationContext(), "MAD", Toast.LENGTH_LONG).show();
                    break;
                case R.id.CN:
                    if (cn_c.isChecked())
                        Toast.makeText(getApplicationContext(), "CN", Toast.LENGTH_LONG).show();
                    break;
                case R.id.DAA:
                    if (daa_c.isChecked())
                        Toast.makeText(getApplicationContext(), "DAA", Toast.LENGTH_LONG).show();
                    break;
            }
        }

    }

