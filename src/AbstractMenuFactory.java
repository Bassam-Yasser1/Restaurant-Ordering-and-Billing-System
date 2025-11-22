public abstract class AbstractMenuFactory {
    abstract ItalianPizza createItalianPizza(String type);
    abstract EasternPizza createEasternPizza(String type);
    abstract Burger createBurger(String type);
    public Beverage createBeverage(String type) {
        switch (type) {
            case "Pepsi":
                return new Pepsi();
            case "Sprite":
                return new Sprite();
            case "Fanta":
                return new Fanta();
            default:
                throw new IllegalArgumentException("Unknown Beverage type: " + type);
        }
    }
}