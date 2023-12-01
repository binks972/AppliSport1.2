package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class CreaEquipeCoach extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_equipe_coach);

        final EditText editNomEquipe = findViewById(R.id.editNomEquipe);
        final EditText editMotDePasse = findViewById(R.id.editMotDePasse);
        Button btnCreerEquipe = findViewById(R.id.btnCreerEquipe);

        btnCreerEquipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomEquipe = editNomEquipe.getText().toString();
                String motDePasse = editMotDePasse.getText().toString();

                // Tu peux faire quelque chose avec le nom de l'équipe et le mot de passe ici
                // Par exemple, tu peux les afficher dans une boîte de dialogue ou les enregistrer.

                // Ici, on affiche une boîte de dialogue pour illustrer
                afficherMessage("Équipe créée", "Nom de l'équipe : " + nomEquipe + "\nMot de passe : " + motDePasse);

                // Ajouter un délai de 5 secondes avant de passer à une autre activité
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ouvrirDeuxiemeActivite(nomEquipe);
                    }
                }, 5000); // 5000 millisecondes = 5 secondes

            }
        });
    }

    private void afficherMessage(String titre, String message) {
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle(titre)
                .setMessage(message)
                .setPositiveButton("OK", null)
                .create();

        dialog.show();
    }
    private void ouvrirDeuxiemeActivite(String nomEquipe) {
        // Créer l'intent pour ouvrir la deuxième activité
        Intent intent = new Intent(CreaEquipeCoach.this, CreaEventBtn.class);

        // Ajouter le nom de l'équipe à l'intent
        intent.putExtra("TEAM_NAME", nomEquipe);

        // Démarrer la deuxième activité
        startActivity(intent);

    }
}


