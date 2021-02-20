package ShippingTask;

public class SeaShipping implements Shipping {

    @Override
    public void ship(Product product) {
        System.out.println("Doing seas shipping");
        System.out.println("Shipping "+product.toString());

    }
}
