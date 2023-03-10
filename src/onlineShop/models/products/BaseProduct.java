package onlineShop.models.products;

public abstract class BaseProduct implements Product{

    private int id;
    private String manufacturer;
    private String model;
    private double price;
    private double overallPerformance;



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
}
