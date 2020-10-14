package com.example.housingapp;

import android.content.Context;
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


public class HomeFragment extends Fragment {
//    private onFragmentBtnSelected listener;
    Button expenses, room, flat, skill;
    ImageView myProfile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        expenses = view.findViewById(R.id.expenses);
        room = view.findViewById(R.id.room);
        flat = view.findViewById(R.id.flat);
        myProfile = view.findViewById(R.id.myProfile);
        skill = view.findViewById(R.id.qldSkill);

        expenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent expenses = new Intent(getActivity(), Calculator.class);
                expenses.putExtra("expenses", "calculate expenses");
                startActivity(expenses);

            }
        });

        room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent room = new Intent(getActivity(), FindRoom.class);
                room.putExtra("room", "find room");
                startActivity(room);
            }
        });

        //external link

        flat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://ozflatmates.com/");
            }
        });

        skill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://desbt.qld.gov.au/");
            }
        });


        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myProfile = new Intent(getActivity(), UserProfile.class);
                myProfile.putExtra("myProfile", "My Profile");
                startActivity(myProfile);
            }
        });




        return view;
    }

    //external link method, only one method will work for multiple links
    //As long as "s" value is different

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

//    @Override
//    public void onAttach(@NonNull Context context) {
//        super.onAttach(context);
//        if (context instanceof onFragmentBtnSelected) {
//            listener = (onFragmentBtnSelected) context;
//        } else {
//            throw new ClassCastException(context.toString() + "must implement listener");
//        }
//    }
//
//    public interface onFragmentBtnSelected {
//        public void onButtonSelected();
//    }


//    expenses = view.findViewById(R.id.expenses);
//    room = view.findViewById(R.id.room);
//    flat = view.findViewById(R.id.flat);
//    myProfile = view.findViewById(R.id.myProfile);
//
//        expenses.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            listener.onButtonSelected();
//
//        }
//    });
//
//        room.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            listener.onButtonSelected();
//        }
//    });
//
//        flat.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            listener.onButtonSelected();
//
//        }
//    });
//
//        myProfile.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            listener.onButtonSelected();
//
//        }
//    });

}