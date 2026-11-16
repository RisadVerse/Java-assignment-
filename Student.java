//22. Student class with 3 objects.

public class Student {
    String name;
    int id;
    double cgpa;
    String dept;

    //Constructor
    Student(String name, int id, double cgpa, String dept) {
        this.name=name;
        this.id=id;
        this.cgpa=cgpa;
        this.dept=dept;
    }

    void display() {
        System.out.println("Name : "+name+"\nID : "+id+"\nCGPA : "+cgpa+"\nDepartment : "+dept+"\n");
    }

    public static void main(String[] args) {
        Student std22 = new Student("Rafiul Islam", 22, 3.93, "CSE");
        Student std07 = new Student("Cristiano Ronaldo", 07, 4.00, "CSE");
        Student std10 = new Student("Kylian Mbappe", 10, 3.99, "CSE");
        
        System.out.println("Student Info : ");
        System.out.println("--------------");

        std22.display();
        std07.display();
        std10.display();

    }
}
