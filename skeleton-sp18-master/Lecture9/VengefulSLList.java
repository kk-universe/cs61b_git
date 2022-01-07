public class VengefulSLList<Blorp> extends SLList<Blorp> {
    private SLList<Blorp> deletedItems;

    public VengefulSLList(Blorp x) {
        super(x);
        deletedItems = new SLList<Blorp>();
    }

    public VengefulSLList() {
        deletedItems = new SLList<>();
    }

    /* prints deleted items */
    public void printLostItems() {
        deletedItems.print();
    }


    @Override
    public Blorp removeLast() {
       Blorp x = super.removeLast();
       deletedItems.addLast(x);
       return x;
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<Integer>();
        /* create SLList : [10,11,12,13] */
        vs1.addLast(10);
        vs1.addLast(11);
        vs1.addLast(12);
        vs1.addLast(13);

        vs1.removeLast();
        vs1.removeLast();

        /* should be: [13,10,11,12] */
        System.out.println("the fallen are:");
        vs1.printLostItems();
    }
}
