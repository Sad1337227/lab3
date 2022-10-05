public class Koala extends Animal {

  enum Climate {
    WINTWR,
    SUMMER,
    FALL;
  }

  public Koala(String name, String type) {
    super(name, type);
  }

  public void speak() {
    System.out.printf("I'm %s. I'm an Koala!" + "\n", this.name);
  }

  public void move() {
    System.out.println("Koala movement");
  }

  public void sound() {
    System.out.printf("Yip.. Yip" + "\n");
  }

  public void sum() {
    int num1 = 5;
    int num2 = 5;
    int sum = sumOfNumbers(num1, num2);
    System.out.println("The Sum of two numbers is: " + sum);
  }

  public int sumOfNumbers(int a, int b) {
    return a + b;
  }
}
