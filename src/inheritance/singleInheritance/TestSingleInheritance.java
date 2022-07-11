package inheritance.singleInheritance;

public class TestSingleInheritance {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setBrand("Honda");
        car.setName("Odyssey");
        car.setNoOfTyres(4);
        car.setTypeOfVehicle("Four wheeler");

        car.displayVehicleInfo();
        car.displayCarInfo();
    }
}
