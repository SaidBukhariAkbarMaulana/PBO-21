package posttest2;

class Data {
    private String name; // atribut yang hanya bisa diakses di class yang sama
    private String tanggalLahir;
    private String agama;
    private int rt;
    private float tinggi;
    
    public Data(String name, String tanggalLahir,String agama, int rt, float tinggi){
        this.name = name;
        this.tanggalLahir = tanggalLahir;
        this.agama = agama;
        this.rt = rt;
        this.tinggi = tinggi;
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
     * @return the agama
     */
    public String getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(String agama) {
        this.agama = agama;
    }

    /**
     * @return the rt
     */
    public int getRt() {
        return rt;
    }

    /**
     * @param rt the rt to set
     */
    public void setRt(int rt) {
        this.rt = rt;
    }

    /**
     * @return the tinggi
     */
    public float getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    
   
}
