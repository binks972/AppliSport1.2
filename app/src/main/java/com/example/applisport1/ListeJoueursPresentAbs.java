package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.annotation.SuppressLint;

import android.widget.Button;


public class ListeJoueursPresentAbs extends AppCompatActivity {

    private Button buttonMenuP;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_joueurs_present_abs);

        this.buttonMenuP = findViewById(R.id.buttonMenuP);

        buttonMenuP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), MainActivity.class );
                startActivity(Page2);
                finish();
            }
        });
    }
}