

public interface EasternPizza extends MenuItem{}

class MiniEasternPizza implements EasternPizza {
    @Override
    public String getName() { return "MiniEasternPizza"; }
    @Override
    public double getPrice() { return 80; }
    @Override
    public void prepare() {
        System.out.println("Preparing Mini Eastern Pizza...");
    }
}
class Vegetables implements EasternPizza {
    @Override
    public String getName() { return "Vegetables"; }
    @Override
    public double getPrice() { return 100; }
    @Override
    public void prepare() {
        System.out.println("Preparing Vegetables Pizza...");
    }
}
class Cheese implements EasternPizza {
    @Override
    public String getName() { return "Cheese"; }
    @Override
    public double getPrice() { return 100; }
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza...");
    }
}
class Sausage implements EasternPizza {
    @Override
    public String getName() { return "Sausage"; }
    @Override
    public double getPrice() { return 120; }
    @Override
    public void prepare() {
        System.out.println("Preparing Sausage Pizza...");
    }
}
class Pastrami implements EasternPizza {
    @Override
    public String getName() { return "Pastrami"; }
    @Override
    public double getPrice() { return 100; }
    @Override
    public void prepare() {
        System.out.println("Preparing Pastrami Pizza...");
    }
}
class Beef implements EasternPizza {
    @Override
    public String getName() { return "Beef"; }
    @Override
    public double getPrice() { return 100; }
    @Override
    public void prepare() {
        System.out.println("Preparing Beef Pizza...");
    }
}