import java.time.LocalDate;

public class Employee_details extends Person{
    private double bonus;

    public Employee_details(String name, int employeeId, double salary, double bonus) {
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return bonus;
    }

    @Override
    public void person_name(){
        super.person_name();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + getTotalSalary());
    }

    public static void main(String[] args) {
    Employee_details E1 = new Employee_details("John Doe", 1001, 80000, 5000);
    E1.person_name();
    Person P = new Person();
    P.person_name();
    LocalDate dob = LocalDate.of(2004, 6, 16);
    P.person_age(dob);
    }
}