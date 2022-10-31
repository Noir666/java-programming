import java.util.Scanner;
class upper
{
public static void main(String[] args)
{
System.out.print("enter the string :");
Scanner a=new Scanner(System.in);
String b=a.nextLine();
System.out.println("the Upper case of the "+b+" is "+b.toUpperCase());
System.out.print("the Lower case of the "+b+" is "+b.toLowerCase());
}
}
