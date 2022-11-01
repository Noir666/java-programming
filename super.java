import java.util.Scanner;
class superr
{     
public  static void main(String[] args) 
{ 
try
{
Scanner sk=new Scanner(System.in);         
System.out.print("Enter an number");         
double s=sk.nextDouble();         
double a=0,b=0;         
a=s*s; 
b=a*s; 
System.out.println("The square of number="+a); 
System.out.println("The cube of number="+b); 
} 
catch(Exception e) 
{ 
System.out.println("Invalid");    
} 
}
} 
