package side_explain_oop;

public class Cat extends Animal {
  // Attributes
  String meowingLevel;
  String origins;

  public Cat(String name, String type, boolean isFlying, String meowingLevel,
      String origins) {
    super(name, type, isFlying);
    this.meowingLevel = meowingLevel;
    this.origins = origins;
  }
}
