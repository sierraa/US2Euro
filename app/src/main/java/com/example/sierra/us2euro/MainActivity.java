package com.example.sierra.us2euro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean leftSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
            MILES <> KMS
         */
        final EditText miles = (EditText) findViewById(R.id.milesField);
        final EditText kms = (EditText) findViewById(R.id.kmField);

        miles.setOnTouchListener(new View.OnTouchListener(){

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = true;
                return false;
            }
        });

        miles.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && leftSelected) {
                    Float mi = Float.valueOf(s.toString());
                    kms.setText(Float.toString(milesToKM(mi)));
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        kms.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = false;
                return false;
            }
        });

        kms.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && !leftSelected) {
                    Float km = Float.valueOf(s.toString());
                    miles.setText(Float.toString(KMsToMiles(km)));
                }
            }
        });

        /*
            (FLUID) OUNCES <> ML
         */

        final EditText ounces = (EditText) findViewById(R.id.ozField);
        final EditText mls = (EditText) findViewById(R.id.mLField);

        ounces.setOnTouchListener(new View.OnTouchListener(){

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = true;
                return false;
            }
        });

        ounces.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && leftSelected) {
                    Float oz = Float.valueOf(s.toString());
                    mls.setText(Float.toString(ozsToML(oz)));
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        mls.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = false;
                return false;
            }
        });

        mls.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0  && !leftSelected) {
                    Float ml = Float.valueOf(s.toString());
                    ounces.setText(Float.toString(mLToOzs(ml)));
                }
            }
        });

        final EditText pounds = (EditText) findViewById(R.id.lbsField);
        final EditText kgs = (EditText) findViewById(R.id.kgField);

        pounds.setOnTouchListener(new View.OnTouchListener(){

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = true;
                return false;
            }
        });

        pounds.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && leftSelected) {
                    Float lb = Float.valueOf(s.toString());
                    kgs.setText(Float.toString(lbsToKG(lb)));
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        kgs.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = false;
                return false;
            }
        });

        kgs.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0  && !leftSelected) {
                    Float kg = Float.valueOf(s.toString());
                    pounds.setText(Float.toString(kgToLBs(kg)));
                }
            }
        });

        /*
            FARENHEIT <> CELCIUS
         */

        final EditText fDegrees = (EditText) findViewById(R.id.fField);
        final EditText cDegrees = (EditText) findViewById(R.id.cField);

        fDegrees.setOnTouchListener(new View.OnTouchListener(){

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = true;
                return false;
            }
        });

        fDegrees.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && leftSelected) {
                    try {
                        Float f = Float.valueOf(s.toString());
                        cDegrees.setText(Float.toString(fToC(f)));
                    } catch (java.lang.NumberFormatException e) {
                        cDegrees.setText("0");
                    }
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        cDegrees.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View arg, MotionEvent m) {
                leftSelected = false;
                return false;
            }
        });

        cDegrees.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0  && !leftSelected) {
                    try {
                        Float c = Float.valueOf(s.toString());
                        fDegrees.setText(Float.toString(cToF(c)));

                    } catch (java.lang.NumberFormatException e) {
                        fDegrees.setText("0");
                    }
                }
            }
        });

    }

    public static float milesToKM(float miles) { return 1.609344f * miles; }

    public static float KMsToMiles(float km) {
        return 0.621371f * km;
    }

    public static float ozsToML(float oz) {
        return 29.574f * oz;
    }

    public static float mLToOzs(float ml) { return 0.0338f * ml; }

    public static float lbsToKG(float lbs) {
        return 0.453592f * lbs;
    }

    public static float kgToLBs(float kg) {
        return kg * 2.20462f;
    }

    public static float fToC(float f) {
        return (f - 32f)*5f/9f;
    }

    public static float cToF(float c) {
        return c * (9f/5f) + 32f;
    }
 }
