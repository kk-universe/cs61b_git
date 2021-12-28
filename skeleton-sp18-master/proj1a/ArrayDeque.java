import java.lang.reflect.Array;

public class ArrayDeque<Item> {
    private Item[] items;
    private int size = 0;
    private int contain = 8;
    private double usage = 0.25;

    public ArrayDeque() {
        items  = (Item[]) new Object[contain];
    }

    public int size() {
        return size;
    }

    public void addFirst(Item x) {

    }

    public void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }

    public Item add(Item x) {
        if (size == items.length) {
            this.resize(size * 2);
        }
        items[size + 1] = x;
        size += 1;
        return items[size - 1];
    }

    /** add an element to the first position of the array*/
    public void addLast(Item x) {

    }

    public Item remove(in   t i) {
        if (i > size - 1) {
            return null;
        }
        Item temp = items[i];
        items[size - 1] = null;
        size -= 1;
        return temp;
    }

    public Item get(int index) {

    }



}
