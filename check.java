import java.util.*;
public class check 
{
static void doc(string a,string b)
{

if (a.equals(b))
{
System.out.print("both username are same");
}
else
{
System.out.print("both username are not same");
}
public static  void main(String [] args)
{
Scanner i = new Scanner (System.in);
System.out.print("Enter the user name : ");
String a = i.next();
Scanner j = new Scanner (System.in);
System.out.print("Enter the user name : ");
String b = j.next();
doc(a,b);
}
}
}