public class Student extends Person
{
    private int grade;
    public Student(String f, String l, String p, int grade)
    {
        super(f, l, p);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public String toString()
    {
        return super.toString() + " Grade: " + grade;
    }
}
