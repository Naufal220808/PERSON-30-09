package LatianPerson;
import java.util.Scanner;
public class driver {
    public static void main(String[] args) {
        String choice = "";
        student student = new student();
        partTime partTime = new partTime();
        fulltime fulltime = new fulltime();
        Scanner s = new Scanner(System.in);

        System.out.println("Are you a student or teacher?");
        choice = s.nextLine();

        if (choice.equalsIgnoreCase("Student")) {
            student.print();

        } else if (choice.equalsIgnoreCase("Teacher")) {
            System.out.println("Are you a 'Full Time' Or a 'Part Time' Teacher?" );
            choice=s.nextLine();

            if (choice.equalsIgnoreCase("Full Time")) {
                fulltime.print();
            } else if (choice.equalsIgnoreCase("Part Time")) {
                partTime.print();
            }

        } else {
            System.out.println("System Error 666");
        }
        
        s.close();
    }
}
