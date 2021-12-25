public class SLList<T> {
    private class StuffNode {
        private T item;
        private StuffNode next;
        public StuffNode(T i, StuffNode n) {
            item = i;
            next = n;
        }
    }

    private StuffNode first;
    private int size;


    public SLList(T x) {
        size = 0;
        first = new StuffNode(x, null);
    }


    //add an item to the front of the list
    public void addFirst(T x) {
        first = new StuffNode(x, first);
        size += 1;
    }

    /*retrieves the front item from the list*/
    public T getFirst() {
        return first.item;
    }

    //adds an item to the end of the list
    public void addLast(T x){
        StuffNode p = first;
       //move p until it reaches the end of the list
        while (p != null){
            p = p.next;
        }

        size += 1;

    }

    //returns the size of the list starting at IntNode p
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(20);
        System.out.println(L.size());
    }


}
