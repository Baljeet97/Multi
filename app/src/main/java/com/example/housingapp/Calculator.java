package com.example.housingapp;

import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.text.TextWatcher;
import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.navigation.NavigationView;

public class Calculator extends AppCompatActivity {
    EditText incomeInput;
    EditText internetInput;
    EditText groceriesInput;
    EditText phoneInput;
    EditText fuelInput;
    EditText otherExpensesInput;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        incomeInput = findViewById(R.id.incomeTextInput);
        incomeInput.addTextChangedListener(new calculatorWatcher(incomeInput));
        internetInput = findViewById(R.id.internetTextInput);
        internetInput.addTextChangedListener(new calculatorWatcher(internetInput));
        groceriesInput = findViewById(R.id.groceriesTextInput);
        groceriesInput.addTextChangedListener(new calculatorWatcher(groceriesInput));
        phoneInput = findViewById(R.id.phoneTextInput);
        phoneInput.addTextChangedListener(new calculatorWatcher(phoneInput));
        fuelInput= findViewById(R.id.fuelTextInput);
        fuelInput.addTextChangedListener(new calculatorWatcher(fuelInput));
        otherExpensesInput = findViewById(R.id.otherExpensesTextInput);
        otherExpensesInput.addTextChangedListener(new calculatorWatcher(otherExpensesInput));
        output = findViewById(R.id.availableMoneyTextOutput);
    }

    public static class calculatorWatcher implements TextWatcher {
        private EditText mEditText;
        int income;
        int internet;
        int groceries;
        int phone;
        int fuel;
        int others;
        String availableMoney;

        private calculatorWatcher(EditText editText) {
            mEditText = editText;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            switch ((mEditText.getId())){
                case R.id.incomeTextInput:
                    income = Integer.parseInt(String.valueOf(charSequence));
                    break;
                case R.id.internetTextInput:
                    internet = Integer.parseInt(String.valueOf(charSequence));
                    break;
                case R.id.groceriesTextInput:
                    groceries = Integer.parseInt(String.valueOf(charSequence));
                    break;
                case R.id.phoneTextInput:
                    phone = Integer.parseInt(String.valueOf(charSequence));
                    break;
                case R.id.fuelTextInput:
                    fuel = Integer.parseInt(String.valueOf(charSequence));
                    break;
                case R.id.otherExpensesTextInput:
                    others = Integer.parseInt(String.valueOf(charSequence));
                    break;
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {
            availableMoney = Double.toString(income - (income *0.3) - internet - groceries -
                    phone - fuel - others);

            // For testing purposes available money is displayed in console
            System.out.println(availableMoney);
            //output.setText(availableMoney);
        }

    };

}