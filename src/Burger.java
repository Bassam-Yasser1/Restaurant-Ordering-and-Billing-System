

public interface Burger extends MenuItem{}
class MiniBurger implements Burger {
    @Override
    public String getName() { return "MiniBurger"; }
    @Override
    public double getPrice() { return 60; }
    @Override
    public void prepare() {
        System.out.println("Preparing Mini Burger...");
    }
}
class ChickenBurger implements Burger {
    @Override
    public String getName() { return "ChickenBurger"; }
    @Override
    public double getPrice() { return 80; }
    @Override
    public void prepare() {
        System.out.println("Preparing Chicken Burger...");
    }
}
class BeefBurger implements Burger {
    @Override
    public String getName() { return "BeefBurger"; }
    @Override
    public double getPrice() { return 60; }
    @Override
    public void prepare() {
        System.out.println("Preparing Beef Burger...");
    }
}

class VegetarianBurger implements Burger {
    @Override
    public String getName() { return "VegetarianBurger"; }
    @Override
    public double getPrice() { return 60; }
    @Override
    public void prepare() {
        System.out.println("Preparing Vegetarian Burger...");
    }
}