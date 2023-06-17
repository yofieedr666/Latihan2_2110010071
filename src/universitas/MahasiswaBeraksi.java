
package universitas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa Yofie = new Mahasiswa("2110010071","Yofie","TI");
        System.out.println("Npm Mahasiswa = "+Yofie.getNpm());
        System.out.println("Nama Mahasiswa = "+Yofie.getNama());
        System.out.println("Prodi Mahasiswa = "+Yofie.getProdi());
    }
}