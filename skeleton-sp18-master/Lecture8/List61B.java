import java.util.ArrayList;

public interface List61B<Item> {
    public void addLast(Item x);
    public Item get(int i);
    public Item getLast();
    public int size();
    public Item removeLast();
    public void insert(Item x, int position);
    public void addFirst(Item x);
    public void getFirst();
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            System.out.println(get(i) + " ");
        }
        System.out.println();
    }

}
