package MethodOverloading;

public class MethodOverloading {


    private String X1;
    private String X2;
    private String X3;
    private String X4;
    private int I1;

    // Constructor Overloading
    public MethodOverloading(String X1) {
        this.X1= X1;
    }
    public MethodOverloading(String X1, String X2) {
        this.X1= X1;
        this.X2= X2;
    }
    public MethodOverloading(String X1, String X2,String X3, String X4) {
        this.X1= X1;
        this.X2= X2;
        this.X3= X3;
        this.X4= X4;
    }

    // Method Overloading
    public void getValues(){
        System.out.println();
    }
    public void getValues( int a){

    }
    public void getValues(float f){

    }
    public void getValues(int b, float c){

    }
}
