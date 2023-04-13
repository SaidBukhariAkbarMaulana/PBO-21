
package posttest6;



public class Penduduk extends Data implements Tambahan{
    private String statusPerkawinan;
    private String pekerjaan;
    
    public Penduduk(String name, String tanggalLahir, String jenisKelamin, int nik, String statusPerkawinan, String pekerjaan) {
        super(name, tanggalLahir, jenisKelamin, nik);
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the statusPerkawinan
     */
    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    /**
     * @param statusPerkawinan the statusPerkawinan to set
     */
    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    
    
    @Override
    public void tampil(){
        System.out.println("Provinsi             : " + provinsi);
        System.out.println("Nama                 : " + getName() );
        System.out.println("Tanggal Lahir        : " + getTanggalLahir() );
        System.out.println("Jenis Kelamin        : " + getJenisKelamin() );
        System.out.println("NIK                  : " + getNik() );
        System.out.println("Status Perkawinan    : " + statusPerkawinan);
        System.out.println("Pekerjaan            : " + pekerjaan);
        System.out.println("Kewarganegaraan      : " + Kewarganegaraan());
        System.out.println("Berlaku Hingga       : " + berlakuHingga());
    }
    
    // Penggunaan static
    public static void Berlaku(){
        System.out.println("Berlaku Hingga : Seumur Hidup");
    }
    
    @Override
    public String Kewarganegaraan(){
        return "Indonesia";
    }
    @Override
    public String berlakuHingga(){
        return "Seumur Hidup ";
    }
}
