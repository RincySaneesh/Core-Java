class Parent
 {
 public void property()
 {
 System.out.println("cash+land+gold");
 }
 public void marry()
 {
   System.out.println("subbalakshmi");

 }
}
class Child extends Parent
{ 
public void marry()
 {
System.out.println("3sha/4me/9tara/anushka");

}
}
 class Overridding
 {
 public static void main(String[] args)
{
Parent p=new Parent();
 p.marry();
Child c=new Child();
c.marry();
Parent p1=new Child();
p1.marry();
 }
}
