import java.util.Scanner;
public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Jumlah mata kuliah: ");
        int jumlahMatkul = input11.nextInt();
        input11.nextLine();

        Matakuliah11[] arrayofMatakuliah11 = new Matakuliah11[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            arrayofMatakuliah11[i] = new Matakuliah11("", "");

            arrayofMatakuliah11[i].tambahData();
        }
        for (int i=0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah11[i].cetakInfo();
        }
    }
}
