import java.sql.SQLSyntaxErrorException;

public class AList<Item> {

    private Item[] items;
    private int size;

    public AList() {
        items = (Item[]) new Obejct[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity*/
    public void resize(int capacity) {
            Item[] a = (Item[]) new Object[capacity];
            System.arraycopy(items, 0, a, 0, size);
            items  = a;
    }

    /** Insert x into the back of the list*/
    public void addLast(Item x) {
        if (size == items.length) {
            this.resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    /** return the last element in the array*/
    public Item getLast() {
        return items[size - 1];
    }

    /**return the i th element from the array*/
    public Item get(int i) {
        return items[i];
    }

    /** return the size of the array*/
    public int size() {
        return size;
    }

    /**remove the last elements from the Item array*/
    public Item removeLast() {
        Item x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }
}