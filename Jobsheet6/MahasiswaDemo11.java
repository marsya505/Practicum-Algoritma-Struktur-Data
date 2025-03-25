import java.util.Scanner;
public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11();
        int jumMhs=5;
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = input11.nextLine();
            System.out.print("Nama: ");
            String nama = input11.nextLine();
            System.out.print("Kelas: ");
            String kelas = input11.nextLine();
            System.out.print("IPK: ");
            String ip = input11.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("---------------------------");
            list.tambah(new Mahasiswa11(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = input11.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-----------------------------------");
        int posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1, true);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
