package com.example.govinoapp.Activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.govinoapp.Supermarket.LivingWorldPekanbaru;
import com.example.govinoapp.Supermarket.MallCiputraSeraya;
import com.example.govinoapp.Supermarket.MallSKA;
import com.example.govinoapp.Supermarket.TransmartPekanbaru;

public class Supermarket extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Mall SKA", "Mall Ciputra Seraya", "Living World Pekanbaru", "Transmart Pekanbaru"};
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
            if (pilihan.equals("Mall SKA")){
                a = new Intent(this, MallSKA.class);
            }else if (pilihan.equals("Mall Ciputra Seraya")){
                a = new Intent(this, MallCiputraSeraya.class);
            } else if (pilihan.equals("Living World Pekanbaru")){
                a = new Intent(this, LivingWorldPekanbaru.class);
            } else if (pilihan.equals("Transmart Pekanbaru")){
                a = new Intent(this, TransmartPekanbaru.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
