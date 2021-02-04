package com.example.tugasfuad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_kedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView data1 = findViewById(R.id.nama);
        TextView data2 = findViewById(R.id.alamat);
        TextView data3 = findViewById(R.id.ttl);
        TextView data4 = findViewById(R.id.email);
        TextView data5 = findViewById(R.id.no);
        TextView data6= findViewById(R.id.asiyaap);

        Bundle kirim = getIntent().getExtras();
        if (kirim == null){
            return;
        }

        String fuad1 = kirim.getString("nama_key");
        String fuad2 = kirim.getString("alamat_key");
        String fuad3 = kirim.getString("ttl_key");
        String fuad4 = kirim.getString("email_key");
        String fuad5 = kirim.getString("no_key");
        if (fuad1 != null){
            data1.setText(fuad1);
        }
        if (fuad2 != null) {
            data2.setText(fuad2);
        }
        if (fuad3 != null){
            data3.setText(fuad3);
        }
        if (fuad4 != null){
            data4.setText(fuad4);
        }
        if (fuad5 != null){
            data5.setText(fuad5);
        }
    }
}