import java.util.Scanner;
public class AntrianKRSMain11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        AntrianKRS11 antrian = new AntrianKRS11(10);
        int totalTarget = 30; 

        int pilihan;
        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah yang Sudah KRS");
            System.out.println("8. Jumlah yang Belum KRS");
            System.out.println("9. Cek Antrian Kosong");
            System.out.println("10. Cek Antrian Penuh");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input11.nextInt(); 
            input11.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = input11.nextLine();
                    System.out.print("Nama    : ");
                    String nama = input11.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = input11.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = input11.nextLine();
                    antrian.tambahAntrian(new Mahasiswa11(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanTerdepan();
                    break;
                case 5:
                    antrian.tampilkanTerakhir();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahDilayani();
                    break;
                case 8:
                    antrian.jumlahBelumKRS(totalTarget);
                    break;
                case 9:
                    System.out.println(antrian.IsEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 10:
                    System.out.println(antrian.IsFull() ? "Antrian penuh" : "Antrian belum penuh");
                    break;
                case 11:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}
