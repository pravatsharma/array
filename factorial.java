import java.util.Scanner;
class factorial
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the testcase:");
int t=sc.nextInt();

while(t>=0)
{
System.out.println("Enter the number:");
int N = sc.nextInt();
int facto = 1;
for(int i=1; i<=N; i++)
{
facto = facto*i;
}
System.out.println(facto);
t--;
}
}
}



 