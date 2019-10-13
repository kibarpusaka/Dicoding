package com.khibar.submisiondicoding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namaBuah, asalBuah;
    private int[] gambarBuah;

    ListAdapter(@NonNull Context context1, String[] namaBuah, int[] gambarBuah, String[] asalBuah) {
        super(context1, R.layout.item_buah, namaBuah);
        this.context = context1;
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
        this.asalBuah = asalBuah;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //layout item
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah, parent, false);

        //findbyid
        TextView tvNamaBuah = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_item_gambar);
        TextView tvTanggalPahlawan = view.findViewById(R.id.tv_asal_buah);

        //set data
        tvNamaBuah.setText(namaBuah[position]);
        ivGambarBuah.setImageResource(gambarBuah[position]);
        tvTanggalPahlawan.setText(asalBuah[position]);

        return view;
    }
}
