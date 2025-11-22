public class ExtraBBQ extends CondimentDecorator {
    public ExtraBBQ(MenuItem item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Extra BBQ Sauce";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 10; // Extra BBQ sauce costs 10
    }

    @Override
    public void prepare() {
        item.prepare();
        System.out.println("Adding Extra BBQ Sauce...");
    }
}