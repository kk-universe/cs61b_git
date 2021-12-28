public class LinkedListLauncher {
    public static void main(String[] args) {
        LinkedListDeque<String> deque = new LinkedListDeque<>();
        deque.addFirst("hello");
        deque.addFirst("World");
        deque.addLast("!!");
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.removeLast());
        System.out.println(deque.isEmpty());
        System.out.println(deque.getRecursive(0));
    }
}
