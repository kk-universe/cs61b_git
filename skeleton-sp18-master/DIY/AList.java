import java.sql.SQLSyntaxErrorException;

public class AList {

    private int[] items;
    private int size;

    public AList() {
        items = new int[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity*/
    public void resize(int capacity) {
            int[] a = new int[capacity];
            System.arraycopy(items, 0, a, 0, size);
            items  = a;
    }

    /** Insert x into the back of the list*/
    public void addLast(int x) {
        if (size == items.length) {
            this.resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    public int getLast() {
        return items[size - 1];
    }

    public int get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public int removeLast() {
        int x = getLast();
        size = size - 1;
        return x;
    }
}