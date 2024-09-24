class Animals
{
	public void eat()
	{
	System.out.println("Eating");
	}
}

class Elephant extends Animals
{
	public void wild()
	{
	System.out.println("Is a Wild Animal");
	}

}

class Inheritance
{
public static void main(String args[])
{

Elephant el=new Elephant();
el.eat();
el.wild();
}
}
