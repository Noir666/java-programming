import java.util.Scanner;
import java.io.*;
class vowels
{
public static void main(String[] args)	throws IOException
{
System.out.print("Enter the  sentence :");
Scanner sd = new Scanner(System.in);
String s=sd.nextLine();
s = s.toLowerCase();
int c = 0;
for (int i = 0; i < s.length(); i++)
{
if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i'|| s.charAt(i) == 'O' || s.charAt(i) == 'o'|| s.charAt(i) == 'U' ||s.charAt(i) == 'u') 
{
c++;
}
}
System.out.println("Total no of vowels in string are: " + c);
}
}
