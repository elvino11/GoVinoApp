package com.example.govinoapp.Activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.govinoapp.Polisi.PoldaRiau;
import com.example.govinoapp.Polisi.PolrestaPekanbaru;
import com.example.govinoapp.Polisi.PolsekRumbai;
import com.example.govinoapp.Polisi.PolsekTampan;


public class Police extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[] {"Polda Riau", "Polresta Pekanbaru", "Polsek Rumbai", "Polsek Tampan"};
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
            if (pilihan.equals("Polda Riau")){
                a = new Intent(this, PoldaRiau.class);
            }else if (pilihan.equals("Polresta Pekanbaru")){
                a = new Intent(this, PolrestaPekanbaru.class);
            } else if (pilihan.equals("Polsek Rumbai")){
                a = new Intent(this, PolsekRumbai.class);
            } else if (pilihan.equals("Polsek Tampan")){
                a = new Intent(this, PolsekTampan.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
