import java.io.*;
import java.util.Scanner;
class square
{
public static void main(String args[])
{
float a,b,c;
System.out.print("Enter a number:");
Scanner sa=new Scanner(System.in);
a=sa.nextFloat();
b=a*a;
c=a*a*a;

System.out.println("Square number:"+b);
System.out.println("Cube Number:"+c);
}
}