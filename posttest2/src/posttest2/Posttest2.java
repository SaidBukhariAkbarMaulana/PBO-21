package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Posttest2 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static ArrayList<Data> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        while(true){
            System.out.println("Program Pendataan KTP Digital Online ");
            System.out.println("====================================");
            System.out.println("| 1. Menambah Data                 | ");
            System.out.println("| 2. Melihat Data                  | ");
            System.out.println("| 3. Mengubah Data                 | ");
            System.out.println("| 4. Menghapus Data                | ");
            System.out.println("| 5. Keluar Program                |");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> tambah();
                case 2 -> tampil();
                case 3 -> ubah();
                case 4 -> hapus();
                case 5 -> System.exit(0);
                default -> System.out.println("PILIHAN SALAH!");
            }
            System.out.println("\n\n");
        }
    }
    
    static void tambah() throws IOException{
        System.out.println("\n\tMenu Menambahkan Data ");
        System.out.println("====================================");
        System.out.println("Masukkan Nama : ");
        String nama = br.readLine();
        
        System.out.println("Masukkan Tanngal Lahir (DD/MM/YYYY) : ");
        String tanggalLahir = br.readLine();
        
        System.out.println("Masukkan Agama : ");
        String agama = br.readLine();
        
        System.out.println("Masukkan RT : ");
        int rt = Integer.parseInt(br.readLine());
        
        System.out.println("Masukkan Tinggi : ");
        float tinggi = Float.parseFloat(br.readLine());
        
        Data org = new Data(nama, tanggalLahir, agama, rt, tinggi);
        list.add(org);
        System.out.println("Data Berhasil Ditambahkan.");
    }
    
    static void tampil(){
        System.out.println("\n Data KTP Digital Online ");
        System.out.println("=========================");
        if (list.isEmpty()){
            System.out.println("Belum ada data!");
        }else{
            for(int i = 0; i< list.size(); i++){
                System.out.print("\nData ke-" + (i + 1));
                System.out.println("\nNama          : " + list.get(i).getName());
                System.out.println("Tanggal Lahir : " + list.get(i).getTanggalLahir());
                System.out.println("Agama         : " + list.get(i).getAgama());
                System.out.println("RT            : " + list.get(i).getRt());
                System.out.println("Tinggi        : " + list.get(i).getTinggi());
                System.out.println("====================================");
            }
        }
    }
    
    static void ubah() throws IOException{
        if (list.isEmpty()){
            System.out.println("Belum ada data!");
        }else{
        tampil();
        System.out.println("\n\tMenu Mengubah Data ");
        System.out.println("====================================");
        System.out.print("Nomor data yang akan diubah: ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        System.out.println("Mau Ubah Menjadi : ");
        
        System.out.println("Nama Baru: ");
        list.get(pilihan).setName(br.readLine());
        
        System.out.println("Tanggal Lahir (DD/MM/YYYY) Baru: ");
        list.get(pilihan).setTanggalLahir(br.readLine());
        
        System.out.println("Agama Baru: ");
        list.get(pilihan).setAgama(br.readLine());
        
        System.out.println("RT Baru: ");
        list.get(pilihan).setRt(Integer.parseInt(br.readLine()));
        
        System.out.println("Tinggi Baru: ");
        list.get(pilihan).setTinggi(Float.parseFloat(br.readLine()));
        
        System.out.println("Data Berhasil Diubah...");
        }
    } 
    static void hapus() throws IOException{
        if (list.isEmpty()){
            System.out.println("Belum ada data!");
        }else{
        tampil();
        System.out.println("\n\tMenu Menghapus Data ");
        System.out.println("====================================");
        System.out.print("Nomor data yang akan dihapus: ");
        int pilihan = Integer.parseInt(br.readLine());
        pilihan -=1;
        
        list.remove(pilihan);
        System.out.println("Data berhasil dihapus!");
        }
    } 
}