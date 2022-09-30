import java.io.*;
import java.util.Scanner;
public class factor
{
public static void main(String[] args) 
{
Scanner sa =new Scanner
int n;
int c=0;
System.out.println( "Factors of " + num + " are " );
for(int i = 1; i <= num; i++)
{
int k=num % i;
if(k == 0)
c++;
}
System.out.println(c); 
}
}