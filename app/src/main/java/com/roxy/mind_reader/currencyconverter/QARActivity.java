package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QARActivity extends AppCompatActivity {
    EditText etQAR;
    TextView tvQAR,tvBDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qar);
        etQAR=(EditText) findViewById(R.id.etQAR);
        tvQAR=(TextView) findViewById(R.id.tvQAR);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void qar_convert(View v){
        String etQARString=etQAR.getText().toString();
        if(!etQARString.equals("")){
            double QAR=Double.parseDouble(etQARString);
            double result=QAR*21.5492;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_SHORT).show();
        }
    }
}
