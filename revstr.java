import java.util.Scanner;
class Rev
{
public static void main(String[ ] arg)
{
String s;
Scanner scan=new Scanner(System.in);
System.out.print("Enter a string : ");
s=scan.nextLine();	
char[] ch=s.toCharArray(); 
System.out.print("Reverse of a String is :"); 
int j=ch.length;
for(int i=j;i>0;i--)
{
System.out.print(ch[i-1]); 
}
}
}