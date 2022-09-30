import java.util.Scanner;
import java.io.*;
class vow
{
public static void main(String[] args) 
{
Scanner sc= new Scanner(System.in); 
System.out.print("Enter  A word: ");  
String l = sc.nextLine();  
int a = 0, b = 0, c = 0, d = 0;
l = l.toLowerCase();
for (int i = 0; i < l.length(); ++i) 
{
char ch = l.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
{
++a;
System.out.print("Vowel:"+ch+"\n");
}
else if ((ch >= 'a' && ch <= 'z')) 
{
++b;
System.out.print("constant:"+ch+ "\n");
}
else if (ch >= '0' && ch <= '9') 
{
++c;
System.out.print("Number:"+ch+"\n");
}
else if (ch == ' ') 
{
++d;
}
}
}
}