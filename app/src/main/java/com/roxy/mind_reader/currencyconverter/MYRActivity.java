package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MYRActivity extends AppCompatActivity {
    EditText etMYR;
    TextView tvMYR,tvBDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myr);
        etMYR=(EditText) findViewById(R.id.etMYR);
        tvMYR=(TextView) findViewById(R.id.tvMYR);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void myr_convert(View v){
        String etMYRString=etMYR.getText().toString();
        if(!etMYRString.equals("")){
            double MYR=Double.parseDouble(etMYRString);
            double result=MYR*19.2528;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_SHORT).show();
        }
    }
}
