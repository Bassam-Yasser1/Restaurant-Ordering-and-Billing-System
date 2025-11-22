public abstract class CondimentDecorator implements MenuItem {
    protected MenuItem item;

    public CondimentDecorator(MenuItem item) {
        this.item = item;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();

    @Override
    public void prepare() {
        item.prepare();
        System.out.println("Adding condiment: " + getName());
    }
    
}
