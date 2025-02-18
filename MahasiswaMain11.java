public class MahasiswaMain11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public MahasiswaMain11() {}

    public MahasiswaMain11(String nama, String nim, double ipk, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    public static void main(String[] args) {
        MahasiswaMain11 mhs1 = new MahasiswaMain11();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        MahasiswaMain11 mhs2 = new MahasiswaMain11("Annisa Nabila","2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        MahasiswaMain11 mhs = new MahasiswaMain11("Marsya Zulfa Zahrani","244107060005", 3.87, "SIB 1G");
        mhs.tampilkanInformasi();

    }
}S