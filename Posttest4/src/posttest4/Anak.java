
package posttest4;

public class Anak extends Data{
    private int NoKartuKeluarga;
    private String NamaKepalaKeluarga;

    
    public Anak(String name, String tanggalLahir, String jenisKelamin, int nik, int NoKartuKeluarga, String NamaKepalaKeluarga) {
        super(name, tanggalLahir, jenisKelamin, nik);
        this.NoKartuKeluarga = NoKartuKeluarga;
        this.NamaKepalaKeluarga = NamaKepalaKeluarga;
//        this.masaBerlaku = masaBerlaku;
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
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Nomor Kartu Keluarga : " + NoKartuKeluarga);
        System.out.println("Nama Kepala Keluarga : " + NamaKepalaKeluarga);
    }
    
    // overloading
    public void tampil(boolean showID){
        if(showID) tampil();
        else super.tampil();
    }
}
    

