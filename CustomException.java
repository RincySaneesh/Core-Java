class CheckEvenOrOdd extends Exception
{
public CheckEvenOrOdd(String message)
{
super(message);
}
}

class CustomException
{

public static void main(String args[])
{

int n=5;
	try
	{
	if(n%2==0)
	{
	throw new CheckEvenOrOdd("The No.Is Even");
	}
 	else
	{ 
        System.out.println("The no.is Odd");
	}


}
	
catch(CheckEvenOrOdd e)
{
System.out.println(e.getMessage());
}
}
}