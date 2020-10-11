package com.example.housingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity {

    Button home;

    private FirebaseUser user;
    private DatabaseReference reference;

    private String userID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        home = findViewById(R.id.btnHome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             startActivity(new Intent(UserProfile.this, Home.class));
            }
        });

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("Users");
        userID = user.getUid();

        final TextView greetingTextView, emailAddressTextView, dobTextView,fullNameTextView, jobTitleTextView,
                phoneNumberTextView, companyNameTextView, positionTextView, lengthTextView,
                contractTimeTextView, employerNameTextView, employerContactTextView, employerCompanyTextView,
                payTextView, landlordTextView, reasonTextView;

        greetingTextView = findViewById(R.id.greeting);

        emailAddressTextView = findViewById(R.id.emailAddress);
        dobTextView = findViewById(R.id.title);
        fullNameTextView = findViewById(R.id.fullName);
        phoneNumberTextView = findViewById(R.id.phoneNumber);

        companyNameTextView = findViewById(R.id.companyName);
        positionTextView = findViewById(R.id.yourPosition);
        lengthTextView = findViewById(R.id.length);
        employerNameTextView = findViewById(R.id.employerName);
        employerContactTextView = findViewById(R.id.empContact);


        employerCompanyTextView = findViewById(R.id.empCompany);
        payTextView = findViewById(R.id.pay);

        landlordTextView = findViewById(R.id.landLord);
        reasonTextView = findViewById(R.id.reason);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if (userProfile != null){
                    String fullName = userProfile.name;
                    String email = userProfile.email;
                    String dateOfBirth = userProfile.dob;
                    String number = userProfile.number;

                    String companyName = userProfile.companyName;
                    String position = userProfile.position;
                    String lengthOfEmployment = userProfile.lengthOfEmployment;
                    String employerName = userProfile.employerName;
                    String employerContact = userProfile.employerContact;

                    String company = userProfile.empCompanyName;
                    String payRoll = userProfile.payRoll;

                    String ownerName = userProfile.ownerName;
                    String reasonForLeaving = userProfile.reasonForLeaving;


                    greetingTextView.setText("Welcome ," + fullName + "!");
                    fullNameTextView.setText(fullName);
                    emailAddressTextView.setText(email);
                    dobTextView.setText(dateOfBirth);
                    phoneNumberTextView.setText(number);

                    companyNameTextView.setText(companyName);
                    positionTextView.setText(position);
                    lengthTextView.setText(lengthOfEmployment);
                    employerNameTextView.setText(employerName);
                    employerContactTextView.setText(employerContact);

                    employerCompanyTextView.setText(company);
                    payTextView.setText(payRoll);

                    landlordTextView.setText(ownerName);
                    reasonTextView.setText(reasonForLeaving);

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(UserProfile.this, "Something wrong happened", Toast.LENGTH_LONG).show();

            }
        });
    }
}