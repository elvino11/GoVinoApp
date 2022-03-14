package com.example.govinoapp.Activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.govinoapp.RumahSakit.RSAwalBross;
import com.example.govinoapp.RumahSakit.RSEkaHospital;
import com.example.govinoapp.RumahSakit.RSJiwaTampan;
import com.example.govinoapp.RumahSakit.RSTabrani;

public class RS extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"RS Awal Bross", "RS Eka Hospital", "RS Jiwa Tampan", "RS Tabrani"};
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
            if (pilihan.equals("RS Awal Bross")){
                a = new Intent(this, RSAwalBross.class);
            }else if (pilihan.equals("RS Eka Hospital")){
                a = new Intent(this, RSEkaHospital.class);
            } else if (pilihan.equals("RS Jiwa Tampan")){
                a = new Intent(this, RSJiwaTampan.class);
            } else if (pilihan.equals("RS Tabrani")){
                a = new Intent(this, RSTabrani.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
