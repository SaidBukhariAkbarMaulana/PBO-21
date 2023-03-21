/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author PC-05
 */
public class Posttest3 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Anak> listAnk = new ArrayList<>();
    static ArrayList<Penduduk> listPdk = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void tambahData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. Penduduk");
        System.out.println("2. Anak");
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
            listAnk.add(new Anak(name, tanggalLahir, jenisKelamin, nik, NoKartuKeluarga, NamaKepalaKeluarga));
            System.out.println("Data " + name + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void lihatData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Penduduk");
        System.out.println("2. Anak");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Penduduk ============");
            if (listPdk.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listPdk.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("NIK               :" + listPdk.get(i).getNik());
                    System.out.println("Nama              :" + listPdk.get(i).getName());
                    System.out.println("Tanggal Lahir     :" + listPdk.get(i).getTanggalLahir());
                    System.out.println("Jenis Kelamin     :" + listPdk.get(i).getJenisKelamin());
                    System.out.println("Status Perkawinan :" + listPdk.get(i).getStatusPerkawinan());
                    System.out.println("Pekerjaan         :" + listPdk.get(i).getPekerjaan());
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data Anak ===========");
            if (listAnk.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listAnk.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("NIK                  :" + listAnk.get(i).getNik());
                    System.out.println("Nama                 :" + listAnk.get(i).getName());
                    System.out.println("Tanggal Lahir        :" + listAnk.get(i).getTanggalLahir());
                    System.out.println("Jenis Kelamin        :" + listAnk.get(i).getJenisKelamin());
                    System.out.println("Nomor Kartu Keluarga :" + listAnk.get(i).getNoKartuKeluarga());
                    System.out.println("Nama Kepala Keluarga :" + listAnk.get(i).getNamaKepalaKeluarga());
                }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void editData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Penduduk");
        System.out.println("2. Anak");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listPdk.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Penduduk yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listPdk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Penduduk pdk = listPdk.get(index);
                    System.out.println("Data penduduk dengan indeks " + index);
                    System.out.println(pdk);
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
                    System.out.println("=================================================");
                    System.out.println("Data penduduk berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listAnk.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data anak yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listAnk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Anak ank = listAnk.get(index);
                    System.out.println("Data dosen dengan indeks " + index);
                    System.out.println(ank);
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
                    ank.setNoKartuKeluarga(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data anak berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void hapusData() throws IOException{
        System.out.println("Jenis data");
        System.out.println("1. Penduduk");
        System.out.println("2. Anak");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listPdk.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data penduduk yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listPdk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Penduduk pdk = listPdk.get(index);
                    listPdk.remove(index);
                    System.out.println("Data penduduk dengan indeks " + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (listAnk.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data anak yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listAnk.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Anak ank = listAnk.get(index);
                    listAnk.remove(index);
                    System.out.println("Data anak dengan indeks " + index + " berhasil dihapus:");
                    
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
                System.out.println("Program dihentikan");
                menu = false;
                break;
            default:
                System.out.println("Pilihan salah");
                froze();
                break;
            }
        }
    }
    
}
