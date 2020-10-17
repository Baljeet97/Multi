/*
package com.example.housingapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.navigation.NavigationView;


public class AboFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_abo, container, false);
        return view;
    }


}

*/


/*
package com.example.housingapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HelpFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_help,container, false);
       return view;
    }
}
*/


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


public class AboFragment extends Fragment {

    Button tica, tenancyDatabase, atsils, bond, rta, legalAid, tenantsQld, qldHousing, legallyYours,
            homeless;

    ImageView ticaIcon, dataBaseIcon, atsilsIcon, bondIcon, rtaIcon, legalAidIcon, tenantsQldIcon,
            qldHousingIcon, legallyYoursIcon, homelessIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_abo, container, false);

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
                gotoUrl("https://www.servicesaustralia.gov.au/individuals/services/centrelink/abstudy-living-allowance/how-claim  ");
            }
        });

        tenancyDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.servicesaustralia.gov.au/individuals/services/centrelink/youth-allowance-students-and-australian-apprentices  ");
            }
        });

        atsils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.centrelink.gov.au/custsite_pfe/pymtfinderest/paymentFinderEstimatorPage.jsf?wec-appid=pymtfinderest&wec-locale=en_US#stay");
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

        homeless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.cairns.qld.gov.au/");
            }
        });


        /*

        ticaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Ask Izzy");
                builder.setMessage("Find the help you need, now and nearby");
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


        dataBaseIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Anlgicare Hub");
                builder.setMessage("Want to get off TICA? This real handy link shows your rights to " +
                        "ask questions about your details on a database, and how you can get off a " +
                        "database like 3 year limits, or victims of domestic violence can get an " +
                        "order to get removed");
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

        atsilsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("ATSILS");
                builder.setMessage("Are you an Aboriginal or Torres Strait Islander? If so you can " +
                        "reach out to ATSILS as they are a community based organisation who can " +
                        "provide legal services to help resolve your issue");
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

        bondIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Bond Loan");
                builder.setMessage("Need a bond loan or rental grant? Lots of good stuff here about " +
                        "getting a bond loan, how to apply for a bond loan, eligibility");
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


        rtaIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("RTA");
                builder.setMessage("Want to get your bond back? Had a argument with your landlord?" +
                        " This government website can help you settle a dispute, show you how to " +
                        "end a rental tenancy, and get your bond back. ");
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

        legalAidIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Legal Aid Cairns");
                builder.setMessage("In trouble with the law? Experiencing domestic violence? Charged " +
                        "with an offence? Been ripped off by a business and want your money back? " +
                        "Legal Aid in Cairns is one option to try");
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

        tenantsQldIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Tenants QLD");
                builder.setMessage("Need advice or assistance understanding tenancy rights? Support " +
                        "talking to your lessor or agent? Help writing letters or completing tenancy " +
                        "forms? Tenants Queensland can help resolve your issue and refer you to other " +
                        "services if needed.");
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

        qldHousingIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Queensland Housing");
                builder.setMessage("Need help removing your name from a tenancy database? This " +
                        "Government website provides information on how to challenge a listing in a " +
                        "database and how to lodge a dispute resolution request");
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

        legallyYoursIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Legally Yours");
                builder.setMessage("Need help identifying which lawyers offer free pro bono work? " +
                        "This website provides a list of every legal clinic in Queensland that offers" +
                        " pro bono work to help with your issue. ");
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

        homelessIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Homeless Persons Legal Clinic");
                builder.setMessage("Are you at risk of homelessness? Do you need legal representation " +
                        "or advice? Law Right offer free legal representation to people at risk and " +
                        "are here to help resolve problems with landlords, eviction or even if your " +
                        "struggling to get a new rental.");
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






        */


        return view;
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}

