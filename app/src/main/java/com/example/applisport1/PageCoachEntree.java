package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageCoachEntree extends AppCompatActivity {

    private Button buttonCE;
    private Button buttonCre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_coach_entree);

        this.buttonCE = findViewById(R.id.buttonCE);
        this.buttonCre = findViewById(R.id.buttonCre);

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), ListeEquipesCoach.class );
                startActivity(Page2);
                finish();
            }
        });

        buttonCre.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), CreaEquipeCoach.class );
                startActivity(Page2);
                finish();

            }
        });

    }
}