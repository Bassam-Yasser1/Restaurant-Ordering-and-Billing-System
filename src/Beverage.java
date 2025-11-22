

public interface Beverage extends MenuItem{}
class Pepsi implements Beverage {
    @Override
    public String getName() { return "Pepsi"; }
    @Override
    public double getPrice() { return 10; }
    @Override
    public void prepare() {
        System.out.println("Preparing Pepsi...");
    }
}
class Sprite implements Beverage {
    @Override
    public String getName() { return "Sprite"; }
    @Override
    public double getPrice() { return 10; }
    @Override
    public void prepare() {
        System.out.println("Preparing Sprite...");
    }
}
class Fanta implements Beverage {
    @Override
    public String getName() { return "Fanta"; }
    @Override
    public double getPrice() { return 10; }
    @Override
    public void prepare() {
        System.out.println("Preparing Fanta...");
    }
}

