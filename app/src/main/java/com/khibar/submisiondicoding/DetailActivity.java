package com.khibar.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG =  "Detail Activity";

    TextView tvnamabuah, tvdetailbuah, tvasalbuah;
    ImageView ivgambarbuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra("DataNama");
        int gambarbuah = getIntent().getIntExtra("DataGambar", 0);
        String detailbuah = getIntent().getStringExtra("DetailBuah");
        String asalbuah = getIntent().getStringExtra("AsalBuah");

        //log
        Log.d(TAG, "Nama :"+ namabuah);
        Log.d(TAG, "Gambar :"+ gambarbuah);
        Log.d(TAG, "Detail : "+ detailbuah);
        Log.d(TAG, "Tanggal:"+ asalbuah);

        tvnamabuah = findViewById(R.id.tv_item_nama);
        ivgambarbuah = findViewById(R.id.iv_item_gambar);
        tvdetailbuah = findViewById(R.id.tv_detail_buah);
        tvasalbuah = findViewById(R.id.tv_asal_buah);

        tvnamabuah.setText(namabuah);
        ivgambarbuah.setImageResource(gambarbuah);
        tvdetailbuah.setText(detailbuah);
        tvasalbuah.setText(asalbuah);
    }
}
