package com.example.fragment2_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class dyFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentdynamic);
        getSupportFragmentManager().beginTransaction().commit();
    }
}

