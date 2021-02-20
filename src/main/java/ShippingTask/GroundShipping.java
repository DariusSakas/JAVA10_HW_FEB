package ShippingTask;

public class GroundShipping implements Shipping {

    @Override
    public void ship(Product product) {
        System.out.println("Doing ground shipping");
        System.out.println("Shipping "+product.toString());
    }
}
