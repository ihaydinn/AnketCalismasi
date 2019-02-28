package com.ihaydin.ankettezcalismasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GunlukAnketSonuclar extends AppCompatActivity {

    ArrayList<String> firebaseSoru1;
    ArrayList<String> firebaseSoru2;
    ArrayList<String> firebaseSoru3;
    ArrayList<String> firebaseSoru4;
    ArrayList<String> firebaseSoru5;
    ArrayList<String> firebaseSoru6;
    ArrayList<String> firebaseSoru7;
    ArrayList<String> firebaseSoru8;
    ArrayList<String> firebaseSoru9;
    ArrayList<String> firebaseSoru10;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference myRef;
    // private FirebaseAuth mAuth;

    com.ihaydin.ankettezcalismasi.AdapterClass adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gunluk_anket_sonuclar);

        firebaseDatabase = FirebaseDatabase.getInstance();
        myRef = firebaseDatabase.getReference();
        // mAuth = FirebaseAuth.getInstance();

        firebaseSoru1 = new ArrayList<String>();
        firebaseSoru2 = new ArrayList<String>();
        firebaseSoru3 = new ArrayList<String>();
        firebaseSoru4 = new ArrayList<String>();
        firebaseSoru5 = new ArrayList<String>();
        firebaseSoru6 = new ArrayList<String>();
        firebaseSoru7 = new ArrayList<String>();
        firebaseSoru8 = new ArrayList<String>();
        firebaseSoru9 = new ArrayList<String>();
        firebaseSoru10 = new ArrayList<String>();



        adapter = new com.ihaydin.ankettezcalismasi.AdapterClass(firebaseSoru1, firebaseSoru2, firebaseSoru3, firebaseSoru4, firebaseSoru5,
                firebaseSoru6, firebaseSoru7, firebaseSoru8, firebaseSoru9, firebaseSoru10,this);

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        DatabaseReference newReference = firebaseDatabase.getReference("GunlukAnketSorulari");
        newReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                  /* System.out.println("children" + dataSnapshot.getChildren());
                    System.out.println("key" + dataSnapshot.getKey());
                    System.out.println("value" + dataSnapshot.getValue());*/

                for(DataSnapshot ds : dataSnapshot.getChildren()){

                    HashMap<String, String> hashMap = (HashMap<String, String>) ds.getValue();
                    firebaseSoru1.add(hashMap.get("alis_verislerinizi_nereden_yaparsiniz"));
                    firebaseSoru2.add(hashMap.get("bos_zamanlarinizda_neler_yaparsiniz"));
                    firebaseSoru3.add(hashMap.get("hayattaki_amaciniz_nedir"));
                    firebaseSoru4.add(hashMap.get("hayattaki_en_buyuk_korkunuz"));
                    firebaseSoru5.add(hashMap.get("ideal_lider_nasil_olmalı"));
                    firebaseSoru6.add(hashMap.get("istanbulda_yasanir_mi"));
                    firebaseSoru7.add(hashMap.get("nerede_asla_yaşamam_dersiniz"));
                    firebaseSoru8.add(hashMap.get("nerede_yasamak_isterdiniz"));
                    firebaseSoru9.add(hashMap.get("ruh_haliniz_bu_aralar_nasıl"));
                    firebaseSoru10.add(hashMap.get("uykusuzluk_sorunu_yasiyor_musunuz"));
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }



}
