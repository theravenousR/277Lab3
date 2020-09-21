import java.util.ArrayList;

public class testDriver {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<>();
        //Staff
        Staff Paita = new Staff("Allen", "Paita", "123", 50.00);
        Staff Steven = new Staff("Zapata", "Steven", "456", 35.00);
        Staff Enrique = new Staff("Rios", "Enrique", "789", 40.00);
        //Faculty
        Faculty Anne = new Faculty("Johnson", "Anne", "243", Faculty.Level.FU, "Ph.D", "Engineering",
                3);
        Faculty William = new Faculty("Bouris", "William", "791", Faculty.Level.AO, "Ph.D", "English",
                1);
        Faculty Christopher = new Faculty("Andrade", "Christopher", "623", Faculty.Level.AS, "MS",
                "Physical Education", 0);
        //Part-time
        Parttime Augusto = new Parttime("Guzman", "Augusto", "455", 35.00, 30);
        Parttime Martin = new Parttime("Depirro", "Martin", "678", 30.00, 15);
        Parttime Marque = new Parttime("Aldaco", "Marque", "945", 20.00, 35);

        Employees.add(Paita);
        Employees.add(Steven);
        Employees.add(Enrique);
        Employees.add(Anne);
        Employees.add(William);
        Employees.add(Christopher);
        Employees.add(Augusto);
        Employees.add(Martin);
        Employees.add(Marque);
        for (Employee x:Employees) {
            if (x instanceof Parttime) {
                System.out.println("Part-time:\n");
                Parttime y = (Parttime)x;
                System.out.println(y.toString());
            }
            else if (x instanceof Staff) {
                System.out.println("Staff:\n");
                Staff y = (Staff)x;
                System.out.println(y.toString());
            }
            else {
                System.out.println("Faculty:\n");
                Faculty y = (Faculty)x;
                System.out.println(y.toString());
            }

        }
    }
}
