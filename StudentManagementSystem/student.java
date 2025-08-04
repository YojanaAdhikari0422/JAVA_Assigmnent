import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        //taking inputs
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter Student roll no");
        String roll=sc.next();
        System.out.println("Enter Student name");
        String name=sc.next();
        System.out.println("Enter Department name");
        String dept=sc.next();
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Enter Student marks");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student s1 = new Student(roll,name,dept,age, marks);
        s1.calculateTotalMarks();
        s1.calculateGrade();
        s1.display();
    }
}

class Student {
    private String studentID, name, course;
    private int age;
    private int marks[] = new int[5];
    private int totalMarks;
    private String grade;
    //constructor for initializing all the characteristics
    Student(String st, String nam, String cour, int age, int[] mar) {
        this.studentID = st;
        this.name = nam;
        this.course = cour;
        this.age = age;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = mar[i];
        }
    }
    //calculation of marks
    public int calculateTotalMarks() {
        totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }
        return totalMarks;
    }
    //calculation of grade
    public void calculateGrade() {
        float percent = ((float) totalMarks / 500) * 100;

        if (percent >= 90) {
            grade = "A";
        } else if (percent >= 75) {
            grade = "B";
        } else if (percent >= 60) {
            grade = "C";
        } else if (percent >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }
    }
   //Displaying all the information of student
    void display() {
        System.out.println("Student ID = " + studentID);
        System.out.println("Student Name = " + name);
        System.out.println("Course = " + course);
        System.out.println("Age = " + age);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Grade = " + grade);
    }
}
