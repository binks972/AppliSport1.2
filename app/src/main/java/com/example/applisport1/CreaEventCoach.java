package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;
public class CreaEventCoach extends AppCompatActivity {

    private Button buttonEvent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_event_coach);

        this.buttonEvent = findViewById(R.id.buttonEvent);

        buttonEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), ListeJoueursPresentAbs.class );
                startActivity(Page2);
                finish();
            }
        });

        final CheckBox checkBoxMatch = findViewById(R.id.checkBoxMatch);
        final CheckBox checkBoxEntrainement = findViewById(R.id.checkBoxEntrainement);
        final CheckBox checkBoxReunion = findViewById(R.id.checkBoxReunion);
        final EditText editTextDateHeure = findViewById(R.id.editTextDateHeure);
        final EditText editTextLieu = findViewById(R.id.editTextLieu);
        final Button btnCreerEvenement = findViewById(R.id.btnCreerEvenement);
        final TextView textViewResultat = findViewById(R.id.textViewResultat);

        btnCreerEvenement.setOnClickListener(new View.OnClickListener() {



        @Override
            public void onClick(View view) {
                // Récupération des informations
                boolean isMatchChecked = checkBoxMatch.isChecked();
                boolean isEntrainementChecked = checkBoxEntrainement.isChecked();
                boolean isReunionChecked = checkBoxReunion.isChecked();
                String DateHeure = editTextDateHeure.getText().toString();
                String Lieu = editTextLieu.getText().toString();

            String finalDateHeure = DateHeure;
            String finalLieu = Lieu;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                // Passage des informations à une nouvelle activité
                Intent intent = new Intent(CreaEventCoach.this, choixCoachJoueur.class);
                intent.putExtra("MATCH_CHECKED", isMatchChecked);
                intent.putExtra("ENTRAINEMENT_CHECKED", isEntrainementChecked);
                intent.putExtra("REUNION_CHECKED", isReunionChecked);
                intent.putExtra("DATE_HEURE", finalDateHeure);
                intent.putExtra("LIEU", finalLieu);
                startActivity(intent);
                }
            }, 5000);  // Délai de 5000 millisecondes (5 secondes)




                // Récupérer les informations sélectionnées
                StringBuilder resultat = new StringBuilder("Événement créé :\n");

                if (checkBoxMatch.isChecked()) {
                    resultat.append("Type : Match\n");
                }
                if (checkBoxEntrainement.isChecked()) {
                    resultat.append("Type : Entraînement\n");
                }
                if (checkBoxReunion.isChecked()) {
                    resultat.append("Type : Réunion\n");
                }

                DateHeure = editTextDateHeure.getText().toString();
                resultat.append("Date et heure : ").append(DateHeure).append("\n");

                Lieu = editTextLieu.getText().toString();
                resultat.append("Lieu : ").append(Lieu);

                // Afficher le résultat pendant 5 secondes
                textViewResultat.setText(resultat.toString());
                textViewResultat.setVisibility(View.VISIBLE);

                // Cacher le résultat après 5 secondes
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        textViewResultat.setVisibility(View.GONE);
                    }
                }, 5000);
            }
        });
    }
}
