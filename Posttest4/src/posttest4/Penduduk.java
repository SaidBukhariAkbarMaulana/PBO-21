/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

public class Penduduk extends Data{
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
        super.tampil();
        System.out.println("Status Perkawinan    : " + statusPerkawinan);
        System.out.println("Pekerjaan            : : " + pekerjaan);
    }
}
