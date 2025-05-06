public class AntrianKRS11 {
    Mahasiswa11[] data;
    int front, rear, size, max;
    int totalDilayani;
    public AntrianKRS11(int max) {
        this.max = max;
        data = new Mahasiswa11[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDilayani = 0;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahAntrian(Mahasiswa11 m) {
        if (IsFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambah.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " berhasil masuk ke antrian.");
    }
    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk diproses KRS.");
            return;
        }
        System.out.println("Memproses KRS untuk 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa11 m = data[front];
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalDilayani++;
        }
    }
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian Mahasiswa:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void tampilkanTerdepan() {
        if (size < 2) {
            System.out.println("Tidak ada 2 mahasiswa terdepan.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }
    public void tampilkanTerakhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa terakhir:");
        data[rear].tampilkanData();
    }
    public void jumlahAntrian() {
        System.out.println("Jumlah dalam antrian: " + size);
    }
    public void jumlahDilayani() {
        System.out.println("Jumlah yang sudah KRS: " + totalDilayani);
    }
    public void jumlahBelumKRS(int totalTarget) {
        System.out.println("Jumlah belum KRS (target " + totalTarget + "): " + (totalTarget - totalDilayani));
    }
}
