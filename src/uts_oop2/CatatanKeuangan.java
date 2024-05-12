/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_oop2;

/**
 *
 * @author USER
 */
public class CatatanKeuangan {
    private String[] catatan;
    private int jumlahCatatan;
    private int maksimumCatatan;

    // Constructor
    public CatatanKeuangan() {
        this.maksimumCatatan = 100;
        this.catatan = new String[maksimumCatatan];
        this.jumlahCatatan = 0;
    }

    // Constructor dengan parameter untuk mengatur maksimum catatan
    public CatatanKeuangan(int maksimumCatatan) {
        this.maksimumCatatan = maksimumCatatan;
        this.catatan = new String[maksimumCatatan];
        this.jumlahCatatan = 0;
    }

    // Metode untuk menambah catatan
    public void tambahCatatan(String catatan) {
        if (jumlahCatatan < maksimumCatatan) {
            this.catatan[jumlahCatatan] = catatan;
            jumlahCatatan++;
            System.out.println("Catatan berhasil ditambahkan.");
        } else {
            System.out.println("Catatan sudah penuh. Tidak dapat menambah catatan baru.");
        }
    }

    // Metode untuk menampilkan semua catatan
    public void lihatCatatan() {
        if (jumlahCatatan == 0) {
            System.out.println("Tidak ada catatan.");
        } else {
            System.out.println("Daftar Catatan:");
            for (int i = 0; i < jumlahCatatan; i++) {
                System.out.println((i + 1) + ". " + catatan[i]);
            }
        }
    }

    // Metode untuk mengubah catatan
    public void ubahCatatan(int index, String catatanBaru) {
        if (index >= 0 && index < jumlahCatatan) {
            catatan[index] = catatanBaru;
            System.out.println("Catatan berhasil diubah.");
        } else {
            System.out.println("Indeks catatan tidak valid.");
        }
    }

    // Metode untuk menghapus catatan
    public void hapusCatatan(int index) {
        if (index >= 0 && index < jumlahCatatan) {
            for (int i = index; i < jumlahCatatan - 1; i++) {
                catatan[i] = catatan[i + 1];
            }
            jumlahCatatan--;
            System.out.println("Catatan berhasil dihapus.");
        } else {
            System.out.println("Indeks catatan tidak valid.");
        }
    }
}



