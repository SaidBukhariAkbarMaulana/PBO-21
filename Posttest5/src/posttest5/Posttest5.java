
package posttest5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public final class Posttest5 { // final class
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Anak> listAnk = new ArrayList<>();
    static ArrayList<Penduduk> listPdk = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    static final void display() { // final method
        System.out.println("\n=================================================");
        System.out.println("|                   List Data                   |");
    }
    
    public static void tambahData() throws IOException {
        System.out.println("Pilih Jenis data KTP yang ingin di tambahkan");
        System.out.println("1. KTP Penduduk");
        System.out.println("2. KTP Anak");
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
            listPdk.add(new Penduduk(name, tanggalLahir, jenisKelamin, nik, statusPerkawinan, pekerjaan));
            System.out.println("Data " + name + " berhasil ditambahkan!");

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
            listAnk.add(new Anak(name, tanggalLahir, jenisKelamin, nik, NamaKepalaKeluarga, NoKartuKeluarga));
            
        }else{
            System.out.println("Pilihan Salah");
        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. KTP Penduduk");
        System.out.println("2. KTP Anak");
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
                    System.out.println("Data ke-" + (i));
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
                    System.out.println("Data ke-" + (i));
                    listAnk.get(i).tampil(true, true);
                }
            }
                System.out.println("=================================================");
        }else{
            System.out.println("Pilihan salah");

        }
    } 
    
     
    public static void editData() throws IOException{
        System.out.println("Jenis data KTP yang ingin di ubah :");
        System.out.println("1. KTP Penduduk");
        System.out.println("2. KTP Anak");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listPdk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listPdk.size();i++){
                    System.out.println("\nData ke-" + (i));
                    listPdk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data penduduk yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listPdk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Penduduk pdk = listPdk.get(index);
                    System.out.println("Data Penduduk dengan indeks " + index);
//                    System.out.println(pdk);
                    System.out.println("======= Masukkan data penduduk yang baru =======");
                    System.out.print("Masukkan NIK                       : ");                  
                    pdk.setNik(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama                      : ");
                    pdk.setName(input.readLine());
                    System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
                    pdk.setTanggalLahir(input.readLine());
                    System.out.print("Masukkan Jenis Kelamin             : ");
                    pdk.setJenisKelamin(input.readLine());
                    System.out.print("Masukkan Status Perkawinan         : ");
                    pdk.setStatusPerkawinan(input.readLine());
                    System.out.print("Masukkan pekerjaan                 : ");
                    pdk.setPekerjaan(input.readLine());
                    System.out.println("===============================================");
                    System.out.println("Data anak berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listAnk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listAnk.size();i++){
                    System.out.println("\nData ke-" + (i));
                    listAnk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data anak yang ingin diubah : ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listAnk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Anak ank = listAnk.get(index);
                    System.out.println("Data dosen dengan indeks " + index);
//                    System.out.println(ank);
                    System.out.println("======= Masukkan data anak yang baru =======");
                    System.out.print("Masukkan NIK                       : ");                  
                    ank.setNik(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama                      : ");
                    ank.setName(input.readLine());
                    System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
                    ank.setTanggalLahir(input.readLine());
                    System.out.print("Masukkan Jenis Kelamin             : ");
                    ank.setJenisKelamin(input.readLine());
                    System.out.print("Masukkan Nomor Kartu Keluarga      : ");
                    ank.setNoKartuKeluarga(Integer.parseInt(input.readLine()));
                    System.out.print("Masukkan Nama Kepala Keluarga      : ");
                    ank.setNamaKepalaKeluarga(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data dosen berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    
    public static void hapusData() throws IOException{
        System.out.println("Masukkan indeks data anak yang ingin dihapus : ");
        System.out.println("1. KTP Penduduk");
        System.out.println("2. KTP Anak");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){ 
        if (listPdk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
            for(int i = 0; i < listPdk.size();i++){
                    System.out.println("\nData ke-" + (i));
                    listPdk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data penduduk yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listPdk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Penduduk pdk = listPdk.get(index);
                    listPdk.remove(index);
                    System.out.println("Data penduduk dengan indeks " + index + " berhasil dihapus:");
//                    System.out.println(pdk);
                }
            }
        }else if(pil == 2){
            if (listAnk.isEmpty()) {
                System.out.println("\n=================================================");
                System.out.println("\t  Belum ada data yang tersimpan!");
                System.out.println("=================================================");
            } else {
                for(int i = 0; i < listAnk.size();i++){
                    System.out.println("\nData ke-" + (i));
                    listAnk.get(i).tampil();
                    }
                System.out.print("Masukkan indeks data anak yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listAnk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Anak ank = listAnk.get(index);
                    listAnk.remove(index);
                    System.out.println("Data anak dengan indeks " + index + " berhasil dihapus:");
//                    System.out.println(ank);
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
                           ====================================
                           """);
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
