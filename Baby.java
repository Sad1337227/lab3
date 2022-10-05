public class Baby extends Animal {

    public Baby(String name, String type) {
        super(name, type);
    }

    @Override
    public void speak() {
        System.out.println(" I am a " + this.type + ".. " + this.name);
    }

    @Override
    public void move() {
        System.out.println(" I can run faster");
    }

    public void sound() {
        System.out.printf("Brg" + "\n");
    }

    public double getCatAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public enum Animal {
        Arvicolinae,
        Cat,
        Cow,
    }
}