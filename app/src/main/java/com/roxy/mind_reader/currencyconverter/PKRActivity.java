package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PKRActivity extends AppCompatActivity {
    EditText etPKR;
    TextView tvPKR,tvBDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkr);
        etPKR=(EditText) findViewById(R.id.etPKR);
        tvPKR=(TextView) findViewById(R.id.tvPKR);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void pkr_convert(View v){
        String etPKRString=etPKR.getText().toString();
        if(!etPKRString.equals("")){
            double PKR=Double.parseDouble(etPKRString);
            double result=PKR*0.747687;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_SHORT).show();
        }
    }
}
