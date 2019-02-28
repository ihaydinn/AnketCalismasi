package com.ihaydin.ankettezcalismasi;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IHA on 25.12.2017.
 */

public class AdapterClass extends ArrayAdapter<String> {

    private final ArrayList<String> soru1Firebase;
    private final ArrayList<String> soru2Firebase;
    private final ArrayList<String> soru3Firebase;
    private final ArrayList<String> soru4Firebase;
    private final ArrayList<String> soru5Firebase;
    private final ArrayList<String> soru6Firebase;
    private final ArrayList<String> soru7Firebase;
    private final ArrayList<String> soru8Firebase;
    private final ArrayList<String> soru9Firebase;
    private final ArrayList<String> soru10Firebase;
    private final Activity context;



    public AdapterClass(ArrayList<String> soru1Firebase, ArrayList<String> soru2Firebase, ArrayList<String> soru3Firebase,
                        ArrayList<String> soru4Firebase, ArrayList<String> soru5Firebase, ArrayList<String> soru6Firebase,
                        ArrayList<String> soru7Firebase, ArrayList<String> soru8Firebase, ArrayList<String> soru9Firebase,
                        ArrayList<String> soru10Firebase, Activity context) {
        super(context,R.layout.list_view_satir,soru1Firebase);
        this.soru1Firebase = soru1Firebase;
        this.soru2Firebase = soru2Firebase;
        this.soru3Firebase = soru3Firebase;
        this.soru4Firebase = soru4Firebase;
        this.soru5Firebase = soru5Firebase;
        this.soru6Firebase = soru6Firebase;
        this.soru7Firebase = soru7Firebase;
        this.soru8Firebase = soru8Firebase;
        this.soru9Firebase = soru9Firebase;
        this.soru10Firebase = soru10Firebase;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.list_view_satir, null, true);

        TextView soru1Text = customView.findViewById(R.id.viewSoru1);
        TextView soru2Text = customView.findViewById(R.id.viewSoru2);
        TextView soru3Text = customView.findViewById(R.id.viewSoru3);
        TextView soru4Text = customView.findViewById(R.id.viewSoru4);
        TextView soru5Text = customView.findViewById(R.id.viewSoru5);
        TextView soru6Text = customView.findViewById(R.id.viewSoru6);
        TextView soru7Text = customView.findViewById(R.id.viewSoru7);
        TextView soru8Text = customView.findViewById(R.id.viewSoru8);
        TextView soru9Text = customView.findViewById(R.id.viewSoru9);
        TextView soru10Text = customView.findViewById(R.id.viewSoru10);

        soru1Text.setText(soru1Firebase.get(position));
        soru2Text.setText(soru2Firebase.get(position));
        soru3Text.setText(soru3Firebase.get(position));
        soru4Text.setText(soru4Firebase.get(position));
        soru5Text.setText(soru5Firebase.get(position));
        soru6Text.setText(soru6Firebase.get(position));
        soru7Text.setText(soru7Firebase.get(position));
        soru8Text.setText(soru8Firebase.get(position));
        soru9Text.setText(soru9Firebase.get(position));
        soru10Text.setText(soru10Firebase.get(position));



        return customView;
    }

}
