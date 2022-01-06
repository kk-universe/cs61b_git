public interface List61B<Blorp> {
    public void addLast(Blorp x);
    public Blorp get(int i);
    public Blorp getLast();
    public int size();
    public Blorp removeLast();
    public void insert(Blorp x, int position);
    public void addFirst(Blorp x);
    public Blorp getFirst();
    default public void print() {
        for (int i = 0; i < size(); i += 1) {
            System.out.println(get(i) + " ");
        }
        System.out.println();
    }

}
