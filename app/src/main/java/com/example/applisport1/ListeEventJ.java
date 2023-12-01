package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListeEventJ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_event_j);

      //  @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textViewResult = findViewById(R.id.editTextName);
        TextView textViewResult = findViewById(R.id.textViewResult);

        // Récupérer les données de l'intent
        String name = getIntent().getStringExtra("name");
        String status = getIntent().getStringExtra("status");

        // Afficher le résultat
        String resultText = "Nom : " + name + "\nStatut : " + status;
        textViewResult.setText(resultText);
    }
}

