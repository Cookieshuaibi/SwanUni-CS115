package Labs.Lab1;

public class Student {
    protected Student() {

    }

    public Student(String firstName, String surname) {
        this();

        this.setFirstName(firstName);
        this.setSurname(surname);
    }

    public Student(String firstName, String surname, int courseworkMark, int testMark) {
        this(firstName, surname);

        this.setCourseworkMark(courseworkMark);
        this.setTestMark(testMark);
    }

    protected String firstName;
    protected String surname;
    protected int courseworkMark;
    protected int testMark;
    protected Student labPartner;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return this.firstName + " " + this.surname;
    }

    public int getCourseworkMark() {
        return this.courseworkMark;
    }

    public void setCourseworkMark(int courseworkMark) {
        if (courseworkMark >= 0 && courseworkMark <= 100)
            this.courseworkMark = courseworkMark;
    }

    public int getTestMark() {
        return this.testMark;
    }

    public void setTestMark(int testMark) {
        if (testMark >= 0 && testMark <= 100)
            this.testMark = testMark;
    }

    public double getAverageMark() {
        return (this.getTestMark() + this.getCourseworkMark()) / 2.0;
    }

    public Student getLabPartner() {
        return this.labPartner;
    }

    public void setLabPartner(Student labPartner) {
        this.labPartner = labPartner;
    }
}
