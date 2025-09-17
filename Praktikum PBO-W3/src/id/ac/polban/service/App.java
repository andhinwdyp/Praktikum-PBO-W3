package id.ac.polban.service;

import id.ac.polban.model.*;

public class App {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("231511001", "Andhini Putri");
        CatatanTugas catatan = new CatatanTugas(mhs);

        catatan.tambahTugas(new Tugas("Bikin laporan PBO", "2025-09-01"));
        catatan.tambahTugas(new Tugas("Baca bab Linked List", "2025-09-02"));

        catatan.tampilkanSemua();

        System.out.println("\nMenandai tugas pertama selesai...\n");
        catatan.tandaiSelesai(0);

        catatan.tampilkanSemua();

        System.out.println("\nTotal tugas: " + catatan.totalTugas());
    }
}
