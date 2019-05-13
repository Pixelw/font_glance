package com.pixel.fontglance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout textInputLayout;
    private EditText exampleText;
    private TextView textBox1;
    private TextView textBox2;
    private TextView textBox3;
    private TextView textBox4;
    private TextView textBox5;
    private TextView textBox6;
    private TextView textBox7;
    private TextView textBox8;
    private TextView textBox9;
    private SeekBar seekBar;
    private TextView tvSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputLayout = findViewById(R.id.textInputLayout);
        exampleText = textInputLayout.getEditText();
        textBox1 = findViewById(R.id.textBox1);
        textBox2 = findViewById(R.id.textBox2);
        textBox3 = findViewById(R.id.textBox3);
        textBox4 = findViewById(R.id.textBox4);
        textBox5 = findViewById(R.id.textBox5);
        textBox6 = findViewById(R.id.textBox6);
        textBox7 = findViewById(R.id.textBox7);
        textBox8 = findViewById(R.id.textBox8);
        textBox9 = findViewById(R.id.textBox9);
        seekBar = findViewById(R.id.seekbar);
        tvSize = findViewById(R.id.tvSize);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSize.setText(String.valueOf(progress));
                float f_progress = (float) progress;
                textBox1.setTextSize(f_progress);
                textBox2.setTextSize(f_progress);
                textBox3.setTextSize(f_progress);
                textBox4.setTextSize(f_progress);
                textBox5.setTextSize(f_progress);
                textBox6.setTextSize(f_progress);
                textBox7.setTextSize(f_progress);
                textBox8.setTextSize(f_progress);
                textBox9.setTextSize(f_progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        exampleText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
            }

            @Override
            public void afterTextChanged(Editable s) {
                String s1 = exampleText.getText().toString();
                textBox1.setText(s1);
                textBox2.setText(s1);
                textBox3.setText(s1);
                textBox4.setText(s1);
                textBox5.setText(s1);
                textBox6.setText(s1);
                textBox7.setText(s1);
                textBox8.setText(s1);
                textBox9.setText(s1);
            }
        });

    }
}
