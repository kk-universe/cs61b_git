public class Dog extends Animal{
    private String name;

    public Dog(String x) {
        super(x);
    }

    @Override
    public void bark() {
        System.out.println("this is a Dog, It's name is" + this.name);
    }

}
