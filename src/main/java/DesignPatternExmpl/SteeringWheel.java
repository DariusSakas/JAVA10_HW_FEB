package DesignPatternExmpl;

public class SteeringWheel implements Product{
    private final String productName;

    public SteeringWheel(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing a new steering wheel");
    }
}
