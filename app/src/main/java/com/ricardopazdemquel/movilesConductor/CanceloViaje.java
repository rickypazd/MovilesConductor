package com.ricardopazdemquel.movilesConductor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ricardopazdemiquel.movilesConductor.R;

public class CanceloViaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancelo_viaje);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CanceloViaje.this,MainActivityConductor.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
