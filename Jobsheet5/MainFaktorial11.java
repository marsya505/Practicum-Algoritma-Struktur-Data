import java.util.Scanner;
public class MainFaktorial11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input11.nextInt();

        Faktorial11 fk = new Faktorial11();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
