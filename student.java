public class student {
    private String rollNo;
    private String name;
    private String course;

    public student(String rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Course: " + course;
    }
}
