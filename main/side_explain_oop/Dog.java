package side_explain_oop;

public class Dog extends  Animal{
    // Attributes
  String barkLevel;
  String dogBreed;


  public Dog(String name, String type, boolean isFlying, String barkLevel, String dogBreed) {
    super(name, type, isFlying);
    this.barkLevel = barkLevel;
    this.dogBreed = dogBreed;
  }
}
