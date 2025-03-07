import java.io.*;
class box_demo
{
 public static void main(String a[])
 {
  box b1 = new box();
  box b2 = new box(5,3,2);
  box b3 = new box(5);
  box b4 = new box(b2);

  System.out.println(b1.volume());
  System.out.println(b1.volume());
  System.out.println(b1.volume());
  System.out.println(b1.volume());
 }
}
class box
{
 double l,b,h;
 box()
 {
  l=b=h=0.0;
  System.out.println("Default constructor");
  }

 box(double l1, double b1, double h1)
 {
  l=l1;
  b=b1;
  h=h1;
  System.out.println("Parameterized constructor");
 }

 box (double n)
 {
  l=b=h=n;
  System.out.println("Parameterized constructor accepting only one parameter");
  System.out.println("Forming a cube");
 }

 box(box ob)
 {
  l=ob.l;
  b=ob.b;
  h=ob.h;
  System.out.println("Clone of a constant of box class");
 }
 double volume()
 {
  return l*b*h;
  }
 }
 



