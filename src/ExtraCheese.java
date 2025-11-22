public class ExtraCheese extends CondimentDecorator {
    public ExtraCheese(MenuItem item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Extra Cheese";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 15; // Extra cheese costs 15
    }

    @Override
    public void prepare() {
        item.prepare();
        System.out.println("Adding Extra Cheese...");
    }
}
