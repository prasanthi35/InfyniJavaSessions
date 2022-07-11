public class Department {

    private int deptID;
    private String departmentName;

    Department() {}

    public Department(int deptID, String departmentName) {
        this.deptID = deptID;
        this.departmentName = departmentName;
    }

    public int getDeptID() {
        return deptID;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
