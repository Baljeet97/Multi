package com.example.housingapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class LegalFragment extends Fragment {

    Button tica, tenancyDatabase, atsils, bond, rta, legalAid, tenantsQld, qldHousing, legallyYours,
    homeless;

    ImageView ticaIcon, dataBaseIcon, atsilsIcon, bondIcon, rtaIcon, legalAidIcon, tenantsQldIcon,
    qldHousingIcon, legallyYoursIcon, homelessIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_legal,container, false);

        tica = view.findViewById(R.id.tica);
        tenancyDatabase = view.findViewById(R.id.tenancy);
        atsils = view.findViewById(R.id.atsils);
        bond = view.findViewById(R.id.bond);
        rta = view.findViewById(R.id.rta);
        legalAid = view.findViewById(R.id.legalAid);
        tenantsQld = view.findViewById(R.id.tenantsQld);
        qldHousing = view.findViewById(R.id.qldHousing);
        legallyYours = view.findViewById(R.id.legallyYours);
        homeless = view.findViewById(R.id.homeless);


        ticaIcon = view.findViewById(R.id.ticaIcon);
        dataBaseIcon = view.findViewById(R.id.dataBaseIcon);
        atsilsIcon = view.findViewById(R.id.atsilsIcon);
        bondIcon = view.findViewById(R.id.bondIcon);
        rtaIcon = view.findViewById(R.id.rtaIcon);
        legalAidIcon = view.findViewById(R.id.legalAidIcon);
        tenantsQldIcon = view.findViewById(R.id.tenantsQldIcon);
        qldHousingIcon = view.findViewById(R.id.qldHousingIcon);
        legallyYoursIcon = view.findViewById(R.id.legallyYoursIcon);
        homelessIcon = view.findViewById(R.id.homelessIcon);


        tica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.tica.com.au/");
            }
        });

        tenancyDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://qstars.org.au/tenancies/tenancy-databases/");
            }
        });

        atsils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.atsils.org.au/services/");
            }
        });

        bond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.qld.gov.au/housing/renting/rent-assistance/bond-loan");
            }
        });

        rta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.rta.qld.gov.au/");
            }
        });

        legalAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://www.legalaid.qld.gov.au/About-us/Contact-us/Office-locations/Cairns ");
            }
        });

        tenantsQld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://tenantsqld.org.au/info-for-tenants/");
            }
        });

        qldHousing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.qld.gov.au/housing/renting/finding-place-to-rent/tenancy-database");
            }
        });

        legallyYours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://legallyyours.com.au/pro-bono/queensland/");
            }
        });

        homeless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("http://www.lawright.org.au/cms/page.asp?ID=60736");
            }
        });




        ticaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("TICA");
                builder.setMessage("Want to rent a home in Cairns? You need to know about TICA " +
                        "tenancy database. If you have been blacklisted this might stop you " +
                        "getting a new rental. " +
                        "TICA has a FREE calculator to help you work out a budget");
                builder.setNegativeButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.setCancelable(false);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });









        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}