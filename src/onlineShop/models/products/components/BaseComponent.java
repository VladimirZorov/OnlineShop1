package onlineShop.models.products.components;

public abstract class BaseComponent implements Component{

    private int generation;

    public BaseComponent(int generation, int id, String manufacturer,
                         String model, double price, double overallPerformance) {
        this.generation = generation;

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
    public int getGeneration() {
        return this.generation;
    }

    @Override
    public String toString() {
        return String.format("Overall Performance: %.2f. Price: %.2f - %s: %s {model} (Id: %d) Generation: %d",
                this.getOverallPerformance(), this.getPrice(), getClass().getSimpleName(),
                this.getManufacturer(), this.getModel(), this.getId(), this.generation);
    }
}
