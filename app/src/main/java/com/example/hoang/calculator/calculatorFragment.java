package com.example.hoang.calculator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class calculatorFragment extends Fragment implements View.OnClickListener {
    private Button mbtn1, mbtn2, mbtn3, mbtn4, mbtn5, mbtn6, mbtn7, mbtn8, mbtn9, mbtn0, mbtndog, mbtnresult, mbtnsum, mbtnsubtraction, mbtndividion,
            mbtnmult, mbtntypenumber, mbtnpercent, mbtnac;
    public static final String NUMBER0 = "0";
    public static final String NUMBER1 = "1";
    public static final String NUMBER2 = "2";
    public static final String NUMBER3 = "3";
    public static final String NUMBER4 = "4";
    public static final String NUMBER5 = "5";
    public static final String NUMBER6 = "6";
    public static final String NUMBER7 = "7";
    public static final String NUMBER8 = "8";
    public static final String NUMBER9 = "9";
    public static final String TYPENUMBER = "-";
    public static final String DOGS = ".";
    public static final String AC = "";
    private Float x1, x2;
    private Float resut;
    private int casenumber = 0;
    private TextView textresutl;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_calculator, container, false);
        addControl(v);
        addevent();
        return v;
    }

    private void addevent() {
        mbtn0.setOnClickListener(this);
        mbtn1.setOnClickListener(this);
        mbtn2.setOnClickListener(this);
        mbtn3.setOnClickListener(this);
        mbtn4.setOnClickListener(this);
        mbtn5.setOnClickListener(this);
        mbtn6.setOnClickListener(this);
        mbtn7.setOnClickListener(this);
        mbtn8.setOnClickListener(this);
        mbtn9.setOnClickListener(this);
        mbtnac.setOnClickListener(this);
        mbtntypenumber.setOnClickListener(this);
        mbtnpercent.setOnClickListener(this);
        mbtndividion.setOnClickListener(this);
        mbtnsubtraction.setOnClickListener(this);
        mbtnsum.setOnClickListener(this);
        mbtnmult.setOnClickListener(this);
        mbtnresult.setOnClickListener(this);
        mbtndog.setOnClickListener(this);


    }

    private void addControl(View v) {
        mbtn0 = v.findViewById(R.id.btn0);
        mbtn1 = v.findViewById(R.id.btn1);
        mbtn2 = v.findViewById(R.id.btn2);
        mbtn3 = v.findViewById(R.id.btn3);
        mbtn4 = v.findViewById(R.id.btn4);
        mbtn5 = v.findViewById(R.id.btn5);
        mbtn6 = v.findViewById(R.id.btn6);
        mbtn7 = v.findViewById(R.id.btn7);
        mbtn8 = v.findViewById(R.id.btn8);
        mbtn9 = v.findViewById(R.id.btn9);
        mbtndog = v.findViewById(R.id.btndog);
        mbtnresult = v.findViewById(R.id.btnresutl);
        mbtnsubtraction = v.findViewById(R.id.btnsubtraction);
        mbtnsum = v.findViewById(R.id.btnsum);
        mbtndividion = v.findViewById(R.id.btndivision);
        mbtnmult = v.findViewById(R.id.btnmultip);
        mbtntypenumber = v.findViewById(R.id.btntypenumber);
        mbtnpercent = v.findViewById(R.id.btnpercent);
        mbtnac = v.findViewById(R.id.btnAC);
        textresutl = v.findViewById(R.id.txtresutl);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                textresutl.append(NUMBER0);
                break;
            case R.id.btn1:
                textresutl.append(NUMBER1);
                break;
            case R.id.btn2:
                textresutl.append(NUMBER2);
                break;
            case R.id.btn3:
                textresutl.append(NUMBER3);
                break;
            case R.id.btn4:
                textresutl.append(NUMBER4);
                break;
            case R.id.btn5:
                textresutl.append(NUMBER5);
                break;
            case R.id.btn6:
                textresutl.append(NUMBER6);
                break;
            case R.id.btn7:
                textresutl.append(NUMBER7);
                break;
            case R.id.btn8:
                textresutl.append(NUMBER8);
                break;
            case R.id.btn9:
                textresutl.append(NUMBER9);
                break;
            case R.id.btnsum:
                if (textresutl.getText().toString().equals("")) {
                } else {
                    x1 = Float.parseFloat(textresutl.getText().toString());
                    textresutl.setText(AC);
                    casenumber = 1;
                }

                break;
            case R.id.btnsubtraction:
                if (textresutl.getText().toString().equals("")) {
                } else {
                    x1 = Float.parseFloat(textresutl.getText().toString());
                    textresutl.setText(AC);
                    casenumber = 2;
                }
                break;
            case R.id.btndivision:
                if (textresutl.getText().toString().equals("")) {
                } else {
                    x1 = Float.parseFloat(textresutl.getText().toString());
                    textresutl.setText(AC);
                    casenumber = 3;
                }
                break;
            case R.id.btnmultip:
                if (textresutl.getText().toString().equals("")) {
                } else {
                    x1 = Float.parseFloat(textresutl.getText().toString());
                    textresutl.setText(AC);
                    casenumber = 4;
                }
                break;
            case R.id.btnAC:
                textresutl.setText(AC);
                break;
            case R.id.btntypenumber:
                textresutl.append(TYPENUMBER);
                break;
            case R.id.btnpercent:
                Float x = Float.parseFloat(textresutl.getText().toString());
                x = x / 100;
                textresutl.setText(String.valueOf(x));
                break;
            case R.id.btndog:
                textresutl.append(DOGS);
                break;
            case R.id.btnresutl:
                if (textresutl.getText().toString().equals("")) {

                } else {
                    x2 = Float.parseFloat(textresutl.getText().toString());
                    switch (casenumber) {
                        case 1:
                            resut = x1 + x2;
                            break;

                        case 2:
                            resut = x1 - x2;
                            break;

                        case 3:
                            resut = x1 / x2;
                            break;

                        case 4:
                            resut = x1 * x2;
                            break;
                    }
                    textresutl.setText(String.valueOf(resut));
                }
                break;
        }
    }
}
