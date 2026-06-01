import java.util.Scanner;
public class bitwise_operator
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number:");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("the value of a is:"+(a&b));

System.out.println("the value of a is:"+(a|b));

System.out.println("the value of a is:"+(a^b));

}}