package com.example.govinoapp.Supermarket;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.govinoapp.Activity.MainActivity;

public class LivingWorldPekanbaru extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAction = new String[] {"Call Center","SMS Center", "Driving Direction", "Website", "Info Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAction));
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
            if (pilihan.equals("Call Center")){
                String nomortel = "tel:0761-6706100";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            } else if (pilihan.equals("SMS Center")){
                String smsText = "Elvino Dwi Saputra / L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:07616706100"));
                a.putExtra("sms_body",smsText);
            } else if (pilihan.equals("Driving Direction")){
                String lokasiRS = "google.navigation:q=0.500426106994953, 101.4198391971665";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasiRS));
            } else if (pilihan.equals("Website")) {
                String website = "https://livingworldpekanbaru.business.site/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            } else if (pilihan.equals("Info Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Living World Pekanbaru");
            } else if (pilihan.equals("Exit")){
                a = new Intent(this, MainActivity.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
