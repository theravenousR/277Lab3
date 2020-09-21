public class Parttime extends Staff {
    private double hoursPerWeek;

    Parttime(){}
    Parttime(String l, String f, String i, double r, double h) {
        hoursPerWeek = h;
        hourlyRate = r;
        idNumber = i;
        lastName = l;
        firstName = f;
    }

    public String toString() {
        return "ID Employee Number: " + idNumber + "\n" + "Employee name: " + firstName + " " + lastName + "\n" +
                "Hours worked per month: " + (4 * hoursPerWeek) + "\n" + "Monthly Salary: " + monthlyEarning() + "\n";
    }

    public void setHoursPerWeek(double h) {
        hoursPerWeek = h;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
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
        return (hoursPerWeek * 4) * hourlyRate;
    }
}
