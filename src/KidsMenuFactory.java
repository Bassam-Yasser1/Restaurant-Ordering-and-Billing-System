public class KidsMenuFactory extends AbstractMenuFactory    {
    @Override
    public ItalianPizza createItalianPizza(String type) {
        if ("MiniItalianPizza".equals(type)) {
            return new MiniItalianPizza();
        } else {
            throw new IllegalArgumentException("Unknown Italian Pizza type: " + type);
        }
    }

    @Override
    public EasternPizza createEasternPizza(String type) {
        if ("MiniEasternPizza".equals(type)) {
            return new MiniEasternPizza();
        } else {
            throw new IllegalArgumentException("Unknown Eastern Pizza type: " + type);
        }
    }

    @Override
    public Burger createBurger(String type) {
        if ("MiniBurger".equals(type)) {
            return new MiniBurger();
        } else {
            throw new IllegalArgumentException("Unknown Burger type: " + type);
        }
    }
    
}
