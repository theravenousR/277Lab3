public class Faculty extends Employee {
    private String Rank;
    public enum Level {
        AS, AO, FU
    }
    Education e = new Education();
    Level Position;

    Faculty(){}
    Faculty(String l, String f, String i, Level L, String d, String m, int r) {
        lastName = l;
        firstName = f;
        idNumber = i;
        Position = L;
        this.Level();
        e.setDegree(d);
        e.setMajor(m);
        e.setResearchers(r);
    }

    public void Level() {
        switch (Position) {
            case AS -> Rank = "Assistant";
            case AO -> Rank = "Associate";
            case FU -> Rank = "Full";
        }
    }

    public void setRank(Level L) {
        Position = L;
        switch (Position) {
            case AS -> Rank = "Assistant";
            case AO -> Rank = "Associate";
            case FU -> Rank = "Full";
        }
    }

    public String getRank() {
        return Rank;
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

    public String toString() {
        return "ID Employee number: " + idNumber + "\n" + "Employee name: " + firstName + " " + lastName + "\n" +
                Rank + " Professor" + "\n" + "Monthly Salary: " + monthlyEarning() + "\n" + "Degree: " + e.getDegree()
                + "\n" + "Major: " + e.getMajor() + "\n" + "Researchers: " + e.getResearchers() + "\n";
    }

    public double monthlyEarning() {
        double temp = switch (Position) {
            case AS -> 1.0;
            case AO -> 1.5;
            case FU -> 2.0;
            default -> 0.0;
        };
        return FACULTY_MONTHLY_SALARY * temp;
    }
}
