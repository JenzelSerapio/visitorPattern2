// Modified ShippingCostCalculator class
class ShippingCostCalculator implements FurnitureVisitor {
    private double totalCost = 0;

    @Override
    public void visit(Chair chair) {
        double shippingCost = 10; // Flat rate for chairs
        System.out.println("Shipping cost for chair: $" + shippingCost);
        totalCost += shippingCost;
    }

    @Override
    public void visit(Table table) {
        double shippingCost = table.getLength() * table.getWidth() * 0.05; // $0.05 per square unit
        shippingCost = Math.round(shippingCost * 100.0) / 100.0; // Round to two decimal places
        System.out.println("Shipping cost for table (Size: " + table.getLength() + " x " + table.getWidth() + "): $" + String.format("%.2f", shippingCost));
        totalCost += shippingCost;
    }

    @Override
    public void visit(Sofa sofa) {
        double distance = 100; // Example distance
        double shippingCost = distance * 0.1; // $0.1 per mile
        System.out.println("Shipping cost for sofa (Distance: " + distance + " miles): $" + shippingCost);
        totalCost += shippingCost;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
