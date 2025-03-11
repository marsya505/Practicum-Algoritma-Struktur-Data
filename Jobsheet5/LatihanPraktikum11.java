class Mahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;
    public Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
}

public class LatihanPraktikum11 {
    public static int maxUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int maxL = maxUTS(mhs, l, mid);
        int maxR = maxUTS(mhs, mid + 1, r);
        return Math.max(maxL, maxR);
    }

    public static int minUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int minL = minUTS(mhs, l, mid);
        int minR = minUTS(mhs, mid + 1, r);
        return Math.min(minL, minR);
    }

    public static double rataUAS(Mahasiswa[] mhs) {
        int total = 0;
        for (Mahasiswa mahasiswa : mhs) {
            total += mahasiswa.nilaiUAS;
        }
        return (double) total / mhs.length;
    }
        public static void main(String[] args) {
            Mahasiswa[] mahasiswa = {
                new Mahasiswa("Ahmad", "220101001", 2022, 78, 82),
                new Mahasiswa("Budi", "220101002", 2022, 85, 88),
                new Mahasiswa("Cindy", "220101003", 2021, 90, 87),
                new Mahasiswa("Dian", "220101004", 2021, 76, 79),
                new Mahasiswa("Eko", "220101005", 2023, 92, 95),
                new Mahasiswa("Fajar", "220101006", 2022, 88, 85),
                new Mahasiswa("Gina", "220101007", 2023, 80, 83),
                new Mahasiswa("Hadi", "220101008", 2020, 82, 84)
            };
            int maxUTS = maxUTS(mahasiswa, 0, mahasiswa.length - 1);
            int minUTS = minUTS(mahasiswa, 0, mahasiswa.length - 1);
            double rataUAS = rataUAS(mahasiswa);
    
            System.out.println("Nilai UTS tertinggi: " + maxUTS);
            System.out.println("Nilai UTS terendah: " + minUTS);
            System.out.println("Rata-rata nilai UAS: " + rataUAS);
        }
    }    
