public class StackSurat11 {
    Surat11[] stack;
    int top;
    int size;

    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat11 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh, surat tidak bisa ditambahkan.");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat yang dapat diproses.");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }
    
    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}
