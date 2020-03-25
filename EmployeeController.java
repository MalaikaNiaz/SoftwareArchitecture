public class EmployeeController
{
    private EmployeeModel model;
    private EmployeeView view;
    public EmployeeController( EmployeeModel model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }
    public void setEmployeeID(String employeeID) {
        model.setEmployeeID(employeeID) ;
    }

    public void setFirstName(String firstName) {
        model.setFirstName(firstName);
    }

    public void setLastName(String lastName) {
        model.setLastName(lastName);
    }

    public void setGender(String gender) {
        model.setGender(gender);
    }

    public void setHiredDate(String hiredDate) {
        model.setHiredDate(hiredDate);
    }

    public void setSalary(String salary) {
        model.setSalary(salary);
    }
    public String getEmployeeID()
    {
        return model.getEmployeeID();
    }

    public String getFirstName() {
        return model.getFirstName();
    }

    public String getLastName() {
        return model.getLastName();
    }

    public String getGender() {
        return model.getGender();
    }

    public String getHiredDate() {
        return model.getHiredDate();
    }

    public String getSalary() {
        return model.getSalary();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getEmployeeID(), model.getFirstName(), model.getLastName(), model.getGender(), model.getHiredDate(), model.getSalary());
    }
}
