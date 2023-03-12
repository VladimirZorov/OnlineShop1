package onlineShop.models.products.components;

public class CentralProcessingUnit extends BaseComponent{

    private static final double MULTIPLIER = 1.25;


    public CentralProcessingUnit(int generation, int id, String manufacturer, String model, double price, double overallPerformance) {
        super(generation, id, manufacturer, model, price, MULTIPLIER*overallPerformance);
    }
}
