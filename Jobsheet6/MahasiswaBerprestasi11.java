public class MahasiswaBerprestasi11 {
    Mahasiswa11 [] listMhs = new Mahasiswa11[5];
    int idx;
    void tambah (Mahasiswa11 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil() {
        for (Mahasiswa11 m:listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }
    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK :" + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos) {
        if  (pos!= -1) {
            System.out.println("nim\t : " + listMhs[pos].nim);
            System.out.println("nama\t : " + listMhs[pos].nama);
            System.out.println("kelas\t : " + listMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right, boolean descending) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            } 
            if (descending) {
                if (listMhs[mid].ipk < cari) {
                    return findBinarySearch(cari, left, mid - 1, true);
                } else {
                    return findBinarySearch(cari, mid + 1, right, true);
                }
            } else {
                if (listMhs[mid].ipk > cari) {
                    return findBinarySearch(cari, left, mid - 1, false);
                } else {
                    return findBinarySearch(cari, mid + 1, right, false);
                }
            }
        }
        return -1;
    }    
}
