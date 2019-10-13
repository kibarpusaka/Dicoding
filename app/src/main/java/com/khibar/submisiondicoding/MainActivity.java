package com.khibar.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {
    ListView list;
    Toolbar toolbar;
    ImageButton ibprofile;

    String[] namabuah = {
            "Alpukat ",
            "Apel ",
            "Durian",
            "Kelapa",
            "Mangga",
            "Manggis",
            "Nanas ",
            "Rambutan ",
            "Semangka",
            "Strawbery"
    };

    String[] asalbuah = {
            "Alpukat Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah. ",
            "Apel budidaya keturunan dari Malus sieversii asal Asia Tengah.",
            "Durian tumbuhan tropis yang berasal dari wilayah Asia Tenggara.",
            "Kelapa diperkirakan berasal dari pesisir Samudera Hindia di sisi Asia.",
            "Mangga Berasal dari daerah di sekitar perbatasan India dengan Burma.",
            "Manggis  berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara.",
            "Nanas sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay.",
            "Rambutan berasal dari daerah di Asia Tenggara.",
            "Semangka tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan.",
            "Strawbery  berasal dari bahasa Inggris kuno.",

    };

    int[] gambarbuah = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.durian,
            R.drawable.kelapa,
            R.drawable.mangga,
            R.drawable.manggis,
            R.drawable.nanas,
            R.drawable.rambutan,
            R.drawable.semangka,
            R.drawable.strawbery
    };

     String[] detailbuah = {
             "Avokad (Persea americana) ialah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.\n" + "\n" + "Pohon, dengan batang mencapai tinggi 20 m dengan daun sepanjang 12 hingga 25 cm. Bunganya tersembunyi dengan warna hijau kekuningan dan ukuran 5 hingga 10 milimeter. Ukurannya bervariasi dari 7 hingga 20 sentimeter, dengan massa 100 hingga 1000 gram; biji yang besar, 5 hingga 6,4 sentimeter.",
             "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.",
             "Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\" (King of Fruit). Durian adalah buah yang kontroversial, meskipun banyak orang yang menyukainya, tetapi sebagian yang lain malah muak dengan aromanya.",
             "Kelapa (Cocos nucifera) adalah anggota tunggal dalam marga Cocos dari suku aren-arenan atau Arecaceae.[1] Arti kata kelapa (atau coconut, dalam bahasa Inggris)[2] dapat merujuk pada keseluruhan pohon kelapa, biji, atau buah, yang secara botani adalah pohon berbuah, bukan pohon kacang-kacangan. Istilah ini berasal dari kata Portugis dan Spanyol abad ke-16, coco yang berarti \"kepala\" atau \"tengkorak\" setelah tiga lekukan pada tempurung kelapa yang menyerupai fitur wajah. Tumbuhan ini dimanfaatkan hampir semua bagiannya oleh manusia sehingga dianggap sebagai tumbuhan serbaguna, terutama bagi masyarakat pesisir. Kelapa juga adalah sebutan untuk buah yang dihasilkan tumbuhan ini.[3]",
             "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dan suku Anacardiaceae. Pohon mangga termasuk tumbuhan tingkat tinggi yang struktur batangnya (habitus) termasuk kelompok arboreus, yaitu tumbuhan berkayu yang mempunyai tinggi batang lebih dari 5 m. Mangga bisa mencapai tinggi antara 10 hingga 40 m.\n" + "\n" + "Nama \"mangga\" berasal dari bahasa Malayalam maanga. Kata ini dibawa ke Eropa oleh orang-orang Portugis dan diserap menjadi manga (bahasa Portugis), mango (bahasa Inggris) dan lain-lain",
             "Manggis (Garcinia mangostana L.) adalah sejenis pohon hijau abadi dari daerah tropika yang diyakini berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara. Tumbuh hingga mencapai 7 sampai 25 meter. Buahnya juga disebut manggis, berwarna merah keunguan ketika matang, meskipun ada pula varian yang kulitnya berwarna merah. Buah manggis dalam perdagangan dikenal sebagai \"ratu buah\", sebagai pasangan durian, si \"raja buah\". Buah ini mengandung mempunyai aktivitas antiinflamasi dan antioksidan. Sehingga di luar negeri buah manggis dikenal sebagai buah yang memiliki kadar antioksidan tertinggi di dunia.",
             "Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae). Perawakan (habitus) tumbuhannya rendah, herba (menahun) dengan 30 atau lebih daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal. Buahnya dalam bahasa Inggris disebut sebagai pineapple karena bentuknya yang seperti pohon pinus. Nama 'nanas' berasal dari sebutan orang Tupi untuk buah ini: anana, yang bermakna \"buah yang sangat baik\". Burung penghisap madu (hummingbird) merupakan penyerbuk alamiah dari buah ini, meskipun berbagai serangga juga memiliki peran yang sama.",
             "Rambutan adalah tanaman tropis yang tergolong ke dalam suku lerak-lerakan atau Sapindaceae, berasal dari daerah di Asia Tenggara. Kata \"rambutan\" berasal dari bentuk buahnya yang mempunyai kulit menyerupai rambut.\n" + "\n" + "Rambutan banyak terdapat di daerah tropis seperti Afrika, Kamboja, Karibia, Amerika Tengah, India, Indonesia, Malaysia, Filipina, Thailand dan Sri Lanka.",
             "Semangka atau tembikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci.\n" + "\n" + "Sebagaimana anggota suku ketimun-ketimunan lainnya, habitus tanaman ini merambat namun ia tidak dapat membentuk akar adventif dan tidak dapat memanjat. Jangkauan rambatan dapat mencapai belasan meter.\n" + "\n" + "Daunnya berlekuk-lekuk di tepinya. Bunganya sempurna, berwarna kuning, kecil (diameter 3cm). Semangka adalah andromonoecious monoklin, yaitu memiliki dua jenis bunga pada satu tumbuhan: bunga jantan, yang hanya memiliki benang sari (stamen), dan bunga banci/hermafrodit, yang memiliki benang sari dan putik (pistillum). Bunga banci dapat dikenali dari adanya bakal buah (ovarium) di bagian pangkal bunga berupa pembesaran berbentuk oval.",
             "Stroberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria (stroberi), buah ini berada dalam keluarga Rosaceae. Secara umum buah ini bukanlah buah, melainkan buah palsu,[1] artinya daging buahnya tidak berasal dari ovari tanaman (achenium) tetapi dari bagian bawah hypanthium yang berbentuk mangkok[2] tempat ovari tanaman itu berada.[3][4]\n" + "\n" + "\n" + "Buah stroberi yang sudah masak\n" + "Buah stroberi berwarna hijau keputihan ketika sedang berkembang, dan pada kebanyakan spesies berubah menjadi merah ketika masak. Namanya berasal dari bahasa Inggris kuno streawberige yang merupakan gabungan dari streaw atau \"straw\" dan berige atau \"berry\". Alasan pemberian nama ini masih tidak jelas. Beberapa spesies Lepidoptera mengambil sumber makanannya dari tumbuhan stroberi, menjadikan spesies ini hama utama tanaman stroberi."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list_view);
        ListAdapter adapter = new ListAdapter(MainActivity.this, namabuah, gambarbuah, asalbuah);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("DataNama", namabuah[position]);
                pindah.putExtra("DataGambar", gambarbuah[position]);
                pindah.putExtra("DetailBuah", detailbuah[position]);
                pindah.putExtra("AsalBuah", asalbuah[position]);
                startActivity(pindah);
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ibprofile = findViewById(R.id.iv_toolbar);
        ibprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prof = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(prof);
            }
        });
    }
}
