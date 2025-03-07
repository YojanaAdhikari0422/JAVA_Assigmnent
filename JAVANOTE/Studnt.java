import java.io.*;
import java.util.Scanner;

class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int marks[]=new int[5];
for(int i=0;i<5;i++){
mar[i]=sc.nextInt();
}
Student s1= new Student("0001","Yojana","MCA",23,mar);
s1.calculateTotalMarks();
s1.calculateGrade();
s1.display();
}
}

class Student{
private String studentID,name,course;
private int age;
private int[] marks= new int[5];

Student(String st,String nam,string cour,int age,int[] mar){
this.studentID=st;
this.name=nam;
this.course=cour;
this.age=ag;

for(int i=0;i<=4;i++){
marks[i]=mar[i];
}
}

public int calculateTotalMarks(){
int mar=0;
for(int i=0;i<5;i++){
mar=mar+mar[i];
}
return mar;
}

public void calculateGrade(){
int mar=0;

for(int i=0;i<5;i++){
mar=mar+mar[i];

float percent=(mar/500)*100;
if (percent>=90){
System.out.println("A");}
else if (percent>=75){
System.out.println("B");}
else if (percent>=60){
System.out.println("C");}
else if (percent>=40){
System.out.println("D");}
else 
Sytem.out.println("Fail");
}

void display(){
System.out.println("Student ID =" + st);
System.out.println("Student Name =" + nam);
System.out.println("Course =" + cour);
System.out.println("Age =" + ag);
System.out.println("Marks =" + calculateTotalMarks());
System.out.println("Marks =" + calculateGrade());
}

}
