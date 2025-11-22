

public interface ItalianPizza extends MenuItem{}
class Margherita implements ItalianPizza {
    @Override
    public String getName() { return "Margherita"; }
    @Override
    public double getPrice() { return 120; }
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza...");
    }
}

class MiniItalianPizza implements ItalianPizza {
    @Override
    public String getName() { return "MiniItalianPizza"; }
    @Override
    public double getPrice() { return 80; }
    @Override
    public void prepare() {
        System.out.println("Preparing Mini italian Pizza...");
    }
}

class FourCheese implements ItalianPizza {
    @Override
    public String getName() { return "FourCheese"; }
    @Override
    public double getPrice() { return 130; }
    @Override
    public void prepare() {
        System.out.println("Preparing FourCheese Pizza...");
    }
}

class ChickenBBQ implements ItalianPizza {
    @Override
    public String getName() { return "ChickenBBQ"; }
    @Override
    public double getPrice() { return 150; }
    @Override
    public void prepare() {
        System.out.println("Preparing ChickenBBQ Pizza...");
    }
}
class ChickenRanch implements ItalianPizza {
    @Override
    public String getName() { return "ChickenRanch"; }
    @Override
    public double getPrice() { return 150; }
    @Override
    public void prepare() {
        System.out.println("Preparing ChickenRanch Pizza...");
    }
}
class Pepperoni implements ItalianPizza {
    @Override
    public String getName() { return "PepperoniPizza"; }
    @Override
    public double getPrice() { return 120; }
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza...");
    }
}