class Main{
public static void main(String args[]){
check c=new check();
c.fibo(8);
}}

class check{
void fibo(int n){
int[] arr=new int[8];
int a=0,b=1,num=0;
while(n>0){
System.out.println(num);
a=b;
b=num;
num=a+b;


arr[n]=num;
n=n-1;

}
for (int i = 0; i < n; i++) {
 System.out.print(arr[i] + " ");}}}
