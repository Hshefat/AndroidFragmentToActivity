package com.example.fragmenttoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         bn = (Button) findViewById(R.id.button_home);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*bn.setVisibility(View.GONE);*/
                FragmentManager fm = getSupportFragmentManager();
                FirstFragment firstFragment = new FirstFragment();
                fm.beginTransaction().add(R.id.main_layout, firstFragment).addToBackStack(null).commit();
            }
        });






    }
}