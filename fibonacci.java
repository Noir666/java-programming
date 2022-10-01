import java.io.*;
import java.util.Scanner;
class fibonacci extends Thread
{
public void run()
{
try
{
int a=0, b=1, c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the Limit for fabonacci: ");
int n = Integer.parseInt(br.readLine());
System.out.println();
System.out.println("Fibonacci series:");
while (n>0)
{
System.out.print(c+" ");
a=b;
b=c;
c=a+b;
n=n-1;
}
}
catch (Exception ex)
{
ex.printStackTrace();
}
}
}
class MainThread
{
public static void main(String[] args)
{
try
{
fibonacci fib = new fibonacci();
fib.start();
fib.sleep(4000);
}
catch (Exception ex)
{
ex.printStackTrace();
}
}
}
