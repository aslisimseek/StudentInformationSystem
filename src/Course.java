public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(prefix)) {
            this.teacher = teacher;
        } else
            System.out.println("This teacher does not give a this couse");

    }

    public void printTeacher() {
        if(teacher!=null)
            System.out.println(teacher.name);
    }
}
