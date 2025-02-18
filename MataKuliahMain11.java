public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK = "SIB242004";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        MataKuliah11 mk2 = new MataKuliah11("SIB242006", "Basis Data", 2, 6);

        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        System.out.println();

        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        System.out.println();

        System.out.println("Mengubah SKS untuk Mata Kuliah 1:");
        mk1.ubahSKS(4);
        System.out.println();

        System.out.println("Menambah jam untuk Mata Kuliah 1:");
        mk1.tambahJam(2);
        System.out.println();

        System.out.println("Mengurangi jam untuk Mata Kuliah 1:");
        mk1.kurangiJam(3);
        System.out.println();

        System.out.println("Mencoba mengurangi jam untuk Mata Kuliah 2:");
        mk2.kurangiJam(7);
    }
}