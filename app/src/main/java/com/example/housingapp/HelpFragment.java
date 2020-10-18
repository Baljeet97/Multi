package com.example.housingapp;

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


public class HelpFragment extends Fragment {
    /*Shaun needs to change ID's in XML and name Here*/

    Button tica, tenancyDatabase, atsils, bond, rta, legalAid, tenantsQld, qldHousing, legallyYours;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_help, container, false);

        tica = view.findViewById(R.id.tica);
        tenancyDatabase = view.findViewById(R.id.tenancy);
        atsils = view.findViewById(R.id.atsils);
        bond = view.findViewById(R.id.bond);
        rta = view.findViewById(R.id.rta);
        legalAid = view.findViewById(R.id.legalAid);
        tenantsQld = view.findViewById(R.id.tenantsQld);
        qldHousing = view.findViewById(R.id.qldHousing);
        legallyYours = view.findViewById(R.id.legallyYours);


        tica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://askizzy.org.au/");
            }
        });

        tenancyDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.anglicare.asn.au/");
            }
        });

        atsils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.beyondblue.org.au/who-does-it-affect/young-people/helpful-contacts-and-websites");
            }
        });

        bond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://kidshelpline.com.au/young-adults");
            }
        });

        rta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://mentalwellbeing.initiatives.qld.gov.au/resources");
            }
        });

        legalAid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.blackdoginstitute.org.au/emergency-help/when-where-to-seek-help/");
            }
        });

        tenantsQld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.myskills.gov.au/");
            }
        });

        qldHousing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.headspace.com/meditation/10-minute-meditation");
            }
        });

        legallyYours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://mentalwellbeing.initiatives.qld.gov.au/coronavirus-support");
            }
        });

        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}