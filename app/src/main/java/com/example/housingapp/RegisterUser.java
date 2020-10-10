package com.example.housingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterUser extends AppCompatActivity implements View.OnClickListener {

    private EditText editName, editEmail, editDob, editNumber, editCompanyName,
            editPosition, editTime, editContractTime, editEmpName, editEmpContact,
            editType, editPayment, editOwnerName, editReason, editPassword;
    private Button registerUser, signPage;
    ProgressBar progressBar;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        mAuth = FirebaseAuth.getInstance();

        editName = findViewById(R.id.name);
        editEmail = findViewById(R.id.email);
        editDob = findViewById(R.id.dob);
        editNumber = findViewById(R.id.number);
        editCompanyName = findViewById(R.id.companyName);
        editPosition = findViewById(R.id.position);
        editTime = findViewById(R.id.time);
        editPassword = findViewById(R.id.password);
        editContractTime = findViewById(R.id.contractTime);
        editEmpName = findViewById(R.id.empName);
        editEmpContact = findViewById(R.id.empContact);
        editType = findViewById(R.id.type);
        editPayment = findViewById(R.id.payment);
        editOwnerName = findViewById(R.id.ownerName);
        editReason = findViewById(R.id.reason);

        registerUser = findViewById(R.id.registerUser);
        registerUser.setOnClickListener(this);

        signPage = findViewById(R.id.signPage);
        signPage.setOnClickListener(this);

        progressBar = findViewById(R.id.progressBar);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signPage:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.registerUser:
                registerUser();
                break;
        }

    }

    private void registerUser() {

        final String name = editName.getText().toString().trim();
        final String email = editEmail.getText().toString().trim();
        final String dateOfBirth = editDob.getText().toString().trim();
        final String password = editPassword.getText().toString().trim();
        final String number = editNumber.getText().toString().trim();
        final String companyName = editCompanyName.getText().toString().trim();
        final String position = editPosition.getText().toString().trim();
        final String time = editTime.getText().toString().trim();
        final String contractTime = editContractTime.getText().toString().trim();
        final String employerName = editEmpName.getText().toString().trim();
        final String employerContact = editEmpContact.getText().toString().trim();
        final String contractType = editType.getText().toString().trim();
        final String payment = editPayment.getText().toString().trim();
        final String ownerName = editOwnerName.getText().toString().trim();
        final String reason = editReason.getText().toString().trim();


        if (name.isEmpty()) {
            editName.setError("Full Name is Required");
            editName.requestFocus();
            return;
        }

        if (number.isEmpty()) {
            editNumber.setError("Number is Required");
            editNumber.requestFocus();
            return;
        }

        if (dateOfBirth.isEmpty()) {
            editNumber.setError("Date of Birth is Required");
            editNumber.requestFocus();
            return;
        }

        if (email.isEmpty()) {
            editEmail.setError("Email is required");
            editEmail.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            editEmail.setError("Please provide valid Email");
            editEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            editPassword.setError("Password is Required");
            editPassword.requestFocus();
            return;
        }

        if (password.length() < 7) {
            editPassword.setError("Min password length should be at least 7 characters");
            editPassword.requestFocus();
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(name, email, dateOfBirth, number, companyName, position,
                                    time, contractTime, employerName, employerContact, contractType, payment, ownerName, reason);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(RegisterUser.this, "User has been register successfully", Toast.LENGTH_LONG).show();
                                        startActivity(new Intent(RegisterUser.this, MainActivity.class));
                                    } else {
                                        Toast.makeText(RegisterUser.this, "Failed to register! Try again", Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);
                                    }
//                                    progressBar.setVisibility(View.GONE);

                                }
                            });
                        } else {
                            Toast.makeText(RegisterUser.this, "Failed to register! Try again", Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });

    }
}