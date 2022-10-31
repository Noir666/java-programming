import java.util.Scanner;
class rex
{
public static void main(String[] args)
{
System.out.print("Enter the string :");
Scanner an =new Scanner(System.in);
String a=an.nextLine();
System.out.print("Enter the string :");
Scanner bn =new Scanner(System.in);
String b=bn.nextLine();
System.out.print("Enter the string :");
Scanner cn =new Scanner(System.in);
String c=cn.nextLine();
System.out.print("Enter the string :");
Scanner dn =new Scanner(System.in);
String d=dn.nextLine();
System.out.print("Enter the string :");
Scanner en =new Scanner(System.in);
String e=en.nextLine();
System.out.print("Enter the string :");
Scanner fn =new Scanner(System.in);
String f=fn.nextLine();
System.out.print("Enter the string :");
Scanner gn =new Scanner(System.in);
String g=gn.nextLine();
System.out.print("Enter the string :");
Scanner hn =new Scanner(System.in);
String h=hn.nextLine();
char[] ah=a.toCharArray(); 
char[] bh=b.toCharArray(); 
char[] ch=c.toCharArray(); 
char[] dh=d.toCharArray(); 
char[] eh=e.toCharArray(); 
char[] fh=f.toCharArray(); 
char[] gh=g.toCharArray(); 
char[] hh=h.toCharArray(); 
System.out.print("The reverse string of "+a+" is ");
System.out.print("The reverse string of "+b+" is ");
System.out.print("The reverse string of "+c+" is ");
System.out.print("The reverse string of "+d+" is ");
System.out.print("The reverse string of "+e+" is ");
System.out.print("The reverse string of "+f+" is ");
System.out.print("The reverse string of "+g+" is ");
System.out.print("The reverse string of "+h+" is ");
int z=ah.length;
int y=bh.length;
int x=ch.length;
int w=dh.length;
int v=eh.length;
int u=fh.length;
int t=gh.length;
int s=hh.length;
for(int i=z;i>0;i--)
{System.out.print(ah[i-1]);}
System.out.println();
for(int j=y;j>0;j--)
{System.out.print(bh[j-1]);}
System.out.println();
for(int k=x;k>0;k--)
{System.out.print(ch[k-1]);}
System.out.println();
for(int l=w;l>0;l--)
{System.out.print(dh[l-1]);}
System.out.println();
for(int m=v;m>0;m--)
{System.out.print(eh[m-1]);}
System.out.println();
for(int n=u;n>0;n--)
{System.out.print(fh[n-1]);}
System.out.println();
for(int o=t;o>0;o--)
{System.out.print(gh[o-1]);}
System.out.println();
for(int p=s;p>0;p--)
{System.out.print(hh[p-1]);}
System.out.println();
}
}