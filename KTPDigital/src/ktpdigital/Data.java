package ktpdigital;

class Data { // digunakan untuk menyimpan informasi tentang objek-objek yang dibuat dalam program.
    private String name; // atribut yang hanya bisa diakses di class yang sama
    private String tanggalLahir;
    private String agama;
    private int rt;
    private double tinggi;

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String name, String tanggalLahir, String agama, int rt, double tinggi) {
        this.name = name; // untuk menginisialisasi atribut "name"
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.rt = rt;
        this.tinggi = tinggi;
    }

    // untuk mendefinisikan sebuah method pada class "Data" yang akan mengembalikan
    // nilai dari
    // atribut "name" pada objek yang memanggil method tersebut.
    public String getName() {
        return name;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getAgama() {
        return agama;
    }

    public int getRt() {
        return rt;
    }

    public double getTinggi() {
        return tinggi;
    }
}
