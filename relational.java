import java.util.Scanner;
public class relational
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("a>b" + (a>b) + "\r\n" + "a<b" + (a<b) + "\r\n" + "a==b" + (a==b));
}}