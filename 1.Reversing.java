import java.io.*;
import java.util.Scanner;
class reverse{
public static void main(String args[])
{
int n,r=0;
Scanner scanner=new Scanner(System.in);
System.out.println("enter number:");
n=scanner.nextInt();
while(n>0)
{
int d=n%10;
r=r*10+d;
n=n/10;
}
System.out.println("reverse number:");
System.out.println(r);
}
}