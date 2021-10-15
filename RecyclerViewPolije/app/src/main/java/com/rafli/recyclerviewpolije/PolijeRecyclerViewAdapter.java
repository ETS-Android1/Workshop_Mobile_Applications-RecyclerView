package com.rafli.recyclerviewpolije;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PolijeRecyclerViewAdapter extends RecyclerView.Adapter<PolijeRecyclerViewAdapter.PolijeViewHolder> {
    ArrayList<Polije> arrayListPolije;

    public PolijeRecyclerViewAdapter(ArrayList<Polije> arrayListPolije) {
        this.arrayListPolije = arrayListPolije;
    }

    @NonNull
    @Override
//    Mengambil layout dari item.xml
    public PolijeRecyclerViewAdapter.PolijeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new PolijeViewHolder(view);
    }

    @Override
//    Untuk meng get data setiap index dari array list
    public void onBindViewHolder(@NonNull PolijeRecyclerViewAdapter.PolijeViewHolder holder, int position) {
        final Polije polije = arrayListPolije.get(position);

        holder.textViewMajor.setText(polije.getMajor());
        holder.textViewAkreditasi.setText(polije.getAkreditasi());
        holder.textViewReleaseDate.setText(polije.getReleasedate());

//        Memberi Action ketika di klik akan menampilkan detailnya
        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailPolijeActivity.class);
                intent.putExtra("POLIJE", polije);
                holder.itemView.getContext().startActivity(intent);
            }
        }));
    }

    @Override
//    Jumlah data
    public int getItemCount() {
        return arrayListPolije.size();
    }

    //        deklarasi widget/view yang ada di dalam item
    public class PolijeViewHolder extends RecyclerView.ViewHolder {
        TextView textViewMajor, textViewAkreditasi, textViewReleaseDate;
        public PolijeViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewMajor = itemView.findViewById(R.id.tvMajor);
            textViewAkreditasi = itemView.findViewById(R.id.tvAkreditasi);
            textViewReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
        }
    }
}

