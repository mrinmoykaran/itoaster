package com.mkaran.i_toasterlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mkaran.toaster.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.Toaster(this,"Hellow From Toaster Library");
    }
}