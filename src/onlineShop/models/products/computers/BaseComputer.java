package onlineShop.models.products.computers;

import onlineShop.models.products.components.Component;
import onlineShop.models.products.peripherals.Peripheral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static onlineShop.common.constants.ExceptionMessages.*;

public abstract class BaseComputer implements Computer {

    private int id;
    private String manufacturer;
    private String model;
    private double price;
    private double overallPerformance;
    private List<Component> components;
    private List<Peripheral> peripherals;

    public BaseComputer(int id, String manufacturer, String model, double price, double overallPerformance) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
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

        return 0;
    }

    @Override
    public double getOverallPerformance() {
        double averOvPerf = 0;
        double totalOvPerf = 0;
        if (components.size() == 0) {
            totalOvPerf = getOverallPerformance();
        } else {
            for (Component component : components) {
                averOvPerf += component.getOverallPerformance();
            }
            averOvPerf = getOverallPerformance() + averOvPerf;
        }

        return totalOvPerf;
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
        if (components.contains(component)) {
            throw new IllegalArgumentException(String.format(EXISTING_COMPONENT,
                    component.getClass().getSimpleName(), this.model, this.id));
        }
        components.add(component);
    }

    @Override
    public Component removeComponent(String componentType) {
        Component componentForRemove = null;
        if (components.size() == 0) {
            throw new IllegalArgumentException(String.format(NOT_EXISTING_COMPONENT, componentType));
        }
        for (Component component : components) {
            if (component.getClass().getSimpleName().equals(componentType)) {
                componentForRemove = component;
            } else {
                throw new IllegalArgumentException(String.format(NOT_EXISTING_COMPONENT));
            }
        }
        components.remove(componentForRemove);
        return componentForRemove;
    }

    @Override
    public void addPeripheral(Peripheral peripheral) {
        if (peripherals.contains(peripheral)) {
            throw new IllegalArgumentException(String.format(EXISTING_PERIPHERAL, peripheral.getClass().getSimpleName(),
                    model, id));
        }
        peripherals.add(peripheral);
    }

    @Override
    public Peripheral removePeripheral(String peripheralType) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Overall Performance: %.2f. Price: %.2f - %s: %s %s (Id: %d)", getOverallPerformance(),
                        getPrice(), getClass().getSimpleName(), getManufacturer(), getModel(), getId()))
                .append(System.lineSeparator());
        sb.append(String.format(" Components (%d):", components.size())).append(System.lineSeparator());
        for (Component component : components) {
            sb.append("  " + component.toString()).append(System.lineSeparator());
        }
        sb.append(String.format(" Peripherals (%d); Average Overall Performance (%.2f):", peripherals.size(), getOverallPerformance())).append(System.lineSeparator());
        for (Peripheral peripheral : peripherals) {
            sb.append("  " + peripheral.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
