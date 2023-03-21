/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author LENOVO
 */
public class Anak extends Data{
    private int NoKartuKeluarga;
    private String NamaKepalaKeluarga;
    
    public Anak(String name, String tanggalLahir, String jenisKelamin, int nik, int NoKartuKeluarga, String NamaKepalaKeluarga) {
        super(name, tanggalLahir, jenisKelamin, nik);
        this.NoKartuKeluarga = NoKartuKeluarga;
        this.NamaKepalaKeluarga = NamaKepalaKeluarga;
    }
    
    
    
    
    
    public void notif() {
        System.out.println("Berhasil ditambahkan dikategori Anak - anak. ");
    }

    /**
     * @return the NoKartuKeluarga
     */
    public int getNoKartuKeluarga() {
        return NoKartuKeluarga;
    }

    /**
     * @param NoKartuKeluarga the NoKartuKeluarga to set
     */
    public void setNoKartuKeluarga(int NoKartuKeluarga) {
        this.NoKartuKeluarga = NoKartuKeluarga;
    }

    /**
     * @return the NamaKepalaKeluarga
     */
    public String getNamaKepalaKeluarga() {
        return NamaKepalaKeluarga;
    }

    /**
     * @param NamaKepalaKeluarga the NamaKepalaKeluarga to set
     */
    public void setNamaKepalaKeluarga(String NamaKepalaKeluarga) {
        this.NamaKepalaKeluarga = NamaKepalaKeluarga;
    }
}
    
