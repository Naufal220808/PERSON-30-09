package LatianPerson;

public class student extends person{
    protected int stundentNumber;
    protected int score;
    protected String major;

    public int getStundentNumber() {
        return this.stundentNumber;
    }

    public void setStundentNumber(int stundentNumber) {
        this.stundentNumber = stundentNumber;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public student() {
        stundentNumber = 28;
        score = 100;
        major = "Coding";
    }

    public student(String name, int age, int stundentNumber, int score, String major) {
        super(name, age);
        this.stundentNumber = stundentNumber;
        this.score = score;
        this.major = major;
    }
    @Override
    public void print() {
        super.print();
        System.out.println();
        System.out.println("studentnumber: " +stundentNumber);
        System.out.println("Score: " +score);
        System.out.println("Major: " +major +" Class");
    }

}
