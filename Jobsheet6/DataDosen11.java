class DataDosen11 {
    Dosen11[] dataDosen;
    int jumlahData = 0;
    public DataDosen11(int kapasitas) {
        dataDosen = new Dosen11[kapasitas]; }
    public void tambah(Dosen11 dsn) {
        if (jumlahData < dataDosen.length) {
            dataDosen[jumlahData] = dsn;
            jumlahData++;
        } else {
            System.out.println("Data sudah penuh."); }
    }
    public void tampil() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data dosen.");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                dataDosen[i].tampil(); }
        }
    }
    public void cariNama(String nama) {
        int count = 0;
        for (int i = 0; i < jumlahData; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Dosen dengan nama " + nama + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama " + nama);
        }
    }
    public void cariUsia(int usia) {
        int left = 0, right = jumlahData - 1;
        int count = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                int i = mid;
                while (i >= 0 && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    count++;
                    i--;
                }
                i = mid + 1;
                while (i < jumlahData && dataDosen[i].usia == usia) {
                    dataDosen[i].tampil();
                    count++;
                    i++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (count == 0) {
            System.out.println("Dosen dengan usia " + usia + " tidak ditemukan.");
        } else if (count > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usia);
        }
    }
}