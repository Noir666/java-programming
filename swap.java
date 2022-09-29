class Good
{
static void swap(int m,  int n)
{
int temp =  m;
m =  n;
n = temp;
System.out.println("the value of m"+ m +" and the value of n is "+ n);
}
public static void main(String[] args)
{
int m=10, n=29;
swap(m, n);
}
}