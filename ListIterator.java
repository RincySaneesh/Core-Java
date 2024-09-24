import java.util.*;
class ListIterator
{
public static void main(String[] args)
{

LinkedList l=new LinkedList();

l.add("balakrishna");
l.add("venki");
l.add("chiru");
l.add("nag");
System.out.println(l);

ListIterator itr=l.listIterator();

	while(itr.hasNext())
	{
	String s=(String)itr.next();
	if(s.equals("venki"))
	{
	itr.remove();
	}
	}
       System.out.println(l);
switch()
{
Case 1:
       if(s.equals("chiru"))
       {
       itr.set("chran");
       }
      break;
Case 2:
      if(s.equals("nag"))
      {
      itr.add("chitu");
      }
      break;
}
}
