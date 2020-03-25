public class Main
{
    public static void main(String[] args) {
        EmployeeModel model = retriveEmployeeModelFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeID(" sp11-bsse-0000 ");
        controller.updateView();
    }
    private static EmployeeModel retriveEmployeeModelFromDatabase(){
        EmployeeModel employee = new EmployeeModel();
        employee.setEmployeeID("sp18-bsse-0001");
        employee.setFirstName("Malaika");
        employee.setLastName("Niaz");
        employee.setGender("Female");
        employee.setHiredDate("1-jan-2020");
        employee.setSalary("25000");
        return employee;
    }
}
