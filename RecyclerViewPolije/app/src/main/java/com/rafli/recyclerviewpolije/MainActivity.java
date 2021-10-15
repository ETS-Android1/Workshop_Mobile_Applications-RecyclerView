package com.rafli.recyclerviewpolije;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PolijeRecyclerViewAdapter adapter;
    ArrayList<Polije> objPolije = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById((R.id.recyclerView));

        objPolije.add(new Polije("Teknologi Informasi", "D-4 Teknik Informatika, D-3 Manajemen Informatika, D-3 Teknik Komputer","Hendra Yufit Riskiawan, S.Kom.M.Cs.","B", "Visi\n" +
                "JTI menetapkan visi tahun 2020-2024 sebagai berikut :.\n" +
                "\n" +
                "“Mendukung visi dan misi Polije mewujudkan pendidikan vokasi yang unggul dan memiliki daya saing di bidang teknologi Informasi serta menghasilkan lulusan yang berkarakter”\n" +
                "\n" +
                "Misi\n" +
                "Dalam rangka upaya mewujudkan Visi JTI, maka JTI menetapkan Misi yang terdiri dari :\n" +
                "\n" +
                "Meningkatkan pendidikan terapan di bidang teknologi informasi yang inovatif dan berdaya saing;\n" +
                "Meningkatkan penelitian terapan, pengabdian kepada masyarakat dan kewirausahaan di bidang teknologi informasi untuk menghasilkan nilai tambah produk inovasi;\n" +
                "Mewujudkan tata kelola JTI Polije yang lebih baik dalam rangka reformasi birokrasi (Good JTI Polije Governance );\n" +
                "Mengembangkan kerjasama tingkat nasional maupun internasional.\n" +
                "Tujuan\n" +
                "Tujuan Strategis JTI Polije tahun 2020-2024 terdiri dari :\n" +
                "\n" +
                "Peningkatan kualitas tata kelola organisasi yang fokus pada reformasi birokrasi melalui budaya penjaminan mutu berkelanjutan;\n" +
                "Peningkatan atmosfir akademik yang fokus terhadap kualitas layanan pendidikan, kegiatan kemahasiswaan dan budaya kewirausahaan serta pengembangan produk penelitian dan kegiatan pengabdian kepada masyarakat;\n" +
                "Peningkatan kapasitas dan kualitas hasil manfaat kerjasama.\n", "25 Agustus 2007"));

        adapter = new PolijeRecyclerViewAdapter(objPolije);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}