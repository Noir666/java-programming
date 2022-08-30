class T
{

 static int f(int n)
 {
  if (n == 0)
  return 1;
   
  return n*f(n-1);
 }
  
 public static void main(String[] args)
 {
  int num = 6;
  System.out.println("Factorial of "+ num + " is " + f(6));
 }
}
