import java.io.*;
import java.util.Scanner;
class hole
{
static void print_square(int n)
{
int i, j;
Scanner sb= new Scanner(System.in);
System.out.print("Enter the character :");
String b = sb.nextLine();
for (i = 1; i <= n; i++)
{
for (j = 1; j <= n; j++)
{
if (i == 1 || i == n ||j == 1 || j == n)		
System.out.print(b);		
else		
System.out.print(" ");		
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner sa= new Scanner(System.in);
System.out.print("Enter the number of rows:");
int a = sa.nextInt();

print_square(a);
}
}
