package com.example.renske.potato;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;


public class MainActivity extends AppCompatActivity {

    // initialize variables
    private ImageView cactus1, cactus2, cactus3, cactus4, cactus5, cactus6, cactus7, cactus8, plant1, plant2,
            pot1, pot2, pot3, pot4, pot5, pot6, pot7, pot8, pot9, pot10;
    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    private Switch plantpot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize all parts of the app (this can probably be done smarter)
        cactus1 = (ImageView) findViewById(R.id.Cactus1);
        cactus2 = (ImageView) findViewById(R.id.Cactus2);
        cactus3 = (ImageView) findViewById(R.id.Cactus3);
        cactus4 = (ImageView) findViewById(R.id.Cactus4);
        cactus5 = (ImageView) findViewById(R.id.Cactus5);
        cactus6 = (ImageView) findViewById(R.id.Cactus6);
        cactus7 = (ImageView) findViewById(R.id.Cactus7);
        cactus8 = (ImageView) findViewById(R.id.Cactus8);
        plant1 = (ImageView) findViewById(R.id.Plant1);
        plant2 = (ImageView) findViewById(R.id.Plant2);

        pot1 = (ImageView) findViewById(R.id.imageView11);
        pot2 = (ImageView) findViewById(R.id.imageView12);
        pot3 = (ImageView) findViewById(R.id.imageView13);
        pot4 = (ImageView) findViewById(R.id.imageView14);
        pot5 = (ImageView) findViewById(R.id.imageView15);
        pot6 = (ImageView) findViewById(R.id.imageView16);
        pot7 = (ImageView) findViewById(R.id.imageView17);
        pot8 = (ImageView) findViewById(R.id.imageView18);
        pot9 = (ImageView) findViewById(R.id.imageView19);
        pot10 = (ImageView) findViewById(R.id.imageView20);

        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);

        // credit for switch help: http://www.mysamplecode.com/2013/04/android-switch-button-example.html
        plantpot = (Switch) findViewById(R.id.switch1);
        //set the switch to ON
        plantpot.setChecked(true);
        //attach a listener to check for changes in state
        plantpot.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {

                if(isChecked){
                    // display the pots
                    pot1.setVisibility(View.VISIBLE);
                    pot2.setVisibility(View.VISIBLE);
                    pot3.setVisibility(View.VISIBLE);
                    pot4.setVisibility(View.VISIBLE);
                    pot5.setVisibility(View.VISIBLE);
                    pot6.setVisibility(View.VISIBLE);
                    pot7.setVisibility(View.VISIBLE);
                    pot8.setVisibility(View.VISIBLE);
                    pot9.setVisibility(View.VISIBLE);
                    pot10.setVisibility(View.VISIBLE);

                }else{
                    // dont display the pots
                    pot1.setVisibility(View.INVISIBLE);
                    pot2.setVisibility(View.INVISIBLE);
                    pot3.setVisibility(View.INVISIBLE);
                    pot4.setVisibility(View.INVISIBLE);
                    pot5.setVisibility(View.INVISIBLE);
                    pot6.setVisibility(View.INVISIBLE);
                    pot7.setVisibility(View.INVISIBLE);
                    pot8.setVisibility(View.INVISIBLE);
                    pot9.setVisibility(View.INVISIBLE);
                    pot10.setVisibility(View.INVISIBLE);
                }

            }
        });

        //check the current state before we display the screen
        if(plantpot.isChecked()){
            pot1.setVisibility(View.VISIBLE);
            pot2.setVisibility(View.VISIBLE);
            pot3.setVisibility(View.VISIBLE);
            pot4.setVisibility(View.VISIBLE);
            pot5.setVisibility(View.VISIBLE);
            pot6.setVisibility(View.VISIBLE);
            pot7.setVisibility(View.VISIBLE);
            pot8.setVisibility(View.VISIBLE);
            pot9.setVisibility(View.VISIBLE);
            pot10.setVisibility(View.VISIBLE);
        }
        else {
            pot1.setVisibility(View.INVISIBLE);
            pot2.setVisibility(View.INVISIBLE);
            pot3.setVisibility(View.INVISIBLE);
            pot4.setVisibility(View.INVISIBLE);
            pot5.setVisibility(View.INVISIBLE);
            pot6.setVisibility(View.INVISIBLE);
            pot7.setVisibility(View.INVISIBLE);
            pot8.setVisibility(View.INVISIBLE);
            pot9.setVisibility(View.INVISIBLE);
            pot10.setVisibility(View.INVISIBLE);
        }



    // make all invisible on launch
        cactus1.setVisibility(View.INVISIBLE);
        cactus2.setVisibility(View.INVISIBLE);
        cactus3.setVisibility(View.INVISIBLE);
        cactus4.setVisibility(View.INVISIBLE);
        cactus5.setVisibility(View.INVISIBLE);
        cactus6.setVisibility(View.INVISIBLE);
        cactus7.setVisibility(View.INVISIBLE);
        cactus8.setVisibility(View.INVISIBLE);
        plant1.setVisibility(View.INVISIBLE);
        plant2.setVisibility(View.INVISIBLE);


    }




    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked)
                    plant1.setVisibility(View.VISIBLE);
                else
                    plant1.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox2:
                if (checked)
                    cactus1.setVisibility(View.VISIBLE);
                else
                    cactus1.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox3:
                if (checked)
                    cactus8.setVisibility(View.VISIBLE);
                else
                    cactus8.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox4:
                if (checked)
                    cactus3.setVisibility(View.VISIBLE);
                else
                    cactus3.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox5:
                if (checked)
                    cactus2.setVisibility(View.VISIBLE);
                else
                    cactus2.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox6:
                if (checked)
                    cactus5.setVisibility(View.VISIBLE);
                else
                    cactus5.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox7:
                if (checked)
                    cactus6.setVisibility(View.VISIBLE);
                else
                    cactus6.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox8:
                if (checked)
                    cactus7.setVisibility(View.VISIBLE);
                else
                    cactus7.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox9:
                if (checked)
                    cactus4.setVisibility(View.VISIBLE);
                else
                    cactus4.setVisibility(View.INVISIBLE);
                break;
            case R.id.checkBox10:
                if (checked)
                    plant2.setVisibility(View.VISIBLE);
                else
                    plant2.setVisibility(View.INVISIBLE);
                break;
        }
    }


    }


