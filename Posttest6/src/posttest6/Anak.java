
package posttest6;

public class Anak extends Data implements Tambahan{
    private String NamaKepalaKeluarga;
    private int NoKartuKeluarga;
    

    
    public Anak(String name, String tanggalLahir, String jenisKelamin, int nik, String NamaKepalaKeluarga, int NoKartuKeluarga) {
        super(name, tanggalLahir, jenisKelamin, nik);
        this.NamaKepalaKeluarga = NamaKepalaKeluarga;
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

    @Override
    public void tampil(){
        System.out.println("Provinsi             : " + provinsi);
        System.out.println("Nama                 : " + getName() );
        System.out.println("Tanggal Lahir        : " + getTanggalLahir() );
        System.out.println("Jenis Kelamin        : " + getJenisKelamin() );
        System.out.println("NIK                  : " + getNik() );
        System.out.println("Nama Kepala Keluarga : " + NamaKepalaKeluarga);
        System.out.println("No Kartu Keluarga    : " + NoKartuKeluarga);
        System.out.println("Kewarganegaraan      : " + Kewarganegaraan());
        System.out.println("Berlaku Hingga       : " + berlakuHingga());
    }
    
    
    @Override
    public String Kewarganegaraan(){
        return "Indonesia";
    }
    @Override
    public String berlakuHingga(){
        return "5 tahun ";
    } 
}
