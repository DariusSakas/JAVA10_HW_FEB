package DesignPatternExmpl;

public class CarInterior extends CarProduction{

    private final Product product;
    private final String carModel;

    public CarInterior(Product product, String carModel) {
        super(product, carModel);

        this.product = product;
        this.carModel = carModel;
    }

    @Override
    public void produceProduct() {
        product.produce();
        System.out.println("Producing "+product.productName()+" according to "+carModel+" blueprints");
    }

    @Override
    public void assembleProductToTheCar() {
        System.out.println("Assembling "+product.productName()+ " in " +carModel);
    }
}
