package inheritance.singleInheritance;

public class Vehicle {

    public String typeOfVehicle;
    public int noOfTyres;

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void displayVehicleInfo(){
        System.out.println("Type of the vehicle is..."  +typeOfVehicle);
        System.out.println("Number of tyres of the vehicle is..."  +noOfTyres);
    }
}
