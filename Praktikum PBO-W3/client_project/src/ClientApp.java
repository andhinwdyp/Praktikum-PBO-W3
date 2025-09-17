// ClientApp.java
// Compile: javac -cp ..\tugas-harian.jar -d out src\ClientApp.java
// Run: java -cp ..\tugas-harian.jar;out ClientApp

import id.ac.polban.model.Mahasiswa;
import id.ac.polban.model.CatatanTugas;
import id.ac.polban.model.Tugas;

public class ClientApp {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("231511001", "Andhini");
        CatatanTugas c = new CatatanTugas(m);
        c.tambahTugas(new Tugas("Contoh tugas dari client", "2025-09-10"));
        c.tampilkanSemua();
    }
}
