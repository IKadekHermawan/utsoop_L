/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_oop2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Uts_oop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CatatanKeuangan catatanKeuangan = new CatatanKeuangan();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Lihat Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan catatan: ");
                    String catatan = scanner.nextLine();
                    catatanKeuangan.tambahCatatan(catatan);
                    break;
                case 2:
                    catatanKeuangan.lihatCatatan();
                    break;
                case 3:
                    System.out.print("Masukkan indeks catatan yang ingin diubah: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan newline dari buffer
                    System.out.print("Masukkan catatan baru: ");
                    String catatanBaru = scanner.nextLine();
                    catatanKeuangan.ubahCatatan(index, catatanBaru);
                    break;
                case 4:
                    System.out.print("Masukkan indeks catatan yang ingin dihapus: ");
                    int indexHapus = scanner.nextInt();
                    catatanKeuangan.hapusCatatan(indexHapus);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
 
