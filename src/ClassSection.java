import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students = new ArrayList<>();

    public ClassSection(String s, int c, int y){
        subject = s;
        capacity = c;
        yearLevel = y;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String s){
        subject = s;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int c){
        capacity = c;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int y){
        yearLevel = y;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }

    public void addStudent(Student s){
        boolean check = false;
        for(int i = 0; i<students.size();i++){
            if(students.get(i) == s){
                check = true;
            }
        }
        if(s.getYearLevel() == this.yearLevel && !check){
            students.add(s);
        }
    }
    public String toString(){
        return "ClassSection{subject=\'" + subject + "\', capacity=" + capacity + ", students=" + students + "}";

    }
    public void removeStudent(Student s){
        students.remove(s);
    }
    public boolean isStudentEnrolled(Student s){
        int check = 0;
        for(int i = 0; i< students.size(); i++) {
            if (s.equals(students.get(i))) {
                check++;
            }

        }
        if(check > 0)
            return true;
        else
            return false;
    }

}
