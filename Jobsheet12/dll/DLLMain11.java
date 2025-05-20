package dll;

import java.util.Scanner;

public class DLLMain11 {
    public static void main(String[] args) {
        DoubleLinkedList11 list = new DoubleLinkedList11();
        Scanner scan11 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Sisipkan data setelah NIM tertentu");
            System.out.println("8. Tambah data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan11.nextInt();
            scan11.nextLine();
        switch (pilihan) {
            case 1 -> {
                Mahasiswa11 mhs = Mahasiswa11.inputMahasiswa(scan11);
                list.addFirst(mhs);
            }
            case 2 -> {
                Mahasiswa11 mhs = Mahasiswa11.inputMahasiswa(scan11);
                list.addLast(mhs);
            }
            case 3 -> list.removeFirst();
            case 4 -> list.removeLast();
            case 5 -> list.print();
            case 6 -> {
                System.out.print("Masukkan NIM yang dicari: ");
                String nim = scan11.nextLine();
                Node11 found = list.search(nim);
                if (found != null) {
                    System.out.println("Data ditemukan: ");
                    found.data.tampil();
                } else {
                    System.out.println("Data tidak ditemukan.");
                }
            }
            case 7 -> {
                System.out.print("Masukkan NIM setelah data baru disisipkan: ");
                String nimKey = scan11.nextLine();
                Mahasiswa11 mhs = Mahasiswa11.inputMahasiswa(scan11);
                list.insertAfter(nimKey, mhs);
            }
            case 8 -> {
                Mahasiswa11 mhs = Mahasiswa11.inputMahasiswa(scan11);
                System.out.print("Masukkan indeks untuk menyisipkan data: ");
                int index = scan11.nextInt(); scan11.nextLine();
                list.add(mhs, index);
            }
            case 9 -> {
                System.out.print("Masukkan NIM sebagai acuan penghapusan data setelahnya: ");
                String keyNim = scan11.nextLine();
                list.removeAfter(keyNim);
            }
            case 10 -> {
                System.out.print("Masukkan indeks data yang ingin dihapus: ");
                int index = scan11.nextInt(); scan11.nextLine();
                list.remove(index);
            }
            case 11 -> list.getFirst();
            case 12 -> list.getLast();
            case 13 -> {
                System.out.print("Masukkan indeks yang ingin ditampilkan: ");
                int index = scan11.nextInt(); scan11.nextLine();
                list.getIndex(index);
            }
            case 14 -> {
                System.out.println("Jumlah data dalam linked list: " + list.size());
            }
            case 0 -> System.out.println("Keluar dari program.");
            default -> System.out.println("Pilihan tidak valid!"); 
            }
        } while (pilihan != 0); {
        scan11.close();
        }
    }
}
