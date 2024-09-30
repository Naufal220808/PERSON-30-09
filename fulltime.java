package LatianPerson;

public class fulltime extends teacher {
    protected int anualSalary;
    protected String unit;

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public fulltime() {
        super();
        anualSalary = 30;
        unit = "Head Office";
    }

    public fulltime(String name, int age, String subject, int anualSalary, String unit) {
        super(name, age, subject);
        this.anualSalary = anualSalary;
        this.unit = unit;
    }
    @Override
    public void print() {
        super.print();
        System.out.println();
        System.out.println("anualSalary: " +anualSalary);
        System.out.println("Unit: "+unit);
        System.out.println();
    }

}
