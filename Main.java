import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some furniture items
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Chair(5));
        furnitureList.add(new Table(2, 3));
        furnitureList.add(new Sofa(2, 2));

        // Calculate shipping cost
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        for (Furniture furniture : furnitureList) {
            furniture.accept(calculator);
        }

        // Output total shipping cost
        System.out.println("----------------------------------------------------");
        System.out.println("Total shipping cost for all items: $" + calculator.getTotalCost());
    }
}