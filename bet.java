import java.io.*;
import java.util.Scanner;
class bet
{
public static void main(String args[])
{
int a,b,c;
Scanner sa= new Scanner(System.in);
System.out.print("Enter the first number:");
a= sa.nextInt();
Scanner sb= new Scanner(System.in);
System.out.print("Enter the last number:");
b= sb.nextInt();
Scanner sc= new Scanner(System.in);
System.out.print("Enter the skipping number:");
c= sc.nextInt();
for(int i=a;i<=b;i++)
{
System.out.println(i);
}
}
}
