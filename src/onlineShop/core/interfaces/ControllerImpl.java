package onlineShop.core.interfaces;

import onlineShop.models.products.computers.Computer;
import onlineShop.models.products.computers.DesktopComputer;
import onlineShop.models.products.computers.Laptop;

import java.util.ArrayList;
import java.util.Collection;

import static onlineShop.common.constants.ExceptionMessages.*;
import static onlineShop.common.constants.OutputMessages.*;

public class ControllerImpl implements Controller{

    private Collection<Computer> computers;

    public ControllerImpl() {
        this.computers = new ArrayList<>();
    }

    @Override
    public String addComputer(String computerType, int id, String manufacturer, String model, double price) {
        Computer computer;
        if (computerType.equals("Laptop")) {
            computer = new Laptop(id, manufacturer, model, price);
        } else if (computerType.equals("DesctopComputer")) {
            computer = new DesktopComputer(id, manufacturer,model, price);
        } else {
            throw new IllegalArgumentException(INVALID_COMPUTER_TYPE);
        }

        for (Computer computer1 : computers) {
            if (computer1.getId() == id) {
                throw new IllegalArgumentException(EXISTING_COMPUTER_ID);
            }
        }

        computers.add(computer);
        return String.format(ADDED_COMPUTER);
    }

    @Override
    public String addPeripheral(int computerId, int id, String peripheralType, String manufacturer, String model, double price, double overallPerformance, String connectionType) {
        return null;
    }

    @Override
    public String removePeripheral(String peripheralType, int computerId) {
        return null;
    }

    @Override
    public String addComponent(int computerId, int id, String componentType, String manufacturer, String model, double price, double overallPerformance, int generation) {
        return null;
    }

    @Override
    public String removeComponent(String componentType, int computerId) {
        return null;
    }

    @Override
    public String buyComputer(int id) {
        return null;
    }

    @Override
    public String BuyBestComputer(double budget) {
        return null;
    }

    @Override
    public String getComputerData(int id) {
        return null;
    }
}
