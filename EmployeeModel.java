public class EmployeeModel
{
    private String employeeID;
    private String firstName;
    private String lastName;
    private String gender;
    private String hiredDate;
    private String salary;
    public String getEmployeeID()
    {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getHiredDate() {
        return hiredDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
