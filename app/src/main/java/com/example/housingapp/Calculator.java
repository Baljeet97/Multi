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
    int income;
    int internet;
    int groceries;
    int phone;
    int fuel;
    int others;
    String avlaibleMoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        incomeInput = findViewById(R.id.incomeTextInput);
        incomeInput.addTextChangedListener(textWatcher);
        internetInput = findViewById(R.id.internetTextInput);
        internetInput.addTextChangedListener(textWatcher);
        groceriesInput = findViewById(R.id.groceriesTextInput);
        groceriesInput.addTextChangedListener(textWatcher);
        phoneInput = findViewById(R.id.phoneTextInput);
        phoneInput.addTextChangedListener(textWatcher);
        fuelInput= findViewById(R.id.fuelTextInput);
        fuelInput.addTextChangedListener(textWatcher);
        otherExpensesInput = findViewById(R.id.otherExpensesTextInput);
        otherExpensesInput.addTextChangedListener(textWatcher);
        output = findViewById(R.id.availableMoneyTextOutput);
    }
    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

}