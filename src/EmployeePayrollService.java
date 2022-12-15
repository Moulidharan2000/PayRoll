public class EmployeePayrollService {
    public enum IOService{CONSOLE_IO, FILE_IO, REST_IO}
    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<EmployeePayrollData>();
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Payroll Service Program");
        ArrayList<EmployeePayrollData>employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name : ");
        String name = consoleInputReader.next();
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }
    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Data to Console\n"+employeePayrollData);
    }
}
