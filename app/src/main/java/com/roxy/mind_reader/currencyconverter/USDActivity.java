package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class USDActivity extends AppCompatActivity {

    EditText etUSD;
    TextView tvUSD,tvBDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd);
        etUSD=(EditText) findViewById(R.id.etUSD);
        tvUSD=(TextView) findViewById(R.id.tvUSD);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void usd_convert(View v){
        String etUSDString=etUSD.getText().toString();
        if(!etUSDString.equals("")){
            double USDNumber=Double.parseDouble(etUSDString);
            double result=USDNumber*78.5050;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_LONG).show();
        }
    }

}
