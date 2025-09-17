package id.ac.polban.model;

import java.util.ArrayList;

public class CatatanTugas {
    private Mahasiswa mahasiswa; // aggregation: CatatanTugas has-a Mahasiswa
    private ArrayList<Tugas> daftarTugas;

    public CatatanTugas(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarTugas = new ArrayList<>();
    }

    // dependency: method depends on Tugas type as parameter
    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
    }

    public void tandaiSelesai(int index) {
        if (index >= 0 && index < daftarTugas.size()) {
            daftarTugas.get(index).selesai();
        }
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Tugas " + mahasiswa.getNama() + " ===");
        for (int i = 0; i < daftarTugas.size(); i++) {
            System.out.println((i+1) + ". " + daftarTugas.get(i));
        }
    }

    public int totalTugas() {
        return daftarTugas.size();
    }
}
