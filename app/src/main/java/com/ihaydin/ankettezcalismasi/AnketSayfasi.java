package com.ihaydin.ankettezcalismasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class AnketSayfasi extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.gunluk_anketler,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.gunluk_anketler){

            Intent intent = new Intent(getApplicationContext(),GunlukAnketSonuclar.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anket_sayfasi);


    }

    public void clickGunlukAnket(View view){

        Intent intent = new Intent(this, GunlukAnketeKatil.class);
        startActivity(intent);

    }


}
