public class Monkey extends Animal{
    private String name;
    public Monkey(String x) {
        super(x);
    }

    @Override
    public void bark() {
        System.out.println("this is a Monkey!, It's name is" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
