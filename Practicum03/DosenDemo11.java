import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        Dosen11[] arrayOfDosen = new Dosen11[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode               : ");
            String kode = input11.nextLine();
            System.out.print("Nama               : ");
            String nama = input11.nextLine();
            System.out.print("Jenis Kelamin (P/W): ");
            String jkInput = input11.nextLine();
            Boolean jenisKelamin = jkInput.equalsIgnoreCase("P"); 
            System.out.print("Usia               : ");
            int usia = Integer.parseInt(input11.nextLine());
            arrayOfDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }
        int nomor = 1;
        for (Dosen11 dosen : arrayOfDosen) {
            dosen.cetakInfo(nomor++);
        }
        DataDosen11.dataSemuaDosen(arrayOfDosen);
        DataDosen11.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen11.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen11.infoDosenPalingTua(arrayOfDosen);
        DataDosen11.infoDosenPalingMuda(arrayOfDosen);
    }
}
