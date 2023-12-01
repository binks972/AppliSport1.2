package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class choixCoachJoueur extends AppCompatActivity {

    private View buttonJ;
    private View buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_coach_joueur);
        this.buttonJ = findViewById(R.id.buttonJ);
        this.buttonC = findViewById(R.id.buttonC);

        buttonJ.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), JRejoindreEquipe.class );
                startActivity(Page2);
                finish();
            }
        });

                buttonC.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent Page2 = new Intent(getApplicationContext(), PageCoachEntree.class );
                        startActivity(Page2);
                        finish();

            }
        });
    }
}