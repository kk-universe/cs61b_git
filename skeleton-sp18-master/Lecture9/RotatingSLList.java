public class RotatingSLList<Blorp> extends SLList<Blorp> {


    public void rotateRight() {
        Blorp x = removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rs1 = new RotatingSLList<>();
        /* create SLList : [10,11,12,13] */
        rs1.addLast(10);
        rs1.addLast(11);
        rs1.addLast(12);
        rs1.addLast(13);

        /* should be: [13,10,11,12] */
        rs1.rotateRight();
        rs1.print();
    }
}
