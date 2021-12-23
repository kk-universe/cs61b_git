public class SLList {
    private IntNode first;
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    //add an item to the front of the list
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }
    /*
    retrieves the front item from the list
     */

    public int getFirst() {
        return first.item;
    }


}
