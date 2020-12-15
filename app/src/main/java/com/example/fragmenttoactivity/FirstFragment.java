package com.example.fragmenttoactivity;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstFragment extends Fragment {

    Button bn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


      /*  return inflater.inflate(R.layout.fragment_first, container, false);*/

        View fv = inflater.inflate(R.layout.fragment_first, null);

        Toolbar mActionBar = fv.findViewById(R.id.profile_toolbar);
        mActionBar.setNavigationIcon(getActivity().getResources().getDrawable(R.drawable.ic_baseline_arrow_back_24));
        mActionBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                getActivity().onBackPressed();
            }
        });




        bn = (Button) fv.findViewById(R.id.secondFragmentClick);
        FragmentManager mFragmentManager;
        FragmentTransaction mFragmentTransaction;

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*bn.setVisibility(View.GONE);*/
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .add(R.id.main_layout, new SecondFragment())
                        .commit();
            }
        });


        return fv;





    }

}