import java.util.Arrays;  
import java.util.Scanner;
import java.util.*;  
public class des  
{  
public static void main(String args[])   
{  
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
int n;  
System.out.println("Enter the number of elements ");
n=sc.nextInt();
String str[]=new String[n];   
System.out.println("Enter the String ");
for(int i=0; i<n ;i++)     
{
str[i]=sc1.nextLine();
}
Scanner sc2=new Scanner(System.in);
System.out.print("Order (A/D): ");
String sta=sc2.nextLine();
if(sta.equals("A"))
{
Arrays.sort(str);   
System.out.println(Arrays.toString(str)); 
}
else
{
Arrays.sort(str,Collections.reverseOrder());   
System.out.println(Arrays.toString(str)); 
}  
}  
}