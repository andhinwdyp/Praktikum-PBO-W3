package id.ac.polban.model;

public class Tugas {
    private static int counter = 0;

    private String id;
    private String judul;
    private String deadline;
    private String status;

    public Tugas(String judul, String deadline) {
        this.id = String.format("TGS-%03d", ++counter);
        this.judul = judul;
        this.deadline = deadline;
        this.status = "Belum Selesai";
    }

    public String getId() { return id; }
    public String getJudul() { return judul; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }

    public void selesai() {
        this.status = "Selesai";
    }

    @Override
    public String toString() {
        return id + " - " + judul + " (deadline: " + deadline + ") [" + status + "]";
    }
}
