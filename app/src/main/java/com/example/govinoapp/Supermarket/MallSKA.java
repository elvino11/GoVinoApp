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

public class MallSKA extends ListActivity {
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
                String nomortel = "tel:0761-864000";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));
            } else if (pilihan.equals("SMS Center")){
                String smsText = "Elvino Dwi Saputra / L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0761864000"));
                a.putExtra("sms_body",smsText);
            } else if (pilihan.equals("Driving Direction")){
                String lokasiRS = "google.navigation:q=0.49953126485327143, 101.41849849716654";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasiRS));
            } else if (pilihan.equals("Website")) {
                String website = "https://malska.business.site/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            } else if (pilihan.equals("Info Google")){
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Mall SKA");
            } else if (pilihan.equals("Exit")){
                a = new Intent(this, MainActivity.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
