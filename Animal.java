import java.util.Random;

public abstract class Animal {

  protected String name = "no name";
  protected AnimalGender gender;
  protected FightAttrib fightAttrib;
  protected String type;
  protected int foodline;

  public Animal(String name, String type) {
    Random rand = new Random();

    this.name = name;
    this.type = type;
    int g = rand.nextInt(100);
    int i = rand.nextInt(100);
    this.gender = (g % 2 == 0 ? AnimalGender.FEMALE : AnimalGender.MALE);
    this.foodline = i;

    fightAttrib = new FightAttrib();

    fightAttrib.size = rand.nextInt(3);
    fightAttrib.strength = rand.nextInt(3);
  }

  public abstract void speak();

  public abstract void sound();

  public abstract void move();

  public String getName() {
    return name;
  }

  public AnimalGender getGender() {
    return gender;
  }

  public void setGender(AnimalGender gender) {
    this.gender = gender;
  }

  public FightAttrib getFightAttributes() {
    return fightAttrib;
  }
}
