public class Staff extends Employee {
    protected double hourlyRate;

    Staff() {}
    Staff(String l, String f, String i, double h) {
        lastName = l;
        firstName = f;
        idNumber = i;
        hourlyRate = h;
    }

    public String toString() {
        return "ID Employee number: " + idNumber +"\n" + "Employee Name: " + firstName + " " + lastName + "\n" +
                "Full Time" + "\n" + "Monthly Salary: " + monthlyEarning() + "\n";
    }

    public void setHourlyRate(double h) {
        hourlyRate = h;
    }

    public double getHourlyRate() {
        return hourlyRate;
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

    public double monthlyEarning() {
        return hourlyRate * STAFF_MONTHLY_HOURS_WORKED;
    }
}
