package onlineShop.models.products.computers;

import onlineShop.models.products.components.Component;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseComputer implements Computer{

    private List<Component> components;
    private List<Peripheral> peripherals;

    public BaseComputer(int id, String manufacturer, String model, double price, double overallPerformance) {
        this.components = new ArrayList<>();
        this.peripherals = new ArrayList<>();
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
    public List<Component> getComponents() {
        return Collections.unmodifiableList(components);
    }

    @Override
    public List<Peripheral> getPeripherals() {
        return Collections.unmodifiableList(peripherals);
    }

    @Override
    public void addComponent(Component component) {

    }

    @Override
    public Component removeComponent(String componentType) {
        return null;
    }

    @Override
    public void addPeripheral(Peripheral peripheral) {

    }

    @Override
    public Peripheral removePeripheral(String peripheralType) {
        return null;
    }

    @Override
    public String toString() {
        return "BaseComputer{" +
                "components=" + components +
                ", peripherals=" + peripherals +
                '}';
    }
}
