import java.util.Random;

public class People {

    protected String name = "no name";
    protected String food = "no food";

    public People(String name) {
        Random rand = new Random();

        this.name = name;

        int g = rand.nextInt(4);

        if (g == 0) {
            food = "carrot";
        }
        if (g == 1) {
            food = "potato";
        }
        if (g == 2) {
            food = "popcorn";
        }
        if (g == 3) {
            food = "corn";
        }
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void move(String animalname) {
        System.out.println("I walked near" + name);
    }

    public void feed(String animalname) {
        System.out.println("I gave " + food + " to " + animalname);
    };
}