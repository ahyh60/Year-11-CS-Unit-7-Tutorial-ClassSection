public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String n, String l, int a, int y){
        firstName = n;
        lastName = l;
        age = a;
        yearLevel = y;
        id = studentCount;
        studentCount ++;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String lname){
        lastName = lname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int year){
        yearLevel = year;
    }
    public static int getStudentCount(){
        return studentCount;
    }

    public boolean equals(Student other){
        if(firstName.equals(other.firstName)&&lastName.equals(other.lastName)&& age == other.age && yearLevel == other.yearLevel)
            return true;
        else
            return false;

    }

    public String toString(){
        return "Student{id=" + id + ", firstName=\'" + firstName+ "\', lastName=\'" + lastName + "\', age=" + age + "}";
    }


}
