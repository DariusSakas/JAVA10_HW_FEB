package ShippingTask;

public class AirShipping implements Shipping{
    @Override
    public void ship(Product product) {
        System.out.println("Doing AirShipping");
        System.out.println("Shipping "+product.toString());
    }
}
