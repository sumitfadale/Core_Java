package Static_Variable;

public class StaticDepartMentHR {
    private int empId;
    private String empName;
    public static String company ="Infosys";

    public StaticDepartMentHR(int empId, String empName) {
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
     public void display()
     {
         System.out.println(empId + " " + empName + " " + company);
     }
    public static void main(String[] args) {
        StaticDepartMentHR hr = new StaticDepartMentHR(101,"Sumit");
        hr.display();
    }
}
