package com.example.asus.yogyakartawisataedukasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Asus on 14/05/2018.
 */

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }


        public void Pindah2(View view) {
            Intent intent = new Intent(Home.this, Wisata.class);
            startActivity(intent);
        }

        public void Pindah3(View view) {
        Intent intent = new Intent(Home.this, About.class);
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(Home.this, Developer.class);
        startActivity(intent);
    }

}
