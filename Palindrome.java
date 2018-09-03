# palindrome
import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
int a=0,temp,n,input;
System.out.println("enter any integer");
Scanner sc=new Scanner(System.in);
input=sc.nextInt();
temp=input;
while(input>0)
{
n=x%10;
a=a*10+n;
input=input/10;
}
if(a==temp)
{
System.out.println("the given number is palindrome");
}
else
{
System.out.println("the given number is palindrome");
}
}
}
