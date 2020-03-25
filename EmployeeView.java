public class EmployeeView
{
    public void printEmployeeDetails(String employeeID, String firstName,
                                     String lastName, String gender, String hiredDate, String salary) {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + employeeID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Hired Date: " + hiredDate);
        System.out.println(" Salary: " + salary);
    }
}
