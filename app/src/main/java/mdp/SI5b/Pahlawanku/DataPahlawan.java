package mdp.SI5b.Pahlawanku;

import java.util.ArrayList;

public class DataPahlawan {
    public static String[][] data = new String[][]{
            {"Evo Petshop", "Toko perlengkapan hewan peliharaan di Palembang, Sumatera Selatan Alamat: Jl. Lingkaran1 No.565, 15 Ilir, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30125 Telepon: 0812-1660-0400\n" +
                    "Provinsi: Sumatera Selatan", "https://lh3.googleusercontent.com/p/AF1QipNddH6fAzQsheRxQkp8UdrioL29JQ7rm5V8x3IL=s680-w680-h510"},
            {"Gupo Petshop", "Toko perlengkapan hewan peliharaan di Palembang, Sumatera Selatan Alamat: Jl. Kol. H. Burlian No.202, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30151 Telepon: 0822-5387-6969 Provinsi: Sumatera Selatan", "https://lh3.googleusercontent.com/p/AF1QipPO0WTQWqGjFWslWDogCpH14DMO5dFPAPXiJMxT=s680-w680-h510"},
            {"Lucky Paw Petshop", "Toko hewan peliharaan di Palembang, Sumatera Selatan Alamat: komplek Ruko Ilir Barat Permai blok D3 no 1, 24 Ilir, Bukit Kecil, Palembang City, South Sumatra 30114 Telepon:  (0711) 315079 Provinsi : Sumatera Selatan", "https://lh3.googleusercontent.com/p/AF1QipOlCja7ygAMAhc0vklj48IbIROkyxhMH3ZRbaVb=s680-w680-h510"},
            {"Planet Petshop", "planet petshop Toko hewan peliharaan di Palembang, Sumatera Selatan Alamat : Jl. Brigjen Hasan Kasim No.30G, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30961 Nomor Telepon : 0812-7153-8897", "https://lh3.googleusercontent.com/p/AF1QipNt5XV623xuepUqwttbf_-uhOQiDQ23CoCPH3Bw=s680-w680-h510"},
            {"Hippo Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat: Jl. Kol. H. Burlian No.283 A, RT.070/RW.013, Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30152\n" +
                    "Telepon: 0812-8000-3999", "https://lh3.googleusercontent.com/p/AF1QipMwouNo1ad9gBlFcqegJwKA6aTbSWitWgvFEoi3=s680-w680-h510"},
            {"Keka Petshop", "Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, dikenal sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, 12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah tokoh pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia juga pernah menjabat sebagai Perdana Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Ia mundur dari jabatan wakil presiden pada tahun 1956, karena berselisih dengan Presiden Soekarno. Hatta juga dikenal sebagai Bapak Koperasi Indonesia.", ""},
            {"Yosella Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Jalan Mayor Haji Muhammad Rasyad Nawawi No.240\n" +
                    "15 Ilir Timur I Kota Palembang Sumatera Selatan 30124 Telepon : \n" +
                    "(0711) 5734012", "https://lh3.googleusercontent.com/p/AF1QipNWo7UD9CdSnV9WvfngCgNUyuoFmMxH-FLCDxVH=w960-h960-n-o-v1"},
            {"Soekarno", "Dr.(H.C.) Ir. H. Soekarno (ER, EYD: Sukarno, nama lahir: Koesno Sosrodihardjo) (lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia (bersama dengan Mohammad Hatta) yang terjadi pada tanggal 17 Agustus 1945. Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/330px-Presiden_Sukarno.jpg"},
    };

    public static ArrayList<ModelPahlawan> ambilDataPahlawan(){
        ArrayList<ModelPahlawan> dataPahlawan = new ArrayList<>();

        for(String[] varData: data){
            ModelPahlawan mdl = new ModelPahlawan();
            mdl.setNama(varData[0]);
            mdl.setTentang(varData[1]);
            mdl.setFoto(varData[2]);

            dataPahlawan.add(mdl);
        }

        return dataPahlawan;
    }
}
