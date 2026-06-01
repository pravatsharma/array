import java.util.Scanner;
public class and_operator
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter your marks:");
int a = sc.nextInt();
System.out.print("Enter your age:");
int b = sc.nextInt();
System.out.print((a>50) && (b>18));
}}