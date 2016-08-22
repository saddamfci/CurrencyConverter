package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EURActivity extends AppCompatActivity {
    EditText etEUR;
    TextView tvEUR,tvBDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eur);
        etEUR=(EditText) findViewById(R.id.etEUR);
        tvEUR=(TextView) findViewById(R.id.tvEUR);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void eur_convert(View v){
        String etEURString=etEUR.getText().toString();
        if(!etEURString.equals("")){
            double EUR=Double.parseDouble(etEURString);
            double result=EUR*86.1951;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_SHORT).show();
        }
    }
}
