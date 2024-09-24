import java.util.*;
class Calculator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ch;

	do
	{
	System.out.println("Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");

System.out.println("Enter Your Choice:");
ch=sc.nextInt();

if(ch>=1 && ch<=4)
{
System.out.println("Enter Two Values:");
int num1=sc.nextInt();
int num2=sc.nextInt();

  switch(ch)
  {
  case 1:
	int sum=num1+num2;
	System.out.println("SUM="+sum);
	break;
  case 2:
	int diff=num1-num2;
	System.out.println("Difference="+diff);
	break;
  case 3:
	int mul=num1*num2;
	System.out.println("Product="+mul);
	break;
  case 4:
	if(num2==0)
	{
	System.out.println("Divisible by Zero is not Possible!!");
	}
	else
	{
	int quotient=num1/num2;
	System.out.println("Quotient="+quotient);
	}
	break;
  case 5:
	System.out.println("Exit");
        break;
 }
 }
else if(ch!=5)
{
System.out.println("Invalid Input!!");
}
}
	while(ch!=5);
System.out.println("Exit");
}
}




