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

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner_count;
    String[] count = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13","14"};
    SharedPreferences sharedPreferences;
    TextView outItogo;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final Button button = findViewById(R.id.btn_add);
        final Button backButton = findViewById(R.id.btn_menu2);
        final Button buttonComp = findViewById(R.id.btn_compute);
        final Button buttonSave=findViewById(R.id.btn_save);

        button.setOnClickListener(this);
        backButton.setOnClickListener(this);
        buttonComp.setOnClickListener(this);
        buttonSave.setOnClickListener(this);

        //Get values
        final EditText konsign1Ed = findViewById(R.id.konsign1);
        final EditText konsign2Ed = findViewById(R.id.konsign2);
        final EditText konsign3Ed = findViewById(R.id.konsign3);
        final EditText konsign4Ed = findViewById(R.id.konsign4);
        final EditText konsign5Ed = findViewById(R.id.konsign5);
        final EditText konsign6Ed = findViewById(R.id.konsign6);
        final EditText konsign7Ed = findViewById(R.id.konsign7);
        final EditText konsign8Ed = findViewById(R.id.konsign8);
        final EditText konsign9Ed = findViewById(R.id.konsign9);
        final EditText konsign10Ed = findViewById(R.id.konsign10);
        final EditText konsign11Ed = findViewById(R.id.konsign11);
        final EditText konsign12Ed = findViewById(R.id.konsign12);
        final EditText konsign13Ed = findViewById(R.id.konsign13);
        final EditText konsign14Ed = findViewById(R.id.konsign14);
        konsign1Ed.setVisibility(View.GONE);
        konsign2Ed.setVisibility(View.GONE);
        konsign3Ed.setVisibility(View.GONE);
        konsign4Ed.setVisibility(View.GONE);
        konsign5Ed.setVisibility(View.GONE);
        konsign6Ed.setVisibility(View.GONE);
        konsign7Ed.setVisibility(View.GONE);
        konsign8Ed.setVisibility(View.GONE);
        konsign9Ed.setVisibility(View.GONE);
        konsign10Ed.setVisibility(View.GONE);
        konsign11Ed.setVisibility(View.GONE);
        konsign12Ed.setVisibility(View.GONE);
        konsign13Ed.setVisibility(View.GONE);
        konsign14Ed.setVisibility(View.GONE);


        spinner_count = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, count);
        spinner_count.setAdapter(arrayAdapter);

    }

    @Override
    public void onClick (View v) {
        final EditText konsign1Ed = findViewById(R.id.konsign1);
        final EditText konsign2Ed = findViewById(R.id.konsign2);
        final EditText konsign3Ed = findViewById(R.id.konsign3);
        final EditText konsign4Ed = findViewById(R.id.konsign4);
        final EditText konsign5Ed = findViewById(R.id.konsign5);
        final EditText konsign6Ed = findViewById(R.id.konsign6);
        final EditText konsign7Ed = findViewById(R.id.konsign7);
        final EditText konsign8Ed = findViewById(R.id.konsign8);
        final EditText konsign9Ed = findViewById(R.id.konsign9);
        final EditText konsign10Ed = findViewById(R.id.konsign10);
        final EditText konsign11Ed = findViewById(R.id.konsign11);
        final EditText konsign12Ed = findViewById(R.id.konsign12);
        final EditText konsign13Ed = findViewById(R.id.konsign13);
        final EditText konsign14Ed = findViewById(R.id.konsign14);
         outItogo = findViewById(R.id.textItogo);

        String count = spinner_count.getSelectedItem().toString();

        int total=0;

        int konsign1,konsign2,konsign3,konsign4,konsign5,konsign6,konsign7,konsign8,konsign9,konsign10,konsign13,konsign14,  konsign11,konsign12;

        String konsign1S = konsign1Ed.getText().toString();
        if (isNumeric(konsign1S)) { konsign1 = Integer.valueOf(konsign1S); total+=konsign1; } else { konsign1 = -1; }

        // Toast.makeText(this, "back button clicked" + total, Toast.LENGTH_SHORT).show();

        String konsign2S = konsign2Ed.getText().toString();
        if (isNumeric(konsign2S)) { konsign2 = Integer.valueOf(konsign2S); total+=konsign2; } else { konsign2 = -1; }
        String konsign3S = konsign3Ed.getText().toString();
        if (isNumeric(konsign3S)) { konsign3 = Integer.valueOf(konsign3S); total+=konsign3; } else { konsign3 = -1; }
        String konsign4S = konsign4Ed.getText().toString();
        if (isNumeric(konsign4S)) { konsign4 = Integer.valueOf(konsign4S); total+=konsign4; } else { konsign4 = -1; }

        String konsign5S = konsign5Ed.getText().toString();
        if (isNumeric(konsign5S)) { konsign5 = Integer.valueOf(konsign5S); total+=konsign5;} else { konsign5 = -1; }
        String konsign6S = konsign6Ed.getText().toString();
        if (isNumeric(konsign6S)) { konsign6 = Integer.valueOf(konsign6S); total+=konsign6;} else { konsign6 = -1; }
        String konsign7S = konsign7Ed.getText().toString();
        if (isNumeric(konsign7S)) { konsign7 = Integer.valueOf(konsign7S); total+=konsign7;} else { konsign7 = -1; }
        String konsign8S = konsign8Ed.getText().toString();
        if (isNumeric(konsign8S)) { konsign8 = Integer.valueOf(konsign8S); total+=konsign8;} else { konsign8 = -1; }

        String konsign9S = konsign9Ed.getText().toString();
        if (isNumeric(konsign9S)) { konsign9 = Integer.valueOf(konsign9S); total+=konsign9;} else { konsign9 = -1; }
        String konsign10S = konsign10Ed.getText().toString();
        if (isNumeric(konsign10S)) { konsign10 = Integer.valueOf(konsign10S); total+=konsign10; } else { konsign10 = -1; }
        String konsign11S = konsign11Ed.getText().toString();
        if (isNumeric(konsign11S)) { konsign11 = Integer.valueOf(konsign11S); total+=konsign11;} else { konsign11 = -1; }
        String konsign12S = konsign12Ed.getText().toString();
        if (isNumeric(konsign12S)) { konsign12 = Integer.valueOf(konsign12S); total+=konsign12;} else { konsign12 = -1; }
        String konsign13S = konsign13Ed.getText().toString();
        if (isNumeric(konsign13S)) { konsign13 = Integer.valueOf(konsign13S); total+=konsign13;} else { konsign13 = -1; }
        String konsign14S = konsign14Ed.getText().toString();
        if (isNumeric(konsign14S)) { konsign14 = Integer.valueOf(konsign14S); total+=konsign14; } else { konsign14 = -1; }

        switch (v.getId()){
            case R.id.btn_compute:
                int countN=Integer.valueOf(count);
                if(countN>=1){
                    change(konsign1Ed,true); change(konsign13Ed,false);change(konsign2Ed,false);change(konsign3Ed,false);change(konsign4Ed,false);
                    change(konsign5Ed,false);change(konsign6Ed,false);change(konsign7Ed,false);change(konsign8Ed,false);
                    change(konsign9Ed,false);change(konsign14Ed,false);change(konsign10Ed,false);change(konsign11Ed,false);change(konsign12Ed,false);
                } if(countN>=2){ konsign2Ed.setVisibility(View.VISIBLE);change(konsign14Ed,false); change(konsign3Ed,false);change(konsign4Ed,false);change(konsign5Ed,false);
                change(konsign6Ed,false);change(konsign7Ed,false);change(konsign8Ed,false);change(konsign9Ed,false);change(konsign10Ed,false);
                change(konsign11Ed,false);change(konsign12Ed,false); change(konsign13Ed,false);
                } if(countN>=3){ change(konsign14Ed,false); change(konsign4Ed,false);change(konsign5Ed,false);change(konsign6Ed,false);
                change(konsign7Ed,false);change(konsign8Ed,false);change(konsign9Ed,false);change(konsign10Ed,false);
                change(konsign11Ed,false);change(konsign12Ed,false); change(konsign13Ed,false);
                konsign3Ed.setVisibility(View.VISIBLE);
            }if(countN>=4){change(konsign14Ed,false); change(konsign5Ed,false);change(konsign6Ed,false);change(konsign7Ed,false);change(konsign8Ed,false);
                change(konsign9Ed,false);change(konsign10Ed,false);change(konsign11Ed,false);change(konsign12Ed,false);
                konsign4Ed.setVisibility(View.VISIBLE);change(konsign13Ed,false);
            }if(countN>=5){change(konsign14Ed,false); change(konsign6Ed,false);change(konsign7Ed,false);change(konsign8Ed,false);change(konsign9Ed,false);
                konsign5Ed.setVisibility(View.VISIBLE); change(konsign10Ed,false);change(konsign11Ed,false);change(konsign12Ed,false);
            }if(countN>=6){change(konsign14Ed,false); change(konsign7Ed,false);change(konsign8Ed,false);change(konsign9Ed,false);change(konsign10Ed,false);
                change(konsign11Ed,false);change(konsign12Ed,false);change(konsign13Ed,false);
                konsign6Ed.setVisibility(View.VISIBLE);
            }if(countN>=7){change(konsign14Ed,false);change(konsign8Ed,false);change(konsign9Ed,false);change(konsign10Ed,false);change(konsign11Ed,false);
                konsign12Ed.setVisibility(View.VISIBLE);change(konsign13Ed,false);
            }if(countN>=8){change(konsign14Ed,false); change(konsign9Ed,false);change(konsign10Ed,false);change(konsign11Ed,false);change(konsign12Ed,false);
                konsign8Ed.setVisibility(View.VISIBLE);change(konsign13Ed,false);
            }if(countN>=9){change(konsign14Ed,false); change(konsign10Ed,false);change(konsign11Ed,false);change(konsign12Ed,false);
                konsign9Ed.setVisibility(View.VISIBLE);change(konsign13Ed,false);
            }if(countN>=10){change(konsign14Ed,false); change(konsign11Ed,false);change(konsign12Ed,false); change(konsign13Ed,false);
                konsign10Ed.setVisibility(View.VISIBLE);
            }if(countN>=11){ change(konsign14Ed,false);change(konsign12Ed,false);
                konsign11Ed.setVisibility(View.VISIBLE);change(konsign13Ed,false);
            }if(countN>=12){change(konsign14Ed,false);
                konsign12Ed.setVisibility(View.VISIBLE); change(konsign13Ed,false);
            }if(countN>=13){change(konsign14Ed,false);
            konsign13Ed.setVisibility(View.VISIBLE);
        }if(countN>=14){
            konsign14Ed.setVisibility(View.VISIBLE);
                }



                break;

            case R.id.btn_menu2:
                //Toast.makeText(this, "total " + total, Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(com.example.finance.Main4Activity.this, Main2Activity.class);
                intent1.setAction("backActivity");
                startActivity(intent1);
                break;

            case R.id.btn_add:
                Toast.makeText(this, "total " + total, Toast.LENGTH_SHORT).show();
                outItogo.setText("" + String.valueOf(Math.round(total)) + " тенге");
               // outItogo.setText(sharedPreferences.getString("Value","Not found"));
                break;

            case R.id.btn_save:
                String val=""+total;
                Toast.makeText(this, "val " + val, Toast.LENGTH_SHORT).show();

                sharedPreferences=getSharedPreferences("SaveData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Value",total+"");
                editor.apply();

                break;

        }
    }

}

