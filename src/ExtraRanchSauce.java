public class ExtraRanchSauce extends CondimentDecorator {
    public ExtraRanchSauce(MenuItem item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Extra Ranch Sauce";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 10; // Extra Ranch sauce costs 10
    }

    @Override
    public void prepare() {
        item.prepare();
        System.out.println("Adding Extra Ranch Sauce...");
    }
    
}
