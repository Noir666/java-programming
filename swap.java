import java.util.Scanner;
class Good
{
static void swap(int m,  int n)
{
int temp =  m;
m =  n;
n = temp;
System.out.println("the value of m"+ m +" and the value of n is "+ n);
}
public static void main(String[] args)
{
System.out.print("Enter the first number :");
Scanner sd = new Scanner(System.in);
int m=sd.nextInt();
System.out.print("Enter the secoond number :");
Scanner sd = new Scanner(System.in);
int n=sd.nextInt();
swap(m, n);
}
}
