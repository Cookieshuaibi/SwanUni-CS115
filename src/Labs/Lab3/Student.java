package Labs.Lab3;

public class Student {
    public Student(int id, String firstName, String surname, int courseworkMark1, int courseworkMark2, int examMark) {
        super();

        this.setId(id);
        this.setFirstName(firstName);
        this.setSurname(surname);
        this.setCourseworkMark1(courseworkMark1);
        this.setCourseworkMark2(courseworkMark2);
        this.setExamMark(examMark);
    }

    protected int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected String firstName;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String surname;

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    protected int courseworkMark1;

    public int getCourseworkMark1() {
        return this.courseworkMark1;
    }

    public void setCourseworkMark1(int courseworkMark1) {
        if (courseworkMark1 >= 0 && courseworkMark1 <= 100)
            this.courseworkMark1 = courseworkMark1;
    }

    protected int courseworkMark2;

    public int getCourseworkMark2() {
        return this.courseworkMark2;
    }

    public void setCourseworkMark2(int courseworkMark2) {
        if (courseworkMark2 >= 0 && courseworkMark2 <= 100)
            this.courseworkMark2 = courseworkMark2;
    }

    protected int examMark;

    public int getExamMark() {
        return this.examMark;
    }

    public void setExamMark(int examMark) {
        if (examMark >= 0 && examMark <= 100)
            this.examMark = examMark;
    }
}