public class EmployeePayrollData {
    private int id;
    private String name;
    private double salary;

    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return "EmployeePayrollData [id=" +id+ ", name = "+name+", salary=" +salary+"]";
    }
}