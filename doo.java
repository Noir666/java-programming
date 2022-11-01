import java.util.Scanner;
 class doo {
 public static void main(String[] args) {
System.out.print("Enter the number :");
 Scanner sc=new Scanner(System.in);
 int n = sc.nextInt();
 int a, b;
 for (a = 0; a <= n; a++) {
 for (b = 1; b <= a; b++) {
 System.out.print("*");}
 System.out.println();}
}
}