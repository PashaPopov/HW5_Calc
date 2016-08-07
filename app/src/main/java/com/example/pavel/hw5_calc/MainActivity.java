package com.example.pavel.hw5_calc;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class MainActivity extends Activity implements View.OnClickListener {
    Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, div, mult, is, clear, point;
    TextView et;
    double fst, snd, result;
    String action, temp;
    LinearLayout lay;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay = (LinearLayout) findViewById(R.id.Layout);
        sw = (Switch) findViewById(R.id.switch1);
        fst = 0.0;
        snd = 0.0;
        action = "";
        et = (TextView) findViewById(R.id.textView);
        one = (Button) findViewById(R.id.Button);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.Button2);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.Button3);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.Button4);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.Button5);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.Button6);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.Button7);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.Button8);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.Button9);
        nine.setOnClickListener(this);
        zero = (Button) findViewById(R.id.Button10);
        zero.setOnClickListener(this);
        point = (Button) findViewById(R.id.Button11);
        point.setOnClickListener(this);
        is = (Button) findViewById(R.id.Button12);
        is.setOnClickListener(this);
        plus = (Button) findViewById(R.id.Button13);
        plus.setOnClickListener(this);
        minus = (Button) findViewById(R.id.Button14);
        minus.setOnClickListener(this);
        mult = (Button) findViewById(R.id.Button15);
        mult.setOnClickListener(this);
        div = (Button) findViewById(R.id.Button16);
        div.setOnClickListener(this);
        clear = (Button) findViewById(R.id.Button17);
        clear.setOnClickListener(this);
        sw.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lay.setBackgroundColor(Color.GRAY);
                    plus.setTextColor(Color.WHITE);
                    minus.setTextColor(Color.WHITE);
                    mult.setTextColor(Color.WHITE);
                    div.setTextColor(Color.WHITE);
                    point.setTextColor(Color.WHITE);
                } else {
                    lay.setBackgroundColor(Color.WHITE);
                    plus.setTextColor(Color.BLACK);
                    minus.setTextColor(Color.BLACK);
                    mult.setTextColor(Color.BLACK);
                    div.setTextColor(Color.BLACK);
                    point.setTextColor(Color.BLACK);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {


        if ((v.getId() == R.id.Button)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "1";
                et.setText(temp);
            } else et.setText("1");
        }
        if ((v.getId() == R.id.Button2)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "2";
                et.setText(temp);
            } else et.setText("2");
        }
        if ((v.getId() == R.id.Button3)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "3";
                et.setText(temp);
            } else et.setText("3");
        }
        if ((v.getId() == R.id.Button4)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "4";
                et.setText(temp);
            } else et.setText("4");
        }
        if ((v.getId() == R.id.Button5)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "5";
                et.setText(temp);
            } else et.setText("5");
        }
        if ((v.getId() == R.id.Button6)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "6";
                et.setText(temp);
            } else et.setText("6");
        }

        if ((v.getId() == R.id.Button7)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "7";
                et.setText(temp);
            } else et.setText("7");
        }
        if ((v.getId() == R.id.Button8)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "8";
                et.setText(temp);
            } else et.setText("8");
        }
        if ((v.getId() == R.id.Button9)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "9";
                et.setText(temp);
            } else et.setText("9");
        }
        if ((v.getId() == R.id.Button10)) {
            if ((et.getText().toString() != null)) {
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + "0";
                et.setText(temp);
            } else et.setText("0");
        }
        if ((v.getId() == R.id.Button11))                                      //point
        {
            if (et.getText().toString() != null) {
                if (et.getText().toString().isEmpty() == true) {
                    et.setText("0");
                }
                if (et.getText().toString().contains(".")){}
                else{
                et.getSelectionEnd();
                temp = (et.getText().toString());
                temp = temp + ".";
                et.setText(temp);
            }}
        }

        if ((v.getId() == R.id.Button12)) //=
        {
            if (action.isEmpty() == true || et.getText().toString().isEmpty() == true) {
                Toast empty = Toast.makeText(getApplicationContext(), "No data for calculating!!!", Toast.LENGTH_SHORT);
                empty.show();
                et.setText("");
            } else if (fst != 0.0) {
                snd = Double.parseDouble(et.getText().toString());
            }
            if (action.matches("plus")) {
                result = fst + snd;
            }
            if (action.matches("minus")) {
                result = fst - snd;
            }
            if (action.matches("multi")) {
                result = fst * snd;
            }
            if (action.matches("div")) {
                result = fst / snd;
            }
            if (result == 0.0) {
                et.setText("");
            } else et.setText(Double.toString(result));


        }
        if ((v.getId() == R.id.Button13))                                       //plus
        {
            if (et.getText().toString().isEmpty() == true) {
                Toast empty = Toast.makeText(getApplicationContext(), "No data for calculating!!!", Toast.LENGTH_SHORT);
                empty.show();
            } else
                fst = Double.parseDouble(et.getText().toString());
            et.setText("");
            action = "plus";
        }

        if ((v.getId() == R.id.Button14))                                      //minus
        {
            if (et.getText().toString().isEmpty() == true) {
                Toast empty = Toast.makeText(getApplicationContext(), "No data for calculating!!!", Toast.LENGTH_SHORT);
                empty.show();
            } else
                fst = Double.parseDouble(et.getText().toString());
            et.setText("");
            action = "minus";
        }
        if ((v.getId() == R.id.Button15))                                        //multi
        {
            if (et.getText().toString().isEmpty() == true) {
                Toast empty = Toast.makeText(getApplicationContext(), "No data for calculating!!!", Toast.LENGTH_SHORT);
                empty.show();
            } else
                fst = Double.parseDouble(et.getText().toString());
            et.setText("");
            action = "multi";
        }
        if ((v.getId() == R.id.Button16))                                        //div
        {
            if (et.getText().toString().isEmpty() == true) {
                Toast empty = Toast.makeText(getApplicationContext(), "No data for calculating!!!", Toast.LENGTH_SHORT);
                empty.show();
            } else
                fst = Double.parseDouble(et.getText().toString());
            et.setText("");
            action = "div";
        }
        if ((v.getId() == R.id.Button17)) //clear
        {
            et.setText("");
            fst = 0.0;
            snd = 0.0;
        }
    }
}