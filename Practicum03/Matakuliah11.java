import java.util.Scanner;

public class Matakuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah11(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public void tambahData() {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Kode          : ");
        this.kode = input11.nextLine();
        System.out.print("Nama          : ");
        this.nama = input11.nextLine();
        System.out.print("SKS           : ");
        this.sks = Integer.parseInt(input11.nextLine());
        System.out.print("Jumlah Jam    : ");
        this.jumlahJam = Integer.parseInt(input11.nextLine());
        System.out.println("----------------------------");
    }
}
