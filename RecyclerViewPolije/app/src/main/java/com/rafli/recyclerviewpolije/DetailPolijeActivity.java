package com.rafli.recyclerviewpolije;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPolijeActivity extends AppCompatActivity {

   TextView textViewMajor, textViewAkreditasi, textViewProdi, textViewReleaseDate, textViewDirector, textViewDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_polije);

//      Deklarasi teksView
        textViewMajor = findViewById(R.id.tvMajor);
        textViewAkreditasi = findViewById(R.id.tvAkreditasi);
        textViewProdi = findViewById(R.id.tvProdi);
        textViewReleaseDate = findViewById(R.id.tvReleaseDate);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewDescription = findViewById(R.id.tvDescription);

//      Manggil data intent kita simpan dalam sebuah objek polije
        Polije polije = getIntent().getParcelableExtra("POLIJE");
        textViewMajor.setText(polije.getMajor());
        textViewAkreditasi.setText(polije.getAkreditasi());
        textViewProdi.setText(polije.getProdi());
        textViewReleaseDate.setText(polije.getReleasedate());
        textViewDirector.setText(polije.getDirector());
        textViewDescription.setText(polije.getAkreditasi());
    }
}