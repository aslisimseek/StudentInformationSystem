public class Student {
    String name;
    int stdNo;
    String classes;
    Course math;
    Course music;
    Course chemistry;
    double avarage;
    boolean isPass;

    public Student(String name, int stdNo, String classes, Course math, Course music, Course chemistry) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.math = math;
        this.music = music;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mathNote, int musicNote, int chemistryNote) {
        if (mathNote > 0 && mathNote <= 100) {
            math.note = mathNote;
        }
        if (musicNote > 0 && musicNote <= 100) {
            music.note = musicNote;
        }
        if (chemistryNote > 0 && chemistryNote <= 100) {
            chemistry.note = chemistryNote;
        }

    }

    public void addBulkVerbalNote(int mathVerbalNote, int musicVerbalNote, int chemistryVerbalNote) {
        if (mathVerbalNote > 0 && mathVerbalNote <= 100) {
            math.verbalNote = mathVerbalNote;
        }
        if (musicVerbalNote > 0 && musicVerbalNote <= 100) {
            music.verbalNote = musicVerbalNote;
        }
        if (chemistryVerbalNote > 0 && chemistryVerbalNote <= 100) {
            chemistry.verbalNote = chemistryVerbalNote;
        }
    }

    public void isPass() {
        if (this.math.note == 0 || this.music.note == 0 || this.chemistry.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        //this.avarage = (math.note + music.note + chemistry.note) / 3;
        this.avarage = ((math.note * 0.80 + math.verbalNote * 0.20) + (music.note * 0.80 + music.verbalNote * 0.20) + (chemistry.note * 0.80 + chemistry.verbalNote * 0.20)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        if (avarage > 55) return true;
        else return false;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.music.note);
        System.out.println("Kimya Notu : " + this.chemistry.note);
    }

}
