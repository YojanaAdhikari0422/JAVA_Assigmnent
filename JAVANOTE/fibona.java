import java.io.*;
class Main{
public static void main(String args[]){
fibona f1=new fibona();
f1.check(10);
}
}
class fibona{
void check(int n){
int a=0,b=1,num=0,sum=0;
while(n>0){
System.out.print(num + ", ");
a=b;
b=num;
num=a+b;
sum=b+sum;
n=n-1;


}
System.out.println("The sum of the series is : " + sum);
}
}

