import java.util.Scanner;
public class SuratDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    Surat11 surat = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                    
                case 2:
                    Surat11 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memverifikasi surat dari: " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir oleh: " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat atas nama " + cari + " ditemukan.");
                    } else {
                        System.out.println("Surat atas nama " + cari + " tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
