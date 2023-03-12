package onlineShop.models.products.components;

public class SolidStateDrive extends BaseComponent{

    private static final double MULTIPLIER = 1.20;

    public SolidStateDrive(int generation, int id, String manufacturer, String model, double price, double overallPerformance) {
        super(generation, id, manufacturer, model, price, MULTIPLIER*overallPerformance);
    }
}
