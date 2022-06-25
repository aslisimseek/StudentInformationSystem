public class StudentInformationSystem {
    public static void main(String[] args) {
        Course math = new Course("Matematik", "MAT101", "MAT");
        Course music = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        music.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", math, music, chemistry);
        s1.addBulkExamNote(50, 50, 40);
        s1.addBulkVerbalNote(100, 100, 100);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", math, music, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s1.addBulkVerbalNote(10, 10, 15);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", math, music, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s1.addBulkVerbalNote(50, 60, 70);
        s3.isPass();

    }
}
