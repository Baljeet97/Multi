package com.example.housingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FindRoom extends AppCompatActivity {
    Button domainLow, domainMed, domainHigh, realEstateLow, realEstateMed, realEstateHigh, calculatorButton;
    ImageView backIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_room);

        domainLow = findViewById(R.id.domainLow);
        domainMed = findViewById(R.id.domainMed);
        domainHigh = findViewById(R.id.domainHigh);
        realEstateLow = findViewById(R.id.realEstateLow);
        realEstateMed = findViewById(R.id.realEstateMed);
        realEstateHigh = findViewById(R.id.realEstateHigh);
        calculatorButton = findViewById(R.id.calcButton);
        backIcon = findViewById(R.id.backIcon);

        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindRoom.this, Home.class));
            }
        });

        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FindRoom.this, Calculator.class));
            }
        });

        domainLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.domain.com.au/rent/?suburb=smithfield-qld-4878,trinity-" +
                        "beach-qld-4879,trinity-park-qld-4879,manunda-qld-4870,manoora-qld-4870," +
                        "edge-hill-qld-4870&price=100-150");
            }
        });

        domainMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.domain.com.au/rent/?suburb=smithfield-qld-4878,trinity-" +
                        "beach-qld-4879,trinity-park-qld-4879,manunda-qld-4870,manoora-qld-4870," +
                        "edge-hill-qld-4870&price=150-250");
            }
        });

        domainHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.domain.com.au/rent/?suburb=smithfield-qld-4878,trinity-" +
                        "beach-qld-4879,trinity-park-qld-4879,manunda-qld-4870,manoora-qld-4870," +
                        "edge-hill-qld-4870&price=250-600");
            }
        });

        realEstateLow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.realestate.com.au/rent/between-50-150-in-manunda,+qld+" +
                        "4870%3b+manoora,+qld+4870%3b+cairns+north,+qld+4870%3b+cairns+city,+" +
                        "qld+4870%3b+trinity+beach,+qld+4879%3b+trinity+park,+qld+4879%3b+kewarra" +
                        "+beach,+qld+4879/list-1?activeSort=price-asc&source=refinement");
            }
        });

        realEstateMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.realestate.com.au/rent/between-150-250-in-manunda,+qld+" +
                        "4870%3b+manoora,+qld+4870%3b+cairns+north,+qld+4870%3b+cairns+city,+" +
                        "qld+4870%3b+trinity+beach,+qld+4879%3b+trinity+park,+qld+4879%3b+kewarra" +
                        "+beach,+qld+4879/list-1?activeSort=price-asc&source=refinement");
            }
        });

        realEstateHigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.realestate.com.au/rent/between-250-500-in-manunda,+qld+" +
                        "4870%3b+manoora,+qld+4870%3b+cairns+north,+qld+4870%3b+cairns+city,+" +
                        "qld+4870%3b+trinity+beach,+qld+4879%3b+trinity+park,+qld+4879%3b+kewarra" +
                        "+beach,+qld+4879/list-1?activeSort=price-asc&source=refinement");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}