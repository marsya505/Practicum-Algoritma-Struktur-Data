import java.util.Scanner;
public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        Matakuliah11[] arrayofMatakuliah11 = new Matakuliah11[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            arrayofMatakuliah11[i] = new Matakuliah11("", "");

            arrayofMatakuliah11[i].tambahData();
        }
        for (int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : "+ arrayofMatakuliah11[i].kode);
            System.out.println("Nama        : "+ arrayofMatakuliah11[i].nama);
            System.out.println("Sks         : "+ arrayofMatakuliah11[i].sks);
            System.out.println("Jumlah Jam  : "+ arrayofMatakuliah11[i].jumlahJam);
            System.out.println("----------------------------");
        }
    }
}
