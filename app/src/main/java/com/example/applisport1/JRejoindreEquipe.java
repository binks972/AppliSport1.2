package com.example.applisport1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JRejoindreEquipe extends AppCompatActivity {


    private View button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jrejoindre_equipe);

        this.button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), JLogin.class );
                startActivity(Page2);
                finish();
            }
        });
    }
}