package com.example.finance;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import com.example.finance.R;

public class Main2Activity extends AppCompatActivity {
    Button button_kassa;
    Button btn_konsign;
    Button button_zakup;
    Button button_rashody, button_vseKonsig;
    @Override
    protected void onCreate(Bundle savedInstanceStateBmi) {
        super.onCreate(savedInstanceStateBmi);
        setContentView(R.layout.activity_main2);

        button_kassa = findViewById(R.id.btn_kassa);
        btn_konsign=findViewById(R.id.btn_konsig);
        button_zakup=findViewById(R.id.btn_zakup);
        button_rashody=findViewById(R.id.btn_rashody);
        button_vseKonsig=findViewById(R.id.btn_vseKonsig);

        //first button - calculate weight loss
        button_kassa.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(Main2Activity.this, com.example.finance.Main3Activity.class);
                        startActivity(intent1);
                    }
                });

        btn_konsign.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent2=new Intent(Main2Activity.this, com.example.finance.Main4Activity.class);
                        startActivity(intent2);
                    }
                });

        button_zakup.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent3=new Intent(Main2Activity.this, com.example.finance.Main5Activity.class);
                        startActivity(intent3);
                    }
                });


        button_rashody.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent4=new Intent(Main2Activity.this, com.example.finance.Main6Activity.class);
                        startActivity(intent4);
                    }
                });

        button_vseKonsig.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent5=new Intent(Main2Activity.this, com.example.finance.Main7Activity.class);
                        startActivity(intent5);
                    }
                });







    }

}
