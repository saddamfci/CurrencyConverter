package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SARActivity extends AppCompatActivity {
    EditText etSAR;
    TextView tvSAR,tvBDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sar);
        etSAR=(EditText) findViewById(R.id.etSAR);
        tvSAR=(TextView) findViewById(R.id.tvSAR);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void sar_convert(View v){
        String etSARString=etSAR.getText().toString();
        if(!etSARString.equals("")){
            double SAR=Double.parseDouble(etSARString);
            double result=SAR*20.9317;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_SHORT).show();
        }
    }
}
