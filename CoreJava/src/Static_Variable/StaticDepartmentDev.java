package Static_Variable;

public class StaticDepartmentDev {
    private int empId;
    private String empName;

    public StaticDepartmentDev(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void display ()
    {
        System.out.println(empId + " " + empName + " " + StaticDepartMentHR.company);
    }

    public static void main(String[] args) {

        StaticDepartmentDev dev = new StaticDepartmentDev(105,"Akshay");
        dev.display();
    }
}
