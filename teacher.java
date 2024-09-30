package LatianPerson;

public class teacher extends person{
    protected String subject;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public teacher() {
        super();
        subject = "Coding";
    }

    public teacher(String name, int age, String subject) {
        this.subject = subject;
    }
    @Override
    public void print() {
        super.print();
        System.out.println();
        System.out.println("Subject: " +subject);
        System.out.println();
    }

}
