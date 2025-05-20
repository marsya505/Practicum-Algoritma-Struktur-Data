package dll;

import java.util.Scanner;

public class Mahasiswa11 {
    public String nim;
    public String nama;
    public String kelas;
    public double ipk;

    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK: " + ipk);
    } 

    public static Mahasiswa11 inputMahasiswa(Scanner scan11) {
        System.out.print("Masukkan NIM: ");
        String nim = scan11.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan11.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan11.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan11.nextDouble(); scan11.nextLine();
        return new Mahasiswa11(nim, nama, kelas, ipk);
    }
}
