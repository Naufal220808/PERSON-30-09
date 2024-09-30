package LatianPerson;

public class partTime extends teacher{
    protected int hoursWorked;

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public partTime() {
        super();
        hoursWorked = 5;
    }

    public partTime(String name, int age, String subject, int hoursWorked) {
        super(name, age, subject);
        this.hoursWorked = hoursWorked; 
    }

    public int setSalary() {
        int salary = hoursWorked * 10;
        return salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Salary: "+setSalary());
        System.out.println();
    }
}


