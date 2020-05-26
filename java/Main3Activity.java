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

public class Main3Activity extends AppCompatActivity {


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
        setContentView(R.layout.activity_main3);

        //Get values from the user input
        final EditText gmz1E = findViewById(R.id.gmz1);
        final EditText gmz2E = findViewById(R.id.gmz2);
        final EditText dobavkaE = findViewById(R.id.dobavka);
        final EditText pofaktuE = findViewById(R.id.pofaktu);
        final EditText terminalE=findViewById(R.id.term);




        Button button = findViewById(R.id.btn_add);
        Button backButton = findViewById(R.id.btn_menu3);
        final TextView out_Itogo = findViewById(R.id.txtItogo);
        final TextView out_Ost = findViewById(R.id.txtOst);
        final TextView konsig=findViewById(R.id.txtKonsi);
        final TextView zakup=findViewById(R.id.txtZak);
        final TextView drugiye=findViewById(R.id.txtDr);
        final TextView raznica=findViewById(R.id.txtRaznica);
        final TextView finalOst=findViewById(R.id.txtOsK);

        SharedPreferences result =getSharedPreferences("SaveData", Context.MODE_PRIVATE);
        String value=result.getString("Value","Not Found");
        konsig.setText(value+"");
        final double rashKon=Integer.valueOf(value);

        SharedPreferences resultZ =getSharedPreferences("SaveDataZ", Context.MODE_PRIVATE);
        String valueZ=resultZ.getString("ValueZ","Not Found");
        zakup.setText(valueZ+"");
        final double rashZakup=Integer.valueOf(valueZ);

        SharedPreferences resultD =getSharedPreferences("SaveDataD", Context.MODE_PRIVATE);
        String valueD=resultD.getString("ValueD","Not Found");
        drugiye.setText(valueD+"");
        final double rashDr=Integer.valueOf(valueD);




        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                //convert user input to strings, declare variables
                String gmz1S = gmz1E.getText().toString();
                String gmz2S = gmz2E.getText().toString();
                String dobavkaS = dobavkaE.getText().toString();
                String pofaktuS = pofaktuE.getText().toString();
                String termS=terminalE.getText().toString();
                double gmz_1, gmz_2, dobavkA, pofaktU, ost,term,raznicaD,ostSegodnya;
                double itogo=0;


                if (isNumeric(gmz1S)) { gmz_1 = Double.valueOf(gmz1S); }
                else { gmz_1 = 0; }
                if (isNumeric(gmz2S)) { gmz_2 = Double.valueOf(gmz2S); }
                else { gmz_2 = 0; }
                if (isNumeric(dobavkaS)) { dobavkA = Double.valueOf(dobavkaS); }
                else { dobavkA = 0; }
                if (isNumeric(pofaktuS)) { pofaktU = Double.valueOf(pofaktuS); }
                else { pofaktU = 0; }
                if (isNumeric(termS)) { term = Double.valueOf(termS); }
                else { term = 0; }

                //sample
                ost=30930;
                out_Ost.setText(""+ost);

                itogo=gmz_1+gmz_2; //itogo na kasse
                out_Itogo.setText(""+itogo);

                ostSegodnya=(itogo+dobavkA+ost)-(rashDr+rashKon+rashZakup+term);
                raznicaD=pofaktU-ostSegodnya;
                raznica.setText(""+raznicaD);
                finalOst.setText(""+ostSegodnya);









            }
        });

        backButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(com.example.finance.Main3Activity.this, Main2Activity.class);
                        startActivity(intent);
                    }
                });
    }

}


