package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;



public class NomPresentAbs extends AppCompatActivity {

    private Button buttonMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nom_present_abs);

        // Récupération des informations depuis l'Intent
      /*  boolean isMatchChecked = getIntent().getBooleanExtra("MATCH_CHECKED", false);
        boolean isEntrainementChecked = getIntent().getBooleanExtra("ENTRAINEMENT_CHECKED", false);
        boolean isReunionChecked = getIntent().getBooleanExtra("REUNION_CHECKED", false);
        String dateHeure = getIntent().getStringExtra("DATE_HEURE");
        String lieu = getIntent().getStringExtra("LIEU");

        // Affichage des informations
        TextView textViewInfo = findViewById(R.id.textViewInfo);
        String infoText = "Type d'événement : ";
        if (isMatchChecked) infoText += "Match ";
        if (isEntrainementChecked) infoText += "Entraînement ";
        if (isReunionChecked) infoText += "Réunion ";
        infoText += "\nDate et heure : " + dateHeure + "\nLieu : " + lieu;
        textViewInfo.setText(infoText); */


        final EditText editTextName = findViewById(R.id.editTextName);
        final CheckBox checkBoxPresent = findViewById(R.id.checkBoxPresent);
        final CheckBox checkBoxAbsent = findViewById(R.id.checkBoxAbsent);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);

        this.buttonMenu = findViewById(R.id.buttonMenu);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), MainActivity.class );
                startActivity(Page2);
                finish();
            }
        });


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String status;

                if (checkBoxPresent.isChecked()) {
                    status = "Présent";
                } else if (checkBoxAbsent.isChecked()) {
                    status = "Absent";
                } else {
                    status = "Non spécifié";
                }

                // Passage à une nouvelle activité en fonction de la sélection
                Intent intent = new Intent(NomPresentAbs.this, ListeEventJ.class);
                intent.putExtra("name", name);
                intent.putExtra("status", status);
                startActivity(intent);
            }
        });
    }
}
