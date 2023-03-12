package onlineShop.models.products.components;

public class PowerSupply extends BaseComponent{

    private static final double MULTIPLIER = 1.05;

    public PowerSupply(int generation, int id, String manufacturer, String model, double price, double overallPerformance) {
        super(generation, id, manufacturer, model, price, MULTIPLIER*overallPerformance);
    }
}
