package com.example.tugasfuad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText tv_nama1 = findViewById(R.id.tv_nama1);
        final EditText tv_alamat1 = findViewById(R.id.tv_alamat1);
        final EditText tv_ttl1 = findViewById(R.id.tv_ttl1);
        final EditText tv_email1 = findViewById(R.id.tv_email1);
        final EditText tv_no1 = findViewById(R.id.tv_no1);
        Button btnsubmit = findViewById(R.id.btn_pindah);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Activity_kedua.class);
        intent.putExtra("nama_key", tv_nama1.getText().toString());
        intent.putExtra("alamat_key", tv_alamat1.getText().toString());
        intent.putExtra("ttl_key", tv_ttl1.getText().toString());
        intent.putExtra("email_key", tv_email1.getText().toString());
        intent.putExtra("no_key", tv_no1.getText().toString());
        startActivity(intent);
            }
        });

    }
}
