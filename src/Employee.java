public abstract class Employee implements EmployeeInfo {
    protected String lastName = "";
    protected String firstName = "";
    protected String idNumber = "";

    Employee() {}
    Employee(String l, String f, String i) {
        lastName = l;
        firstName = f;
        idNumber = i;
    }

    public String toString() {
        return "ID Employee number: " + idNumber +"\n" + "Employee Name: " + firstName + lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public void setIdNumber(String i) {
        idNumber = i;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public abstract double monthlyEarning();
}
