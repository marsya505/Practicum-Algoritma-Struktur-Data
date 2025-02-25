public class Dosen11 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int usia;

    public Dosen11(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void cetakInfo(int nomor) {
        System.out.println("Data Dosen ke-" + nomor);
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("------------------------------");
    }
}
