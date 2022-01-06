public class SLList<Blorp> implements List61B<Blorp> {
   public class Node {
       public Blorp item;
       public Node next;

       public Node(Blorp i, Node h) {
           item = i;
           next = h;
       }
   }

   private Node sentinel;
   private int size;

   public SLList() {
       size = 0;
       sentinel = new Node(null, null);
   }

   public SLList(Blorp x) {
       size = 1;
       sentinel = new Node(null,null);
       sentinel.next = new Node(x, null);
   }

   /** puts an item at the front of the list**/
   public void addFirst(Blorp x) {
        Node oldFrontNode = sentinel.next;
        sentinel.next = new Node(x, oldFrontNode);
        size += 1;
   }

   /** return the first item of the list**/

    public Blorp getFirst() {
       return sentinel.next.item;
    }

    /** Puts an item at teh back of the list**/
    public void addLast(Blorp x) {
       size += 1;
       Node p = sentinel;

       while (p.next != null) {
           p = p.next;
       }
       p.next = new Node(x, null);
    }

    /** returns the back node of our list**/
    public Node getLastNode() {
        Node p = sentinel;
        while(p.next != null) {
            p = p.next;
        }
        return p;
    }

    /** returns last item **/
    public Blorp getLast() {
        Node back = getLastNode();
        return back.item;
    }

    /** deletes and returns last Item**/
    public Blorp removeLast() {
        Node back = getLastNode();
        if (back == sentinel) {
            return null;
        }

        size -= 1;
        Node p = sentinel;
        while(p.next != back) {
            p = p.next;
        }
        p.next = null;
        return back.item;
    }

    public int size() {
        return size;
    }

    /** get the positionth item of the list. **/
    public Blorp get(int position) {
        if (position == 0) {
            return getFirst();
        }

        Node currentNode = sentinel.next.next;
        while (position > 1 && currentNode.next != null) {
            position -= 1;
            currentNode = currentNode.next;
        }
        return currentNode.item;
    }

    public void insert(Blorp item, int position) {
        if (sentinel.next == null || position == 0) {
            addFirst(item);
            return;
        }
        Node currentNode = sentinel.next.next;
        while(position > 1 && currentNode.next != null) {
            position -= 1;
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(item, currentNode.next);
    }

}
