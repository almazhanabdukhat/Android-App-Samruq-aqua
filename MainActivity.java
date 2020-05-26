package com.example.finance;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import com.example.finance.R;

public class MainActivity extends AppCompatActivity {
    Button button_gmz;
    @Override
    protected void onCreate(Bundle savedInstanceStateBmi) {
        super.onCreate(savedInstanceStateBmi);
        setContentView(R.layout.activity_main);

        button_gmz = findViewById(R.id.gmz);




        //first button - calculate weight loss
        button_gmz.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent1=new Intent(MainActivity.this, com.example.finance.Main2Activity.class);
                        startActivity(intent1);
                    }
                });




    }

}
