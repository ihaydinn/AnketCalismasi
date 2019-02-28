package com.ihaydin.ankettezcalismasi;


import android.content.Intent;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.UUID;


public class GunlukAnketeKatil extends AppCompatActivity {

    EditText editSoru1;
    EditText editSoru2;
    EditText editSoru3;
    EditText editSoru4;
    EditText editSoru5;
    EditText editSoru6;
    EditText editSoru7;
    EditText editSoru8;
    EditText editSoru9;
    EditText editSoru10;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference myRef;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_ankete_katil);

        editSoru1 = findViewById(R.id.editSoru1);
        editSoru2 = findViewById(R.id.editSoru2);
        editSoru3 = findViewById(R.id.editSoru3);
        editSoru4 = findViewById(R.id.editSoru4);
        editSoru5 = findViewById(R.id.editSoru5);
        editSoru6 = findViewById(R.id.editSoru6);
        editSoru7 = findViewById(R.id.editSoru7);
        editSoru8 = findViewById(R.id.editSoru8);
        editSoru9 = findViewById(R.id.editSoru9);
        editSoru10 = findViewById(R.id.editSoru10);

        firebaseDatabase = FirebaseDatabase.getInstance();
        myRef = firebaseDatabase.getReference();
        mAuth = FirebaseAuth.getInstance();


    }

    public void clickGunlukHayatAnket(View view){

        String soru1 = editSoru1.getText().toString();
        String soru2 = editSoru2.getText().toString();
        String soru3 = editSoru3.getText().toString();
        String soru4 = editSoru4.getText().toString();
        String soru5 = editSoru5.getText().toString();
        String soru6 = editSoru6.getText().toString();
        String soru7 = editSoru7.getText().toString();
        String soru8 = editSoru8.getText().toString();
        String soru9 = editSoru9.getText().toString();
        String soru10 = editSoru10.getText().toString();

        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();

        myRef.child("GunlukAnketSorulari").child(uuidString).child("alis_verislerinizi_nereden_yaparsiniz").setValue(soru1);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("bos_zamanlarinizda_neler_yaparsiniz").setValue(soru2);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("hayattaki_amaciniz_nedir").setValue(soru3);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("hayattaki_en_buyuk_korkunuz").setValue(soru4);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("ideal_lider_nasil_olmalı").setValue(soru5);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("istanbulda_yasanir_mi").setValue(soru6);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("nerede_asla_yaşamam_dersiniz").setValue(soru7);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("nerede_yasamak_isterdiniz").setValue(soru8);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("ruh_haliniz_bu_aralar_nasıl").setValue(soru9);
        myRef.child("GunlukAnketSorulari").child(uuidString).child("uykusuzluk_sorunu_yasiyor_musunuz").setValue(soru10);

        Toast.makeText(getApplicationContext(), "Ankete Katıldığınız İçin Teşekkür Ederiz...",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(getApplicationContext(),AnketSayfasi.class);
        startActivity(intent);


    }

}
