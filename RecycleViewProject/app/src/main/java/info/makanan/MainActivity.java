package info.makanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecycleViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(fotoMakanan, namaMakanan, infoMakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private void getDataFromInternet(){

        namaMakanan.add("Nasi Goreng");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/nasgormafia-b191807f2a6aa267e2474d958bbff0e6.jpg");
        infoMakanan.add("Nasi goreng memang nggak asing lagi ya, Bela. Kamu bisa menjumpai nasi goreng di manapun bahkan di luar negeri. Namun, nasi goreng dari Indonesia memiliki cita rasa yang berbeda. Hal ini karena nasi goreng dibuat dengan rempah-rempah yang ada di Indonesia. Jadi, rasa yang dihasilkan ciri khas kuliner nusantara banget.");

        namaMakanan.add("Bakso");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/bakso-ranto-5eddecd8a4e9865a8546a7af884ab093.jpg");
        infoMakanan.add("Kamu pasti hafal banget sama makanan satu ini. Makanan yang terbuat dari daging sapi dengan campuran tepung ini sering disebut bakso. Berbicara tentang bakso, Indonesia memiliki beragam bakso yang berasal dari kota Pulau Jawa seperti bakso malang. Kuah yang terbuat dari kaldu sapi, diberi sayuran dan rempah juga mie sebagai pelengkap. Ternyata bakso menjadi salah satu favorit para turis, lho.");

        namaMakanan.add("Sate Ayam");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/jajanyogya-4fec536762239d734d2cd78a6e66e946.jpg");
        infoMakanan.add("Nggak kalah dengan makanan lainnya, sate ayam juga populer di mancanegara. Sate ayam dilengkapi dengan bumbu kacang dan diberi kecap. Selain sate ayam, di Indonesia menawarkan beberapa daging sate lainnya. Indonesia juga memiliki beragam sate yang berasal dari beberapa daerah. Seperti sate padang yang berasal dari Sumatra Barat dan sate pencok berasal dari Lombok.");

        namaMakanan.add("Mi Ayam");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/doyanbakmi-1db5ff1d59a493877ddbc51d78ce72a1.jpg");
        infoMakanan.add("Makanan ini selalu berdekatan dengan bakso, nggak bisa dipisahin. Masakan yang terbuat dari mi kuning ini sangat digemari baik di dalam maupun luar negeri. Mi sendiri berasal dari Tiongkok, namun mi ayam yang ada di Indonesia nggak ditemukan dimana-mana. Mi ayam biasanya disajikan dengan sayuran sawi, ayam yang sudah dikecapi dan bisa ditambah dengan bakso. Jadi ngiler, ya!");

        namaMakanan.add("Nasi Padang");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/ajakmakan-c9904b6b6fbf7b78bb9c97aa2fac0e69.jpg");
        infoMakanan.add("Berpindah dari Pulau Jawa, kali ini giliran makanan dari Sumatera Barat yang sangat terkenal yaitu nasi padang. Nasi padang disajikan dengan berbagai macam lauk yang memiliki cita rasa rempah-rempah yang kuat. Namun, lauk yang ada di nasi padang cenderung memiliki rasa pedas dan berbahan dasar santan. Tapi dijamin bikin ketagihan!");

        namaMakanan.add("Rujak Buah");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/cecekuliner-bd5830694014e3147ea9a695528272e2.jpg");
        infoMakanan.add("Kalau ini sih biasanya makanan yang suka dibuat sama ibu-ibu kalo lagi ngerumpi. Rujak buah emang paling enak dimakan rame-rame. Terbuat dari berbagai macam buah dan disiram dengan sambal yang pedas. Buah yang digunakan biasanya mangga muda, jambu merah, bengkoang, kedondong, nanas, dan lainnya. Tapi kamu bisa mencampurkan buah apapun yang kamu inginkan.");

        namaMakanan.add("Ketoprak");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/a3668c99956be925ec8b08bd000d55dc.jpg");
        infoMakanan.add("Sebagian besar orang Indonesia menyebut bahwa ketoprak berasal dari betawi. Rasa yang enak dan harga yang sangat terjangkau membuat ketoprak cukup dicari-cari. Memang hampir mirip dengan gado-gado, tapi tentu beda dong. Sama-sama diberi sambal kacang dan menggunakan lontong, namun gado-gado diberi tambahan sayuran.");

        namaMakanan.add("Rendang");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/foto/2018/05/18/497688/t/ilustrasi-rendang-002-yoga-tri-priyanto.jpg");
        infoMakanan.add("Rendang merupakan salah satu makanan nusantara yang populer di dunia. Makanan tradisional yang berasal dari tanah Minangkabau ini telah beberapa kali dinobatkan sebagai makanan terenak nomor satu di dunia versi CNN International mengalahkan sushi khas Jepang.\n" +
                "\n" +
                "Rendang dihasilkan dari proses memasak dengan suhu rendah dalam waktu yang lama. Bumbu utama yang digunakan dalam memasak rendang di antaranya daging sapi, santan kelapa, cabai, dan rempah-rempah. Rasanya yang gurih dan lezat menjadikan makanan ini berhasil masuk ke dalam daftar makanan terenak di dunia.");

        namaMakanan.add("Semur");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/foto/2019/01/08/554087/t/ilustrasi-semur-jengkol-001-tantri-setyorini.jpg");
        infoMakanan.add("Menu makanan nusantara yang tidak boleh dilewatkan ialah semur. Makanan berbahan dasar daging dengan kuah berwarna cokelat ini sering ditemui ketika Hari Raya Idul Fitri.\n" +
                "\n" +
                "Rasanya yang gurih dan lezat menjadikan makanan nusantara ini sangat digemari oleh masyarakat. Seringkali semur dihidangkan dengan nasi hangat atau ketupat. Dengan campuran tempe, telur dan tahu menjadikan semur terasa semakin nikmat.");

        namaMakanan.add("Opor Ayam");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/foto/2018/05/09/495335/t/ilustrasi-opor-ayam-pedas-001-tantri-setyorini.jpg");
        infoMakanan.add("Makanan nusantara yang memiliki cita rasa yang lezat berikutnya ialah opor ayam. Makanan berbahan dasar ayam yang diolah menggunakan santan ini sangat populer di Indonesia. Biasanya opor ayam disajikan dengan ketupat dan beragam aneka lalapan.\n" +
                "\n" +
                "Cara pembuatan opor ayam cukup mudah, yaitu merebus yang di beri bumbu santan. Setelah itu ditambah menggunakan bumbu lainnya seperti kencur dan serai. Rasanya yang gurih dan lezat menjadikan opor ayam sering dihidangkan saat Hari Raya Idul Fitri.");

        namaMakanan.add("Gudeg");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188071/content_images/670x335/20200616131630-1-ilustrasi-gudeg-004-tantri-setyorini.jpg");
        infoMakanan.add("Makanan nusantara yang tidak kalah enaknya yang wajib dicoba berikutnya ialah gudeg. Makanan ini merupakan salah satu jenis kuliner tradisional dari Yogyakarta yang cukup populer di Indonesia.\n" +
                "\n" +
                "Rasanya yang gurih dan manis membuat makanan legendaris ini sangat digemari oleh semua kalangan. Selain memiliki cita rasa yang lezat, harga satu porsi gudeg terbilang cukup terjangkau.\n" +
                "\n" +
                "Bahan dasar pembuatan gudeg pada umumnya memakai nangka muda. Meskipun begitu, kini banyak ditemukan gudeg dengan bahan dasar lain, seperti manggar, jamur hingga buah salak. Pada saat penyajian, biasanya gudeg dilengkapi dengan nasi putih, telur hingga daging ayam.");

        namaMakanan.add("Nasi Kuning");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2020/06/16/1188071/content_images/670x335/20200616131632-1-ilustrasi-nasi-kuning-002-tantri-setyorini.jpg");
        infoMakanan.add("Nasi kuning merupakan salah satu makanan Nusantara yang sangat populer di masyarakat. Dengan bahan dasar berupa nasi putih dan diolah menggunakan pewarna makanan kunyit, menjadikan nasi kuning memiliki cita rasa gurih dan digemari oleh semua kalangan.\n" +
                "\n" +
                "Pada umumnya, nasi kuning dijadikan tumpeng pada acara-acara tertentu, seperti ulang tahun, pernikahan, peresmian, dan lain sebagainya. Nasi kuning juga sering disajikan dengan beberapa topping, seperti tomat, tempe, telur, timun dan sambal. Beberapa topping tersebut sangat cocok dikonsumsi dengan nasi kuning.");




        prosesRecycleViewAdapter();


    }
}