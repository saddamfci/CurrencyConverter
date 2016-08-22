package com.roxy.mind_reader.currencyconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    void usd_activity(View v){
        Intent intent=new Intent(this,USDActivity.class);
        startActivity(intent);
    }
    void eur_activity(View v){
        Intent intent=new Intent(this,EURActivity.class);
        startActivity(intent);
    }
    void inr_activity(View v){
        Intent intent=new Intent(this,INRActivity.class);
        startActivity(intent);
    }
    void pkr_activity(View v){
        Intent intent=new Intent(this,PKRActivity.class);
        startActivity(intent);
    }
    void qar_activity(View v){
        Intent intent=new Intent(this,QARActivity.class);
        startActivity(intent);
    }
    void sar_activity(View v){
        Intent intent=new Intent(this,SARActivity.class);
        startActivity(intent);
    }
    void myr_activity(View v){
        Intent intent=new Intent(this,MYRActivity.class);
        startActivity(intent);
    }
    void jod_activity(View v){
        Intent intent=new Intent(this,JODActivity.class);
        startActivity(intent);
    }
}
