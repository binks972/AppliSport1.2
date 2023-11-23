package com.example.applisport1;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.applisport1.databinding.ActivityChoixCoachJoueurBinding;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.applisport1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Button myButton;

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.myButton = findViewById(R.id.myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Page2 = new Intent(getApplicationContext(), choixCoachJoueur.class );
                startActivity(Page2);
                finish();
            }
        });


    }
}

