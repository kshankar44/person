import java.time.*;
import java.util.Scanner;
class Person
{
    public void person_name()
    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person name");
        String name = sc.nextLine();
        System.out.println("person name = "+name);
    }
    public void person_age(LocalDate dob)
    {
        LocalDate today=LocalDate.now();
        int year=Period.between(dob,today).getYears();
        System.out.println("Current date is "+today);
        System.out.println("person birthdate is "+dob);
        System.out.println("person age is = "+year);
    }
}