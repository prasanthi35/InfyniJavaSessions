package inheritance.hybridInheritance;

public class Animal {

    private String name;
    private int noOfHearts;

    public void eat() {
        System.out.println("Animal...." +name+ "  is eating....");
    }

    public void displayName() {
        System.out.println("Animal name is ...." +getName());
    }

    public void displayHearts() {
        System.out.println(getName() + " has ...." +getNoOfHearts() + "  hearts ....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfHearts() {
        return noOfHearts;
    }

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }
}
