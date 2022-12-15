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
            {"Keka Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Jl. Mayor Zurbi Bustan No.4149a, RT.19/RW.004, Sukajaya, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961\n" +
                    "Nomor Telepon : 0812-7290-8507 Provinsi : Sumatera Selatan", "https://lh5.googleusercontent.com/p/AF1QipOFyXTT_ghsaml6rYhXI2heERDXhz6XDgX0och3=w493-h240-k-no"},
            {"Yosella Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Jalan Mayor Haji Muhammad Rasyad Nawawi No.240\n" +
                    "15 Ilir Timur I Kota Palembang Sumatera Selatan 30124 Telepon : \n" +
                    "(0711) 5734012", "https://lh3.googleusercontent.com/p/AF1QipNWo7UD9CdSnV9WvfngCgNUyuoFmMxH-FLCDxVH=w960-h960-n-o-v1"},
            {"3D Petshop", "Toko perlengkapan hewan peliharaan di palembang Alamat : lokasi : Jl. Radial No.10, 24 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30127, Indonesia Telepon : (0711) 315614", "https://1.bp.blogspot.com/-LlDVmCkWf-w/X5BxdG1EhvI/AAAAAAAADIE/9eZe5QgKwvcYU-lri7DoOXSnFgKnF2h9QCLcBGAsYHQ/s587/Alamat%2B3D%2BPetshop%2BPalembang%2BSumsel.jpg"},
            {"Sobat Bulu Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat : Alamat: Blok BA 9 KOMPLEK OPI, Jl. Opi II, Sungai Kedukan, Rambutan, Banyuasin Regency, South Sumatra 30967\n" +
                    "Telepon: 0812-9291-6995", "https://lh5.googleusercontent.com/p/AF1QipMcKtDNqoe-m-gnvUImmbRNSBn5-EdX7jgfmsUL=w408-h306-k-no"},
            {"Jawara Petshop", "Toko perlengkapan hewan peliharaan di Palembang Alamat :  Jl. Jend. Sudirman, 24 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30114, Indonesia  Nomor Telepon\t: 0853-6868-9293", "https://zh0f45.n3cdn1.secureserver.net/wp-content/uploads/2021/08/Jawara.jpg"}
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
