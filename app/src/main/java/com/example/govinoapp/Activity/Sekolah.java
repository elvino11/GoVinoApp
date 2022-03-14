package com.example.govinoapp.Activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.govinoapp.Sekolah.SMAN1Pekanbaru;
import com.example.govinoapp.Sekolah.SMAN1Rengat;
import com.example.govinoapp.Sekolah.UINSuska;
import com.example.govinoapp.Sekolah.UNRI;
import com.example.govinoapp.Supermarket.LivingWorldPekanbaru;
import com.example.govinoapp.Supermarket.MallCiputraSeraya;
import com.example.govinoapp.Supermarket.MallSKA;
import com.example.govinoapp.Supermarket.TransmartPekanbaru;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"SMAN 1 Pekanbaru", "SMAN 1 Rengat", "UIN SUSKA RIAU", "UNRI"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object object = this.getListAdapter().getItem(position);
        String pilihan = object.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SMAN 1 Pekanbaru")){
                a = new Intent(this, SMAN1Pekanbaru.class);
            }else if (pilihan.equals("SMAN 1 Rengat")){
                a = new Intent(this, SMAN1Rengat.class);
            } else if (pilihan.equals("UIN SUSKA RIAU")){
                a = new Intent(this, UINSuska.class);
            } else if (pilihan.equals("UNRI")){
                a = new Intent(this, UNRI.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
