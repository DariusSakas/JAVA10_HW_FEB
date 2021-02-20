package DesignPatternExmpl;

public abstract class CarProduction {
    private final Product product;
    private final String carModel;

    public CarProduction(Product product, String carModel) {
        this.product = product;
        this.carModel = carModel;
    }

    public abstract void produceProduct();
    public abstract void assembleProductToTheCar();

    public void printDetails(){
        System.out.println("Car: "+carModel+", Product: "+product.productName());
    }
}
