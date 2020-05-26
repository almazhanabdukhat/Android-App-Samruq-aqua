package com.example.finance;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finance.MainActivity;
import com.example.finance.R;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner_countD;
    String[] countD = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13","14"};
    TextView outItogoD;
    SharedPreferences sharedPreferencesD;

    //method to check the input
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void change(EditText a, boolean r) {
        if (r){a.setVisibility(View.VISIBLE); }
        else {a.setVisibility(View.GONE); }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState1) {
        super.onCreate(savedInstanceState1);
        setContentView(R.layout.activity_main6);
        final Button buttonD = findViewById(R.id.btn_addD);
        final Button backButtonD = findViewById(R.id.btn_menu2);
        final Button buttonCompD = findViewById(R.id.btn_computeD);
        final Button buttonSaveD=findViewById(R.id.btn_saveD);

        buttonD.setOnClickListener(this);
        backButtonD.setOnClickListener(this);
        buttonCompD.setOnClickListener(this);
        buttonSaveD.setOnClickListener(this);

        //Get values
        final EditText dr1Ed = findViewById(R.id.dr1);
        final EditText dr2Ed = findViewById(R.id.dr2);
        final EditText dr3Ed = findViewById(R.id.dr3);
        final EditText dr4Ed = findViewById(R.id.dr4);
        final EditText dr5Ed = findViewById(R.id.dr5);
        final EditText dr6Ed = findViewById(R.id.dr6);
        final EditText dr7Ed = findViewById(R.id.dr7);
        final EditText dr8Ed = findViewById(R.id.dr8);
        final EditText dr9Ed = findViewById(R.id.dr9);
        final EditText dr10Ed = findViewById(R.id.dr10);
        final EditText dr11Ed = findViewById(R.id.dr11);
        final EditText dr12Ed = findViewById(R.id.dr12);
        final EditText dr13Ed = findViewById(R.id.dr13);
        final EditText dr14Ed = findViewById(R.id.dr14);
        dr1Ed.setVisibility(View.GONE);
        dr2Ed.setVisibility(View.GONE);
        dr3Ed.setVisibility(View.GONE);
        dr4Ed.setVisibility(View.GONE);
        dr5Ed.setVisibility(View.GONE);
        dr6Ed.setVisibility(View.GONE);
        dr7Ed.setVisibility(View.GONE);
        dr8Ed.setVisibility(View.GONE);
        dr9Ed.setVisibility(View.GONE);
        dr10Ed.setVisibility(View.GONE);
        dr11Ed.setVisibility(View.GONE);
        dr12Ed.setVisibility(View.GONE);
        dr13Ed.setVisibility(View.GONE);
        dr14Ed.setVisibility(View.GONE);


        spinner_countD = (Spinner) findViewById(R.id.spinnerD);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countD);
        spinner_countD.setAdapter(arrayAdapter1);

    }

    @Override
    public void onClick (View v) {
        final EditText dr1Ed = findViewById(R.id.dr1);
        final EditText dr2Ed = findViewById(R.id.dr2);
        final EditText dr3Ed = findViewById(R.id.dr3);
        final EditText dr4Ed = findViewById(R.id.dr4);
        final EditText dr5Ed = findViewById(R.id.dr5);
        final EditText dr6Ed = findViewById(R.id.dr6);
        final EditText dr7Ed = findViewById(R.id.dr7);
        final EditText dr8Ed = findViewById(R.id.dr8);
        final EditText dr9Ed = findViewById(R.id.dr9);
        final EditText dr10Ed = findViewById(R.id.dr10);
        final EditText dr11Ed = findViewById(R.id.dr11);
        final EditText dr12Ed = findViewById(R.id.dr12);
        final EditText dr13Ed = findViewById(R.id.dr13);
        final EditText dr14Ed = findViewById(R.id.dr14);
        outItogoD = findViewById(R.id.textItogoD);

        String countDr = spinner_countD.getSelectedItem().toString();

        int totalD=0;

        int dr1,dr2,dr3,dr4,dr5,dr6,dr7,dr8,dr9,dr10,dr13,dr14,  dr11,dr12;

        String dr1S = dr1Ed.getText().toString();
        if (isNumeric(dr1S)) { dr1 = Integer.valueOf(dr1S); totalD+=dr1; } else { dr1 = -1; }
        String dr2S = dr2Ed.getText().toString();
        if (isNumeric(dr2S)) { dr2 = Integer.valueOf(dr2S); totalD+=dr2; } else { dr2 = -1; }
        String dr3S = dr3Ed.getText().toString();
        if (isNumeric(dr3S)) { dr3 = Integer.valueOf(dr3S); totalD+=dr3; } else { dr3 = -1; }
        String dr4S = dr4Ed.getText().toString();
        if (isNumeric(dr4S)) { dr4 = Integer.valueOf(dr4S); totalD+=dr4; } else { dr4 = -1; }

        String dr5S = dr5Ed.getText().toString();
        if (isNumeric(dr5S)) { dr5 = Integer.valueOf(dr5S); totalD+=dr5; } else { dr5 = -1; }
        String dr6S = dr6Ed.getText().toString();
        if (isNumeric(dr6S)) { dr6 = Integer.valueOf(dr6S); totalD+=dr6; } else { dr6 = -1; }
        String dr7S = dr7Ed.getText().toString();
        if (isNumeric(dr7S)) { dr7 = Integer.valueOf(dr7S); totalD+=dr7; } else { dr7 = -1; }
        String dr8S = dr8Ed.getText().toString();
        if (isNumeric(dr8S)) { dr8 = Integer.valueOf(dr8S); totalD+=dr8; } else { dr8 = -1; }

        String dr9S = dr9Ed.getText().toString();
        if (isNumeric(dr9S)) { dr9 = Integer.valueOf(dr9S); totalD+=dr9; } else { dr9 = -1; }
        String dr10S = dr10Ed.getText().toString();
        if (isNumeric(dr10S)) { dr10 = Integer.valueOf(dr10S); totalD+=dr10; } else { dr10 = -1; }
        String dr11S = dr11Ed.getText().toString();
        if (isNumeric(dr11S)) { dr11 = Integer.valueOf(dr11S); totalD+=dr11; } else { dr11 = -1; }
        String dr12S = dr12Ed.getText().toString();
        if (isNumeric(dr12S)) { dr12 = Integer.valueOf(dr12S); totalD+=dr12; } else { dr12 = -1; }
        String dr13S = dr13Ed.getText().toString();
        if (isNumeric(dr13S)) { dr13 = Integer.valueOf(dr13S); totalD+=dr13; } else { dr13 = -1; }
        String dr14S = dr14Ed.getText().toString();
        if (isNumeric(dr14S)) { dr14 = Integer.valueOf(dr14S); totalD+=dr14; } else { dr14 = -1; }

        switch (v.getId()){
            case R.id.btn_computeD:
                int countN=Integer.valueOf(countDr);
                if(countN>=1){
                    change(dr1Ed,true); change(dr13Ed,false);change(dr2Ed,false);change(dr3Ed,false);change(dr4Ed,false);
                    change(dr5Ed,false);change(dr6Ed,false);change(dr7Ed,false);change(dr8Ed,false);
                    change(dr9Ed,false);change(dr14Ed,false);change(dr10Ed,false);change(dr11Ed,false);change(dr12Ed,false);
                } if(countN>=2){ dr2Ed.setVisibility(View.VISIBLE);change(dr14Ed,false); change(dr3Ed,false);change(dr4Ed,false);change(dr5Ed,false);
                change(dr6Ed,false);change(dr7Ed,false);change(dr8Ed,false);change(dr9Ed,false);change(dr10Ed,false);
                change(dr11Ed,false);change(dr12Ed,false); change(dr13Ed,false);
            } if(countN>=3){ change(dr14Ed,false); change(dr4Ed,false);change(dr5Ed,false);change(dr6Ed,false);
                change(dr7Ed,false);change(dr8Ed,false);change(dr9Ed,false);change(dr10Ed,false);
                change(dr11Ed,false);change(dr12Ed,false); change(dr13Ed,false);
                dr3Ed.setVisibility(View.VISIBLE);
            }if(countN>=4){change(dr14Ed,false); change(dr5Ed,false);change(dr6Ed,false);change(dr7Ed,false);change(dr8Ed,false);
                change(dr9Ed,false);change(dr10Ed,false);change(dr11Ed,false);change(dr12Ed,false);
                dr4Ed.setVisibility(View.VISIBLE);change(dr13Ed,false);
            }if(countN>=5){change(dr14Ed,false); change(dr6Ed,false);change(dr7Ed,false);change(dr8Ed,false);change(dr9Ed,false);
                dr5Ed.setVisibility(View.VISIBLE); change(dr10Ed,false);change(dr11Ed,false);change(dr12Ed,false);
            }if(countN>=6){change(dr14Ed,false); change(dr7Ed,false);change(dr8Ed,false);change(dr9Ed,false);change(dr10Ed,false);
                change(dr11Ed,false);change(dr12Ed,false);change(dr13Ed,false);
                dr6Ed.setVisibility(View.VISIBLE);
            }if(countN>=7){change(dr14Ed,false);change(dr8Ed,false);change(dr9Ed,false);change(dr10Ed,false);change(dr11Ed,false);
                dr12Ed.setVisibility(View.VISIBLE);change(dr13Ed,false);
            }if(countN>=8){change(dr14Ed,false); change(dr9Ed,false);change(dr10Ed,false);change(dr11Ed,false);change(dr12Ed,false);
                dr8Ed.setVisibility(View.VISIBLE);change(dr13Ed,false);
            }if(countN>=9){change(dr14Ed,false); change(dr10Ed,false);change(dr11Ed,false);change(dr12Ed,false);
                dr9Ed.setVisibility(View.VISIBLE);change(dr13Ed,false);
            }if(countN>=10){change(dr14Ed,false); change(dr11Ed,false);change(dr12Ed,false); change(dr13Ed,false);
                dr10Ed.setVisibility(View.VISIBLE);
            }if(countN>=11){ change(dr14Ed,false);change(dr12Ed,false);
                dr11Ed.setVisibility(View.VISIBLE);change(dr13Ed,false);
            }if(countN>=12){change(dr14Ed,false);
                dr12Ed.setVisibility(View.VISIBLE); change(dr13Ed,false);
            }if(countN>=13){change(dr14Ed,false);
                dr13Ed.setVisibility(View.VISIBLE);
            }if(countN>=14){
                dr14Ed.setVisibility(View.VISIBLE);
            }



                break;

            case R.id.btn_menu2:
                Intent intent = new Intent(com.example.finance.Main6Activity.this, Main2Activity.class);
                startActivity(intent);
                break;

            case R.id.btn_addD:
                Toast.makeText(this, "total " + totalD, Toast.LENGTH_SHORT).show();
                outItogoD.setText("" + String.valueOf(Math.round(totalD)) + " tenge");
                break;

            case R.id.btn_saveD:
                String valD=""+totalD;
                Toast.makeText(this, "val " + valD, Toast.LENGTH_SHORT).show();
                sharedPreferencesD=getSharedPreferences("SaveDataD", Context.MODE_PRIVATE);
                SharedPreferences.Editor editorD = sharedPreferencesD.edit();
                editorD.putString("ValueD",totalD+"");
                editorD.apply();

                break;
        }
    }

}
