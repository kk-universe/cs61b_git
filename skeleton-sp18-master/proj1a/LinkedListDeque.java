import java.util.List;

public class LinkedListDeque<T> {
    private class ListNode {
        private T item;
        private ListNode prev;
        private ListNode next;

        private ListNode(T i, ListNode p, ListNode n) {
            this.item = i;
            this.prev = p;
            this.next = n;
        }
    }

    private int size;
    private ListNode sentinel;


    //the front node is "null"
    public LinkedListDeque() {
        sentinel = new ListNode(null,null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    /*
    add an item to the front of the linked list
     */
    public void addFirst(T x){
        size += 1;
        ListNode temp = new ListNode(x, sentinel, sentinel.next);
        sentinel.next.prev = temp;
        sentinel.next = temp;
    }
    /*
    add an item to the end of the linked list
     */
    public void addLast(T x) {
        size += 1;
        ListNode temp = new ListNode(x, sentinel.prev, sentinel);
        sentinel.prev.next = temp;
        sentinel.prev = temp;
    }

    public T removeFirst() {
        size = (size == 0) ? 0 : size - 1;
        ListNode temp = sentinel.next;
        temp.next.prev = sentinel;
        sentinel.next = temp.next;
        return  temp.item;
    }

    public T removeLast() {
        size = (size == 0) ? 0 : size -1;
        ListNode temp = sentinel.prev;
        sentinel.prev = temp.prev;
        temp.prev.next = sentinel;
        return  temp.item;
    }

    public T get(int index) {
        if(index >= size) {
            return null;
        }
        ListNode pointer = sentinel.next;
        while (index > 0) {
            pointer = pointer.next;
            index -= 1;
        }
        return  pointer.item;

    }

    public T getRecursive(int index) {
        if (index >= size) {
            return null;
        }
        if (index == 0) {
            return sentinel.next.item;
        }
        return getRecursive(index - 1);
    }

    public void printDeque() {
        int index = size - 1;
        while (index >= 0) {
            System.out.print(this.get(index));
            System.out.print(' ');
        }
    }


    public LinkedListDeque(LinkedListDeque other) {
        sentinel = new ListNode(null,null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;

        for (int i = 0; i < other.size(); i++ ){
            addLast((T)other.get(i));
        }
    }

}
