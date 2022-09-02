package com.example.appcategorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View cardInvestimentos;
    private View cardNoticias;
    private View cardMusicas;
    private View cardVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardInvestimentos = findViewById(R.id.card_investimentos);

        cardInvestimentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , InvestimentosActivity.class);
                startActivity(intent);
            }
        });
        
       cardNoticias = findViewById(R.id.card_noticias);

       cardNoticias.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this , NoticiasActivity.class );
               startActivity(intent);
           }
       });

       cardMusicas = findViewById(R.id.card_musicas);

       cardMusicas.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, MusicaActivity.class);
               startActivity(intent);
           }
       });

       cardVideos = findViewById(R.id.card_videos);

       cardVideos.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, VideoActivity.class);
               startActivity(intent);
           }
       });
    }

}