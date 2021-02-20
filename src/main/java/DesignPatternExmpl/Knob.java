package DesignPatternExmpl;

public class Knob implements Product {
    private final String productName;

    public Knob(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing a new knob");
    }
}
