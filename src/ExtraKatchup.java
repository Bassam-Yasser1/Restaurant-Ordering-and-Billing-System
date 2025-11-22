public class ExtraKatchup extends CondimentDecorator {
    public ExtraKatchup(MenuItem item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Extra Katchup";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 10; // Extra Katchup costs 10 
    }

    @Override
    public void prepare() {
        item.prepare();
        System.out.println("Adding Extra Katchup...");
    }
}