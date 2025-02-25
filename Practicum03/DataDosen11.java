public class DataDosen11 {
    public static void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("-------Data Semua Dosen-------");
        int nomor = 1;
        for (Dosen11 dosen : arrayOfDosen) {
            dosen.cetakInfo(nomor++);
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Jumlah Dosen Berdasarkan Jenis Kelamin");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                countPria++;
            } else {
                totalWanita += dosen.usia;
                countWanita++;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Rata-Rata Usia Dosen Berdasarkan Jenis Kelamin");
        System.out.println("Pria   : " + (countPria > 0 ? (double) totalPria / countPria : 0) + " tahun");
        System.out.println("Wanita : " + (countWanita > 0 ? (double) totalWanita / countWanita : 0) + " tahun");
    }
    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        Dosen11 tertua = arrayOfDosen[0];
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Dosen Paling Tua");
        tertua.cetakInfo(1);
    }
    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        Dosen11 termuda = arrayOfDosen[0];
        for (Dosen11 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda");
        termuda.cetakInfo(1);
    }
}
