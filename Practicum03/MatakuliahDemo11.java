import java.util.Scanner;
public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        Matakuliah11[] arrayofMatakuliah11 = new Matakuliah11[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = input11.nextLine();
            System.out.print("Nama       : ");
            nama = input11.nextLine();
            System.out.print("Sks        : ");
            dummy = input11.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = input11.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------");

            arrayofMatakuliah11[i] = new Matakuliah11(kode, nama, sks, jumlahJam);
        }
    }
}
