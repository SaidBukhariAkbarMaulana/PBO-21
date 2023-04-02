package posttest5;


// abstract class
public abstract class Data { 
    protected  final String provinsi = "Bontang, Kalimantan Timur"; // final pada atribut
    private  String name; 
    private  String tanggalLahir;
    private  String jenisKelamin;
    private  int nik;
    

    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String name, String tanggalLahir, String jenisKelamin, int nik) {
        this.name = name; // untuk menginisialisasi atribut "name"
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
       
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the tanggalLahir
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the nik
     */
    public int getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(int nik) {
        this.nik = nik;
    }

    
    
    // overloading
    public void tampil(boolean showNoKTP) {
        System.out.println("Provinsi             : " + provinsi);
        System.out.println("Nama                 : " + getName());
        System.out.println("Tanggal Lahir        : " + getTanggalLahir() );
        System.out.println("Jenis Kelamin        : " + getJenisKelamin() );
        if (showNoKTP) {
            System.out.println("NIK                  : " + getNik() );
        }
    }
    
    
    // abstract method  
    public abstract void tampil();
}

