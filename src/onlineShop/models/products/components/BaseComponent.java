package onlineShop.models.products.components;

public abstract class BaseComponent implements Component{

    private int generation;
    private int id;
    private String manufacturer;
    private String model;
    private double price;
    private double overallPerformance;

    public BaseComponent(int generation, int id, String manufacturer, String model, double price, double overallPerformance) {
        this.generation = generation;
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
        this.overallPerformance = overallPerformance;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getManufacturer() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getOverallPerformance() {
        return 0;
    }

    @Override
    public int getGeneration() {
        return 0;
    }
}
