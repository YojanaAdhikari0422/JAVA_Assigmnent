import java.io.*;
class Main{
public static void main(String args[]){
Prime p = new Prime();
p.check(1000);
}}
class Prime{
void check(int n){
for(int i=2;i<=n;i++){
boolean isprime= true;
for(int j=2;j<=i/2;j++){
if (i%j==0){
isprime= false;
break;
}
}
if (isprime){
System.out.print(i + ", ");
}
}
}
}



