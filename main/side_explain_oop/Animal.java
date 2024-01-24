package side_explain_oop;

public class Animal {
  // Attributes
  String name;
  String type;
  boolean isFlying;

  public Animal(String name, String type, boolean isFlying) {
    this.name = name;
    this.type = type;
    this.isFlying = isFlying;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isFlying() {
    return isFlying;
  }

  public void setFlying(boolean flying) {
    isFlying = flying;
  }
}
