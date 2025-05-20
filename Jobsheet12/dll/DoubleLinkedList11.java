package dll;

public class DoubleLinkedList11 {
    Node11 head;
    Node11 tail;

    public DoubleLinkedList11() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa11 data) {
    Node11 newNode = new Node11(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        }
    }

    public void addLast(Mahasiswa11 data) {
        Node11 newNode = new Node11(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa11 data) {
        Node11 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node11 newNode = new Node11(data);

        // Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
        return;
        }
        Node11 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa11 data = head.data; // simpan data yang akan dihapus
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        data.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa menghapus.");
            return;
        }
        Mahasiswa11 data = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        data.tampil();
    }

    public Node11 search(String nim) {
        Node11 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(Mahasiswa11 data, int index) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node11 current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null) {
            addLast(data);
        } else {
            Node11 newNode = new Node11(data);
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }
            current.next = newNode;
        }
    }

    public void removeAfter(String keyNim) {
        Node11 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah NIM " + keyNim + " tidak ditemukan atau tidak ada.");
            return;
        }
        Node11 toDelete = current.next;
        current.next = toDelete.next;
        if (toDelete.next != null) {
            toDelete.next.prev = current;
        } else {
            tail = current;
        }
        System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus:");
        toDelete.data.tampil();
    }

    public void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node11 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }
        Mahasiswa11 data = current.data;
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            System.out.println("Data pada indeks " + index + " berhasil dihapus:");
            data.tampil();
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        System.out.println("Data pada head:");
        head.data.tampil();
    }
    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        System.out.println("Data pada tail:");
        tail.data.tampil();
    }
    public void getIndex(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak boleh negatif.");
            return;
        }
        Node11 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Data pada indeks " + index + " tidak ditemukan.");
        } else {
            System.out.println("Data pada indeks " + index + ":");
            current.data.tampil();
        }
    }

    public int size() {
        int count = 0;
        Node11 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
