public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen = "24240706";
        dosen1.nama = "Bambang M.Kom., MMT.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Pemrograman";

        Dosen11 dosen2 = new Dosen11("24250706", "Mulyani, SE. M.Sc.", false, 2010, "Bisnis");

        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false); 
        System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Basis Data"); 

        System.out.println("\nInformasi Dosen 2:");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja Dosen 2: " + dosen2.hitungMasaKerja(2025) + " tahun");

        System.out.println("\nInformasi Dosen :");
        dosen1.tampilInformasi();
    }
}