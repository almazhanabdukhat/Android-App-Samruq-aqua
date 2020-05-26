package com.example.finance;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finance.MainActivity;
import com.example.finance.R;

import org.w3c.dom.Text;

public class Main7Activity extends AppCompatActivity {
    EditText userName, password;

    //method to check the input
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

       // NetInfo netInfo = new NetInfo(this);
        //String ipAddress = netInfo.getIPAddress();

        //Toast.makeText(this, "ipAddress" + ipAddress, Toast.LENGTH_SHORT).show();


        userName=(EditText)findViewById(R.id.userN);
        password=(EditText)findViewById(R.id.password);

        Button button = findViewById(R.id.btn_addKS);
        Button backButton = findViewById(R.id.btn_menu3KS);
        Button loginButton=findViewById(R.id.btnLogin);
        final TextView out_Itogo = findViewById(R.id.kon1);
        //out_Itogo.setText(ipAddress);



        SharedPreferences result =getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        String value=result.getString("Value","Not Found");
       // konsig.setText(value+"");
        final double rashKon=Integer.valueOf(value);

      button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


            }
        });

        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(com.example.finance.Main7Activity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });
    }


}


