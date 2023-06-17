package universitas;

public class Mahasiswa {
   //membuat variable
    private String npm;
    private String nama;
    private String prodi;

    // Constructor
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Setter dan Getter
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Method untuk mendapatkan detail mahasiswa
    public String getDetail() {
        return "NPM: " + npm + "\nNama: " + nama + "\nProdi: " + prodi;
    }
}