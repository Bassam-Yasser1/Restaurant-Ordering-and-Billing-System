public class VegetarianMenuFactory extends  AbstractMenuFactory {
    @Override
    public ItalianPizza createItalianPizza(String type) {
        switch (type) {
            case "Margherita":
                return new Margherita();
            case "FourCheese":
                return new FourCheese();
            default:
                throw new IllegalArgumentException("Unknown Italian Pizza type: " + type);
        }
    }
    @Override
    public EasternPizza createEasternPizza(String type) {
        switch (type) {
            case "Vegetables":
                return new Vegetables();
            case "Cheese":
                return new Cheese();
            default:
                throw new IllegalArgumentException("Unknown Eastern Pizza type: " + type);
        }
    }
    @Override
    public Burger createBurger(String type) {
        if ("VegetarianBurger".equals(type)) {
            return new VegetarianBurger();
        } else {
            throw new IllegalArgumentException("Unknown Burger type: " + type);
        }
    }    
}
