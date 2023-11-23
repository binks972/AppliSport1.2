package com.example.applisport1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JLogin extends AppCompatActivity {

    private static final String MOT_DE_PASSE_CORRECT = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jlogin2);

        final EditText editTextPassword = findViewById(R.id.editTextNumberPassword);
        Button button4 = findViewById(R.id.button4);
        final TextView textViewMessage = findViewById(R.id.textViewMessage);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPassword = editTextPassword.getText().toString();

                if (enteredPassword.equals(MOT_DE_PASSE_CORRECT)) {
                    // Mot de passe correct, ouvrir la nouvelle activité
                    Intent intent = new Intent(JLogin.this, ListeEventJ.class);
                    startActivity(intent);
                } else {
                    // Mot de passe incorrect, afficher un message d'erreur
                    textViewMessage.setText("Mot de passe incorrect. Réessayez.");
                }
            }
        });
    }
}