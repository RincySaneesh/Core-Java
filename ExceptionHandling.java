class ExceptionHandling
{
public static void main(String args[])
{
int a=100;
int b=0;
int c;
	try
	{
	 c=a/b;
	}
  catch(Exception e)
 {
  System.out.println(e);
 }
System.out.println("Divided by Zero");
}
}