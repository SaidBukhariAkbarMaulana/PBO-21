package posttest2;


import java.util.ArrayList;
import java.util.Scanner;

public class Posttest2 {
    static ArrayList<Data> dataList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while (true) {
            System.out.println("\nProgram Pendataan KTP Digital Online");
            System.out.println("====================================");
            System.out.println("| 1. Menambah Data                 |");
            System.out.println("| 2. Melihat Data                  |");
            System.out.println("| 3. Mengubah Data                 |");
            System.out.println("| 4. Menghapus Data                |");
            System.out.println("| 5. Keluar Program                |");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    addData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void addData() { // // Fungsi addData() untuk melakukan penambahan data
        System.out.println("\n\tMenu Menambahkan Data ");
        System.out.println("====================================");
        System.out.print("Masukkan Nama : ");
        scanner.nextLine(); // utk membuang newline (enter)
        String name = scanner.next();
        System.out.print("Masukkan Tanggal Lahir (DD/MM/YYYY): ");
        scanner.nextLine();
        String tanggalLahir = scanner.next();
        System.out.print("Masukkan Agama : ");
        scanner.nextLine();
        String Agama = scanner.next();
        System.out.print("Masukkan RT : ");
        int rt = scanner.nextInt();
        System.out.print("Masukkan Tinggi: ");
        double tinggi = scanner.nextDouble();

        Data data = new Data(name, tanggalLahir, Agama, rt, tinggi);
        dataList.add(data);
        System.out.println("====================================");
        System.out.println("Data berhasil ditambahkan!");
    }

    static void showData() {// Fungsi showData() untuk melihat data
        System.out.println("\n\tData KTP Digital Online ");
        System.out.println("====================================");
        if (dataList.isEmpty()) {
            System.out.println("Belum ada data!");
        } else {
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println("====================================");
                System.out.println("Nama          : " + dataList.get(i).getName());
                System.out.println("Tanggal Lahir : " + dataList.get(i).getTanggalLahir());
                System.out.println("Agama         : " + dataList.get(i).getAgama());
                System.out.println("RT            : " + dataList.get(i).getRt());
                System.out.println("Tinggi        : " + dataList.get(i).getTinggi());
                System.out.println("====================================");
            }
        }
    }

    static void updateData() {// Fungsi updateData() untuk melakukan perubahan data
        if (dataList.isEmpty()) {
            System.out.println("\nBelum ada data!");
        } else {
            showData();
            System.out.print("Nomor data yang akan diupdate: ");
            int index = scanner.nextInt() - 1; // untuk mengambil input dari pengguna

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                System.out.println("\n\tMenu Mengubah Data ");
                System.out.println("====================================");
                System.out.print("Masukkan Nama baru : ");
                String name = scanner.next();

                System.out.print("Masukkan Tanggal Lahir baru : ");
                String tanggalLahir = scanner.next();

                System.out.print("Masukkan Agama baru : ");
                String Agama = scanner.next();

                System.out.print("Masukkan RT baru : ");
                int rt = scanner.nextInt();

                System.out.print("Masukkan Tinggi baru : ");
                double tinggi = scanner.nextDouble();

                Data data = new Data(name, tanggalLahir, Agama, rt, tinggi);
                dataList.set(index, data); //ini setnya
                System.out.println("====================================");
                System.out.println("Data berhasil diupdate!");
            }
        }
    }

    static void deleteData() { // Fungsi deleteData() untuk melakukan penghapusan data
        if (dataList.isEmpty()) {
            System.out.println("\nBelum ada data!");
        } else {
            showData();
            System.out.println("\n\tMenu Menghapus Data ");
            System.out.println("====================================");
            System.out.print("Nomor data yang akan dihapus: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                dataList.remove(index);
                System.out.println("====================================");
                System.out.println("Data berhasil dihapus!");
            }
        }
    }
}
