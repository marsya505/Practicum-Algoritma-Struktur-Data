import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = input11.nextInt();
        input11.nextLine(); 
        DataDosen11 dataDosen = new DataDosen11(jumlahDosen);
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nData dosen ke-" + (i + 1) + ":");
            System.out.print("Kode: ");
            String kode = input11.nextLine();
            System.out.print("Nama: ");
            String nama = input11.nextLine();
            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            boolean jk = input11.nextBoolean();
            System.out.print("Usia: ");
            int usia = input11.nextInt();
            input11.nextLine();
            dataDosen.tambah(new Dosen11(kode, nama, jk, usia));
        }
        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tampilkan Semua Data Dosen");
            System.out.println("2. Cari Dosen Berdasarkan Nama (Sequential Search)");
            System.out.println("3. Cari Dosen Berdasarkan Usia (Binary Search)");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilihan = input11.nextInt();
            input11.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\nData Dosen:");
                    dataDosen.tampil();
                    break;
                case 2:
                    System.out.print("\nMasukkan nama dosen yang dicari: ");
                    String cariNama = input11.nextLine();
                    System.out.println("\nHasil Pencarian:");
                    dataDosen.cariNama(cariNama);
                    break;
                case 3:
                    System.out.print("\nMasukkan usia dosen yang dicari: ");
                    int cariUsia = input11.nextInt();
                    input11.nextLine();
                    System.out.println("\nHasil Pencarian:");
                    dataDosen.cariUsia(cariUsia);
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    input11.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}