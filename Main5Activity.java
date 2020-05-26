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

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner_countZ;
    String[] countZ = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13","14"};
    SharedPreferences sharedPreferencesZ;
    TextView outItogoZ;

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
        setContentView(R.layout.activity_main5);
        final Button buttonZ = findViewById(R.id.btn_addZ);
        final Button backButtonZ = findViewById(R.id.btn_menu2);
        final Button buttonCompZ = findViewById(R.id.btn_computeZ);
        final Button buttonSaveZ=findViewById(R.id.btn_saveZ);

        buttonZ.setOnClickListener(this);
        backButtonZ.setOnClickListener(this);
        buttonCompZ.setOnClickListener(this);
        buttonSaveZ.setOnClickListener(this);

        //Get values
        final EditText zakup1Ed = findViewById(R.id.zakup1);
        final EditText zakup2Ed = findViewById(R.id.zakup2);
        final EditText zakup3Ed = findViewById(R.id.zakup3);
        final EditText zakup4Ed = findViewById(R.id.zakup4);
        final EditText zakup5Ed = findViewById(R.id.zakup5);
        final EditText zakup6Ed = findViewById(R.id.zakup6);
        final EditText zakup7Ed = findViewById(R.id.zakup7);
        final EditText zakup8Ed = findViewById(R.id.zakup8);
        final EditText zakup9Ed = findViewById(R.id.zakup9);
        final EditText zakup10Ed = findViewById(R.id.zakup10);
        final EditText zakup11Ed = findViewById(R.id.zakup11);
        final EditText zakup12Ed = findViewById(R.id.zakup12);
        final EditText zakup13Ed = findViewById(R.id.zakup13);
        final EditText zakup14Ed = findViewById(R.id.zakup14);
        zakup1Ed.setVisibility(View.GONE);
        zakup2Ed.setVisibility(View.GONE);
        zakup3Ed.setVisibility(View.GONE);
        zakup4Ed.setVisibility(View.GONE);
        zakup5Ed.setVisibility(View.GONE);
        zakup6Ed.setVisibility(View.GONE);
        zakup7Ed.setVisibility(View.GONE);
        zakup8Ed.setVisibility(View.GONE);
        zakup9Ed.setVisibility(View.GONE);
        zakup10Ed.setVisibility(View.GONE);
        zakup11Ed.setVisibility(View.GONE);
        zakup12Ed.setVisibility(View.GONE);
        zakup13Ed.setVisibility(View.GONE);
        zakup14Ed.setVisibility(View.GONE);


        spinner_countZ = (Spinner) findViewById(R.id.spinnerZ);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countZ);
        spinner_countZ.setAdapter(arrayAdapter);

    }

    @Override
    public void onClick (View v) {
        final EditText zakup1Ed = findViewById(R.id.zakup1);
        final EditText zakup2Ed = findViewById(R.id.zakup2);
        final EditText zakup3Ed = findViewById(R.id.zakup3);
        final EditText zakup4Ed = findViewById(R.id.zakup4);
        final EditText zakup5Ed = findViewById(R.id.zakup5);
        final EditText zakup6Ed = findViewById(R.id.zakup6);
        final EditText zakup7Ed = findViewById(R.id.zakup7);
        final EditText zakup8Ed = findViewById(R.id.zakup8);
        final EditText zakup9Ed = findViewById(R.id.zakup9);
        final EditText zakup10Ed = findViewById(R.id.zakup10);
        final EditText zakup11Ed = findViewById(R.id.zakup11);
        final EditText zakup12Ed = findViewById(R.id.zakup12);
        final EditText zakup13Ed = findViewById(R.id.zakup13);
        final EditText zakup14Ed = findViewById(R.id.zakup14);
        outItogoZ = findViewById(R.id.textItogoZ);

        String count = spinner_countZ.getSelectedItem().toString();

        int totalZ=0;

        int zakup1,zakup2,zakup3,zakup4,zakup5,zakup6,zakup7,zakup8,zakup9,zakup10,zakup13,zakup14,  zakup11,zakup12;

        String zakup1S = zakup1Ed.getText().toString();
        if (isNumeric(zakup1S)) { zakup1 = Integer.valueOf(zakup1S); totalZ+=zakup1; } else { zakup1 = -1; }
        String zakup2S = zakup2Ed.getText().toString();
        if (isNumeric(zakup2S)) { zakup2 = Integer.valueOf(zakup2S); totalZ+=zakup2; } else { zakup2 = -1; }
        String zakup3S = zakup3Ed.getText().toString();
        if (isNumeric(zakup3S)) { zakup3 = Integer.valueOf(zakup3S); totalZ+=zakup3; } else { zakup3 = -1; }
        String zakup4S = zakup4Ed.getText().toString();
        if (isNumeric(zakup4S)) { zakup4 = Integer.valueOf(zakup4S); totalZ+=zakup4; } else { zakup4 = -1; }

        String zakup5S = zakup5Ed.getText().toString();
        if (isNumeric(zakup5S)) { zakup5 = Integer.valueOf(zakup5S); totalZ+=zakup5; } else { zakup5 = -1; }
        String zakup6S = zakup6Ed.getText().toString();
        if (isNumeric(zakup6S)) { zakup6 = Integer.valueOf(zakup6S); totalZ+=zakup6; } else { zakup6 = -1; }
        String zakup7S = zakup7Ed.getText().toString();
        if (isNumeric(zakup7S)) { zakup7 = Integer.valueOf(zakup7S); totalZ+=zakup7; } else { zakup7 = -1; }
        String zakup8S = zakup8Ed.getText().toString();
        if (isNumeric(zakup8S)) { zakup8 = Integer.valueOf(zakup8S); totalZ+=zakup8; } else { zakup8 = -1; }

        String zakup9S = zakup9Ed.getText().toString();
        if (isNumeric(zakup9S)) { zakup9 = Integer.valueOf(zakup9S); totalZ+=zakup9; } else { zakup9 = -1; }
        String zakup10S = zakup10Ed.getText().toString();
        if (isNumeric(zakup10S)) { zakup10 = Integer.valueOf(zakup10S); totalZ+=zakup10; } else { zakup10 = -1; }
        String zakup11S = zakup11Ed.getText().toString();
        if (isNumeric(zakup11S)) { zakup11 = Integer.valueOf(zakup11S); totalZ+=zakup11; } else { zakup11 = -1; }
        String zakup12S = zakup12Ed.getText().toString();
        if (isNumeric(zakup12S)) { zakup12 = Integer.valueOf(zakup12S); totalZ+=zakup12; } else { zakup12 = -1; }
        String zakup13S = zakup13Ed.getText().toString();
        if (isNumeric(zakup13S)) { zakup13 = Integer.valueOf(zakup13S); totalZ+=zakup13; } else { zakup13 = -1; }
        String zakup14S = zakup14Ed.getText().toString();
        if (isNumeric(zakup14S)) { zakup14 = Integer.valueOf(zakup14S); totalZ+=zakup14; } else { zakup14 = -1; }

        switch (v.getId()){
            case R.id.btn_computeZ:
                int countN=Integer.valueOf(count);
                if(countN>=1){
                    change(zakup1Ed,true); change(zakup13Ed,false);change(zakup2Ed,false);change(zakup3Ed,false);change(zakup4Ed,false);
                    change(zakup5Ed,false);change(zakup6Ed,false);change(zakup7Ed,false);change(zakup8Ed,false);
                    change(zakup9Ed,false);change(zakup14Ed,false);change(zakup10Ed,false);change(zakup11Ed,false);change(zakup12Ed,false);
                } if(countN>=2){ zakup2Ed.setVisibility(View.VISIBLE);change(zakup14Ed,false); change(zakup3Ed,false);change(zakup4Ed,false);change(zakup5Ed,false);
                change(zakup6Ed,false);change(zakup7Ed,false);change(zakup8Ed,false);change(zakup9Ed,false);change(zakup10Ed,false);
                change(zakup11Ed,false);change(zakup12Ed,false); change(zakup13Ed,false);
            } if(countN>=3){ change(zakup14Ed,false); change(zakup4Ed,false);change(zakup5Ed,false);change(zakup6Ed,false);
                change(zakup7Ed,false);change(zakup8Ed,false);change(zakup9Ed,false);change(zakup10Ed,false);
                change(zakup11Ed,false);change(zakup12Ed,false); change(zakup13Ed,false);
                zakup3Ed.setVisibility(View.VISIBLE);
            }if(countN>=4){change(zakup14Ed,false); change(zakup5Ed,false);change(zakup6Ed,false);change(zakup7Ed,false);change(zakup8Ed,false);
                change(zakup9Ed,false);change(zakup10Ed,false);change(zakup11Ed,false);change(zakup12Ed,false);
                zakup4Ed.setVisibility(View.VISIBLE);change(zakup13Ed,false);
            }if(countN>=5){change(zakup14Ed,false); change(zakup6Ed,false);change(zakup7Ed,false);change(zakup8Ed,false);change(zakup9Ed,false);
                zakup5Ed.setVisibility(View.VISIBLE); change(zakup10Ed,false);change(zakup11Ed,false);change(zakup12Ed,false);
            }if(countN>=6){change(zakup14Ed,false); change(zakup7Ed,false);change(zakup8Ed,false);change(zakup9Ed,false);change(zakup10Ed,false);
                change(zakup11Ed,false);change(zakup12Ed,false);change(zakup13Ed,false);
                zakup6Ed.setVisibility(View.VISIBLE);
            }if(countN>=7){change(zakup14Ed,false);change(zakup8Ed,false);change(zakup9Ed,false);change(zakup10Ed,false);change(zakup11Ed,false);
                zakup12Ed.setVisibility(View.VISIBLE);change(zakup13Ed,false);
            }if(countN>=8){change(zakup14Ed,false); change(zakup9Ed,false);change(zakup10Ed,false);change(zakup11Ed,false);change(zakup12Ed,false);
                zakup8Ed.setVisibility(View.VISIBLE);change(zakup13Ed,false);
            }if(countN>=9){change(zakup14Ed,false); change(zakup10Ed,false);change(zakup11Ed,false);change(zakup12Ed,false);
                zakup9Ed.setVisibility(View.VISIBLE);change(zakup13Ed,false);
            }if(countN>=10){change(zakup14Ed,false); change(zakup11Ed,false);change(zakup12Ed,false); change(zakup13Ed,false);
                zakup10Ed.setVisibility(View.VISIBLE);
            }if(countN>=11){ change(zakup14Ed,false);change(zakup12Ed,false);
                zakup11Ed.setVisibility(View.VISIBLE);change(zakup13Ed,false);
            }if(countN>=12){change(zakup14Ed,false);
                zakup12Ed.setVisibility(View.VISIBLE); change(zakup13Ed,false);
            }if(countN>=13){change(zakup14Ed,false);
                zakup13Ed.setVisibility(View.VISIBLE);
            }if(countN>=14){
                zakup14Ed.setVisibility(View.VISIBLE);
            }



                break;

            case R.id.btn_menu2:
                //Toast.makeText(this, "total " + total, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(com.example.finance.Main5Activity.this, Main2Activity.class);
                startActivity(intent);
                break;

            case R.id.btn_addZ:
                Toast.makeText(this, "total " + totalZ, Toast.LENGTH_SHORT).show();
                outItogoZ.setText("" + String.valueOf(Math.round(totalZ)) + " тенге");
                // outItogo.setText(sharedPreferences.getString("Value","Not found"));
                break;

            case R.id.btn_saveZ:
                String valZ=""+totalZ;
                Toast.makeText(this, "val " + valZ, Toast.LENGTH_SHORT).show();

                sharedPreferencesZ=getSharedPreferences("SaveDataZ", Context.MODE_PRIVATE);
                SharedPreferences.Editor editorZ = sharedPreferencesZ.edit();
                editorZ.putString("ValueZ",""+totalZ);
                editorZ.apply();

                break;
        }
    }

}
