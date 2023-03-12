package onlineShop.models.products.components;

public class VideoCard extends BaseComponent{

    private static final double MULTIPLIER = 1.15;

    public VideoCard(int generation, int id, String manufacturer, String model, double price, double overallPerformance) {
        super(generation, id, manufacturer, model, price, MULTIPLIER*overallPerformance);
    }
}
