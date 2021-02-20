package DesignPatternExmpl;

public class CarProductionMain {
    public static void main(String[] args) {

        Product knob1 = new Knob("Black Wooden Knob");

        Product steeringWheel1 = new SteeringWheel("Nardi");

        CarProduction newCarInterior = new CarInterior(knob1, "330i E30");
        newCarInterior.produceProduct();
        newCarInterior.assembleProductToTheCar();
        newCarInterior.printDetails();

        System.out.println();

        newCarInterior = new CarInterior(steeringWheel1, "330i E30");
        newCarInterior.produceProduct();
        newCarInterior.assembleProductToTheCar();
        newCarInterior.printDetails();

    }
}
