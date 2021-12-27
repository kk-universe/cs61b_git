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

    public Item getLast() {
        return items[size - 1];
    }

    public Item get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public Item removeLast() {
        Item x = getLast();
        size = size - 1;
        return x;
    }
}