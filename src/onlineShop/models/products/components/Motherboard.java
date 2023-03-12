package onlineShop.models.products.components;

public class Motherboard extends BaseComponent{

    private static final double MULTIPLIER = 1.25;

    public Motherboard(int generation, int id, String manufacturer, String model, double price, double overallPerformance) {
        super(generation, id, manufacturer, model, price, MULTIPLIER*overallPerformance);
    }
}
