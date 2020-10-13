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
    TextView output, deduct;


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


        TextWatcher textWatcher = new TextWatcher() {
            double finalIncome;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!incomeInput.getText().toString().equals("")) {
                    float income = Float.parseFloat(incomeInput.getText().toString());
//                    double deductible = Double.parseDouble(deduct.getText().toString());
                    finalIncome = (income * 0.7);
                    output.setText(String.valueOf(finalIncome));
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        incomeInput.addTextChangedListener(textWatcher);
        internetInput.addTextChangedListener(textWatcher);
        fuelInput.addTextChangedListener(textWatcher);
        phoneInput.addTextChangedListener(textWatcher);
        groceriesInput.addTextChangedListener(textWatcher);
        otherExpensesInput.addTextChangedListener(textWatcher);
    }


//    public static class calculatorWatcher implements TextWatcher {
//        private EditText mEditText;
//        int income;
//        int internet;
//        int groceries;
//        int phone;
//        int fuel;
//        int others;
//        String availableMoney;
//
//        private calculatorWatcher(EditText editText) {
//            mEditText = editText;
//        }
//
//        @Override
//        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//        }
//
//        @Override
//        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//            switch ((mEditText.getId())){
//                case R.id.incomeTextInput:
//                    income = Integer.parseInt(String.valueOf(charSequence));
//                    break;
//                case R.id.internetTextInput:
//                    internet = Integer.parseInt(String.valueOf(charSequence));
//                    break;
//                case R.id.groceriesTextInput:
//                    groceries = Integer.parseInt(String.valueOf(charSequence));
//                    break;
//                case R.id.phoneTextInput:
//                    phone = Integer.parseInt(String.valueOf(charSequence));
//                    break;
//                case R.id.fuelTextInput:
//                    fuel = Integer.parseInt(String.valueOf(charSequence));
//                    break;
//                case R.id.otherExpensesTextInput:
//                    others = Integer.parseInt(String.valueOf(charSequence));
//                    break;
//            }
//        }
//
//        @Override
//        public void afterTextChanged(Editable editable) {
//            availableMoney = Double.toString(income - (income *0.3) - internet - groceries -
//                    phone - fuel - others);
//
//            // For testing purposes available money is displayed in console
//            System.out.println(availableMoney);
//            //output.setText(availableMoney);
//        }
//
//    };

}