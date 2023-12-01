package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListeEquipesCoach extends AppCompatActivity {
private Button buttonEquipe;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_equipes_coach);

        this.buttonEquipe = findViewById(R.id.buttonEquipe);

        buttonEquipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), CreaEventCoach.class );
                startActivity(Page2);
                finish();
            }
        });
    }
}