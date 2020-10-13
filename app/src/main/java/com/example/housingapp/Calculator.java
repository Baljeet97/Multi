package com.example.housingapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {
    EditText incomeInput;
    EditText internetInput;
    EditText groceriesInput;
    EditText phoneInput;
    EditText fuelInput;
    EditText otherExpensesInput;
    TextView output, deduct, finalOutput, colourBarOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        incomeInput = findViewById(R.id.incomeTextInput);
        internetInput = findViewById(R.id.internetTextInput);
        groceriesInput = findViewById(R.id.groceriesTextInput);
        phoneInput = findViewById(R.id.phoneTextInput);
        fuelInput = findViewById(R.id.fuelTextInput);
        otherExpensesInput = findViewById(R.id.otherExpensesTextInput);
        output = findViewById(R.id.availableMoneyTextOutput);
        deduct = findViewById(R.id.deduct);
        finalOutput = findViewById(R.id.afterAllDeducted);
        colourBarOutput = findViewById(R.id.colourBar);


        TextWatcher textWatcher = new TextWatcher() {
            double finalIncome;
            double fullOutput;
            double fullIncome = 0;
            double internet = 0;
            double groceries = 0;
            double phone = 0;
            double fuel = 0;
            double others = 0;
            String outputText;

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!incomeInput.getText().toString().equals("")) {
                    float income = Float.parseFloat(incomeInput.getText().toString());
                    finalIncome = (income * 0.3);
                    fullIncome = income;
                    output.setText(String.valueOf(finalIncome));
                }

                if (!internetInput.getText().toString().equals("")) {
                    internet = Float.parseFloat(internetInput.getText().toString());
                }

                if (!groceriesInput.getText().toString().equals("")) {
                    groceries = Float.parseFloat(groceriesInput.getText().toString());
                }

                if (!phoneInput.getText().toString().equals("")) {
                    phone = Float.parseFloat(phoneInput.getText().toString());
                }

                if (!fuelInput.getText().toString().equals("")) {
                    fuel = Float.parseFloat(fuelInput.getText().toString());
                }

                if (!otherExpensesInput.getText().toString().equals("")) {
                    others = Float.parseFloat(otherExpensesInput.getText().toString());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                fullOutput = fullIncome - finalIncome - internet - groceries - phone - fuel - others;
                outputText = "$" + fullOutput;
                finalOutput.setText(outputText);
            }
        };
        incomeInput.addTextChangedListener(textWatcher);
        internetInput.addTextChangedListener(textWatcher);
        fuelInput.addTextChangedListener(textWatcher);
        phoneInput.addTextChangedListener(textWatcher);
        groceriesInput.addTextChangedListener(textWatcher);
        otherExpensesInput.addTextChangedListener(textWatcher);
    }

}