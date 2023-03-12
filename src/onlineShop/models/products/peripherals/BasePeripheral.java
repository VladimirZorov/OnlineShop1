package onlineShop.models.products.peripherals;

public abstract class BasePeripheral implements Peripheral{

    private String connectionType;

    public BasePeripheral(int id, String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public int getId() {
        return this.getId();
    }

    @Override
    public String getManufacturer() {
        return this.getManufacturer();
    }

    @Override
    public String getModel() {
        return this.getModel();
    }

    @Override
    public double getPrice() {
        return this.getPrice();
    }

    @Override
    public double getOverallPerformance() {
        return this.getOverallPerformance();
    }

    @Override
    public String getConnectionType() {
        return this.connectionType;
    }

    @Override
    public String toString() {
        return String.format("Overall Performance: %.2f. Price: %.2f - %s: %s %s (Id: %d) Connection Type: %s",
                getOverallPerformance(), getPrice(), getClass().getSimpleName()
        ,getManufacturer(), getModel(), getId(), connectionType);
    }
}
