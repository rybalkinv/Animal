public class Parrot extends Animal {
    public Parrot(String name, String color) {
        super(name, color,4);
    }

    public Parrot(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Вася хорощий!");
    }

    @Override
    public void toGo() {}

    @Override
    public void swim() {}
}