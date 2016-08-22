package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class INRActivity extends AppCompatActivity {
    EditText etINR;
    TextView tvINR,tvBDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inr);
        etINR=(EditText) findViewById(R.id.etINR);
        tvINR=(TextView) findViewById(R.id.tvINR);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void inr_convert(View v){
        String etINRString=etINR.getText().toString();
        if(!etINRString.equals("")){
            double INR=Double.parseDouble(etINRString);
            double result=INR*1.16937;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_LONG).show();
        }
    }
}
