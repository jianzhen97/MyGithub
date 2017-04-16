package com.example.administrator.mygithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ");
        Toast.makeText(this, "sadsf", Toast.LENGTH_SHORT).show();


        Log.e(TAG, "onCreate: ");
        Toast.makeText(this, "sadsf", Toast.LENGTH_SHORT).show();

        Log.e(TAG, "onCreate: ");
        Toast.makeText(this, "sadsf", Toast.LENGTH_SHORT).show();

        Log.e(TAG, "onCreate: ");
        Toast.makeText(this, "sadsf", Toast.LENGTH_SHORT).show();
    }
}
