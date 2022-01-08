import java.util.Comparator;


public class Dog implements Comparable<Dog>{
    private int weight;
    private String name;

    public Dog(String n, int s) {
        this.weight = s;
        this.name = n;
    }


    private static class NameComparator implements Comparator<Dog> {
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public int compareTo(Dog o) {
        return this.weight - o.weight;
    }

    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }

    public void bark() {
        System.out.println(name + " says: bark");
    }




}
