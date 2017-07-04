# Gcd
import java.io.*;
import java.util.*;
public class Gcd
{
public static void main(String args[])throws IOException
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number n1:");
int n1=s.nextInt();
System.out.println("Enter the number n2:");
int n2=s.nextInt();
int a;
while(n2!=0)
{
a=n1%n2;
n1=n2;
n2=a;
}
System.out.println(n1);
}
}
