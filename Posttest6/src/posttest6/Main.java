
package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main { // final class
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Anak> listAnk = new ArrayList<>();
    static ArrayList<Penduduk> listPdk = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    
    // static method
    public static void jenisKTP()
    {
        System.out.println("============================================");
        System.out.println("Pilih Jenis KTP :");
        System.out.println("1. KTP Penduduk");
        System.out.println("2. KTP Anak");
    }
    
    static final void display() { // final method
        System.out.println("\n=================================================");
        System.out.println("|                   List Data                   |");
    }
    
    
    public static void tambahData() throws IOException {
        jenisKTP();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Penduduk ==========");
            System.out.print("Masukkan NIK                       : ");
            int nik = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama                      : ");
            String name = input.readLine();
            System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
            String tanggalLahir = input.readLine();
            System.out.print("Masukkan Jenis Kelamin             : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukkan Status Perkawinan         : ");
            String statusPerkawinan = input.readLine();
            System.out.print("Masukkan Pekerjaan                 : ");
            String pekerjaan = input.readLine();
            System.out.println("=============================================");
//            listPdk.add(new Penduduk(name, tanggalLahir, jenisKelamin, nik, statusPerkawinan, pekerjaan));
            Penduduk pdk = new Penduduk(name, tanggalLahir, jenisKelamin, nik, statusPerkawinan, pekerjaan);
            listPdk.add(pdk);
            pdk.info(name);

        }else if(pil == 2){
            System.out.println("========== Masukkan Data anak ==========");
            System.out.print("Masukkan NIK                       : ");
            int nik = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama                      : ");
            String name = input.readLine();
            System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
            String tanggalLahir = input.readLine();
            System.out.print("Masukkan Jenis Kelamin             : ");
            String jenisKelamin = input.readLine();
            System.out.print("Masukkan Nomor Kartu Keluarga      : ");
            int NoKartuKeluarga = Integer.parseInt(input.readLine());
            System.out.print("Masukkan Nama Kepala Keluarga      : ");
            String NamaKepalaKeluarga = input.readLine();
            System.out.println("=============================================");
            Anak ank = new Anak(name, tanggalLahir, jenisKelamin, nik, NamaKepalaKeluarga, NoKartuKeluarga);
            listAnk.add(ank);
            ank.info(name);
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void lihatData() throws IOException{
        jenisKTP();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            display();
            System.out.println("|                    Penduduk                   |");
            System.out.println("=================================================");
            if (listPdk.isEmpty()){
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listPdk.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listPdk.get(i).tampil();
                    }
                }
                System.out.println("=================================================");
        }else if(pil == 2){
            display();
            System.out.println("|                      Anak                     |");
            System.out.println("=================================================");
            if (listAnk.isEmpty()){
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listAnk.size();i++){
                    System.out.println("Data ke-" + (i+1));
                    listAnk.get(i).tampil();
                }
            }
                System.out.println("=================================================");
        }else{
            System.out.println("Pilihan salah");

        }
    } 
    
     
    public static void editData() throws IOException{
        jenisKTP();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listPdk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listPdk.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listPdk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data penduduk yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                
                if(index <= listPdk.size() || index > 0){
                    System.out.println("======= Masukkan data penduduk yang baru =======");
                    System.out.print("\nMasukkan NIK                       : ");
                    int nik = Integer.parseInt(input.readLine());
                    listPdk.get(index-1).setNik(nik);

                    System.out.print("Masukkan Nama                      : ");
                    String name = input.readLine();
                    listPdk.get(index-1).setName(name);

                    System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
                    String tanggalLahir = input.readLine();
                    listPdk.get(index-1).setTanggalLahir(tanggalLahir);

                    System.out.print("Masukkan Jenis Kelamin             : ");
                    String jenisKelamin = input.readLine();
                    listPdk.get(index-1).setJenisKelamin(jenisKelamin);

                    System.out.print("Masukkan Status Perkawinan         : ");
                    String statusPerkawinan = input.readLine();
                    listPdk.get(index-1).setStatusPerkawinan(statusPerkawinan);

                    System.out.print("Masukkan pekerjaan                 : ");
                    String pekerjaan = input.readLine();
                    listPdk.get(index-1).setPekerjaan(pekerjaan);
                    listPdk.get(index-1).info(nik);
                    System.out.println("================================================");
                }else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }  
        }else if(pil == 2){
            if (listAnk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listAnk.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listAnk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data anak yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listAnk.size() || index > 0){
                    System.out.println("======= Masukkan data anak yang baru =======");
                    System.out.print("\nMasukkan NIK                       : ");
                    int nik = Integer.parseInt(input.readLine());
                    listAnk.get(index-1).setNik(nik);

                    System.out.print("Masukkan Nama                      : ");
                    String name = input.readLine();
                    listAnk.get(index-1).setName(name);

                    System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
                    String tanggalLahir = input.readLine();
                    listAnk.get(index-1).setTanggalLahir(tanggalLahir);

                    System.out.print("Masukkan Jenis Kelamin             : ");
                    String jenisKelamin = input.readLine();
                    listAnk.get(index-1).setJenisKelamin(jenisKelamin);

                    System.out.print("Masukkan Nama Kepala Keluarga      : ");
                    String NamaKepalaKeluarga = input.readLine();
                    listAnk.get(index-1).setNamaKepalaKeluarga(NamaKepalaKeluarga);

                    System.out.print("Masukkan Nomer Kartu Keluarga      : ");
                    int NoKartuKeluarga = Integer.parseInt(input.readLine());
                    listAnk.get(index-1).setNoKartuKeluarga(NoKartuKeluarga);
                    listAnk.get(index-1).info(nik);
                    System.out.println(  "============================================");
                    }else
                    {
                        System.out.println("Indeks tidak ditemukan!");
                    }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    
    public static void hapusData() throws IOException{
        jenisKTP();
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){ 
        if (listPdk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
            for(int i = 0; i < listPdk.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listPdk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data penduduk yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listPdk.size() || index > 0) 
                {
                    listPdk.remove(index-1);
                    System.out.println("Data penduduk dengan indeks " + index + " berhasil dihapus");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else if(pil == 2){
            if (listAnk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listAnk.size();i++){
                    System.out.println("\nData ke-" + (i+1));
                    listAnk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data anak yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if(index <= listAnk.size() || index > 0) 
                {
                    listAnk.remove(index-1);
                    System.out.println("Data anak dengan indeks " + index + " berhasil dihapus:");
                }
                else
                {
                    System.out.println("Indeks tidak ditemukan!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
        
    }
        
        
    public static void main(String[] args) throws IOException  {
        boolean menu = true;
        while(menu == true){
        System.out.println("""
                           Program Pendataan KTP Digital Online
                           ====================================
                           | 1. Menambah Data                 |
                           | 2. Melihat Data                  |
                           | 3. Mengubah Data                 |
                           | 4. Menghapus Data                |
                           | 5. Keluar Program                |
                           ====================================""");
        System.out.print("Pilih: ");
        int pilih = Integer.parseInt(input.readLine());
        switch(pilih){
            case 1:
                tambahData();
                froze();
                break;
            case 2:
                lihatData();
                froze();
                break;
            case 3:
                editData();
                froze();
                break;
            case 4:
                hapusData();
                froze();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan program ini!");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah!");
                froze();
                break;
            }
        }
    }  
}
