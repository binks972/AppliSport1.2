package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CreaEventBtn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_event_btn);

        // Récupérer le nom de l'équipe depuis l'intent
        String teamName = getIntent().getStringExtra("TEAM_NAME");

        // Afficher le nom de l'équipe dans le TextView
        TextView textTeamName = findViewById(R.id.textTeamName);
        textTeamName.setText(teamName);

        // Mettre en place un OnClickListener pour le bouton "Créer un événement"
        Button buttonCreateEvent = findViewById(R.id.buttonCreateEvent);
        buttonCreateEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), CreaEventCoach.class );
                startActivity(Page2);
                finish();

            }
        });
    }
}
