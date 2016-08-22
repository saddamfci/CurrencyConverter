package com.roxy.mind_reader.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JODActivity extends AppCompatActivity {
    EditText etJOD;
    TextView tvJOD,tvBDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jod);
        etJOD=(EditText) findViewById(R.id.etJOD);
        tvJOD=(TextView) findViewById(R.id.etJOD);
        tvBDT=(TextView) findViewById(R.id.tvBDT);
    }
    void jod_convert(View v){
        String etJODString=etJOD.getText().toString();
        if(!etJODString.equals("")){
            double JOD=Double.parseDouble(etJODString);
            double result=JOD*110.781;
            tvBDT.setText("= "+result+" BDT(Bangladeshi Taka)");
        }
        else{
            Toast.makeText(getApplicationContext(),"Please Insert Currency Number",Toast.LENGTH_LONG).show();
        }
    }
}
