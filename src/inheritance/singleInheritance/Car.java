package inheritance.singleInheritance;

public class Car extends Vehicle{

    public String color;
    public String brand;
    public String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void displayCarInfo(){
        System.out.println(" Color of the car is.. " +color);
        System.out.println(" Brand of the car is.. " +brand);
        System.out.println(" Name of the car is.. " +name);
    }
}
