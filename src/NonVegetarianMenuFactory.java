public class NonVegetarianMenuFactory extends AbstractMenuFactory {

    @Override
    public ItalianPizza createItalianPizza(String type) {
        switch (type) {
            case "ChickenBBQ" -> {
                return new ChickenBBQ();
            }
            case "ChickenRanch" -> {
                return new ChickenRanch();
            }
            case "Pepperoni" -> {
                return new Pepperoni();
            }
            default -> throw new IllegalArgumentException("Unknown Italian Pizza type: " + type);
        }
    }

    @Override
    public EasternPizza createEasternPizza(String type) {
        switch (type) {
            case "Sausage" -> {
                return new Sausage();
            }
            case "Pastrami" -> {
                return new Pastrami();
            }
            case "Beef" -> {
                return new Beef();
            }
            default -> throw new IllegalArgumentException("Unknown Eastern Pizza type: " + type);
        }
    }

    @Override
    public Burger createBurger(String type) {
        switch (type) {
            case "ChickenBurger" -> {
                return new ChickenBurger();
            }
            case "BeefBurger" -> {
                return new BeefBurger();
            }
            default -> throw new IllegalArgumentException("Unknown Burger type: " + type);
        }
    }

    @Override
    public Beverage createBeverage(String type) {
        switch (type) {
            case "Pepsi" -> {
                return new Pepsi();
            }
            case "Sprite" -> {
                return new Sprite();
            }
            case "Fanta" -> {
                return new Fanta();
            }
            default -> throw new IllegalArgumentException("Unknown Beverage type: " + type);
        }
    }
}
