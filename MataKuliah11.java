public class MataKuliah11 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah11() {}

    public MataKuliah11(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam Pertemuan: " + jumlahJam + " jam per minggu");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS setelah diubah: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah setelah ditambah: " + jumlahJam + " jam per minggu");
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah setelah dikurang: " + jumlahJam + " jam per minggu");
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan.");
        }
    }
}