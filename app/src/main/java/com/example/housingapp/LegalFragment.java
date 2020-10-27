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
    homeless, legalActButton;

    ImageView ticaIcon, dataBaseIcon, atsilsIcon, bondIcon, rtaIcon, legalAidIcon, tenantsQldIcon,
    qldHousingIcon, legallyYoursIcon, homelessIcon, legalActIcon;

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
        legalActButton = view.findViewById(R.id.legaActButton);


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
        legalActIcon = view.findViewById(R.id.legalActIcon);


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

        legalActButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.legislation.qld.gov.au/view/html/inforce/current/act-2008-073#ch.9");
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


        dataBaseIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Tenancy Database");
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

        legalActIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("RTA ACT - Chapter 9");
                builder.setMessage("Want the ducks nuts on getting off a database? A landlord or " +
                        "rental agency giving you grief? Tell them you have rights in Chapter 9 of" +
                        " the Residential Tenancies and Rooming Act 2008. This is the LAW! What words " +
                        "mean. Have a look!");
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