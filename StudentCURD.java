import java.util*

class Student
{
private int StudId;
private String StudName;
private String Dept;
	Student(int StudId,String StudName,String Dept)
	{
	this.StudId=StudId;
	this.StudName=StudName;
	this.Dept=Dept;
	}
public int getId()
{
return StudId;
}
public String getName()
{
return StudName;
}
public String getDepartment()
{
return Dept;
}
public String toString()
{
return StudId+" "+StudName+" "+Dept;
}

}

class StudentCURD
{
public static void main(String args[])
{
List<Student>stud=new ArrayList<Student>();
Scanner s=new Scanner(System.in);
Scanner s1=new Scanner(System.in);
int choice=s.nextInt();
System.out.println("Enter Your Choice:");
	do
	{
	System.out.println("1.INSERT");
	System.out.println("2.DISPLAY");
	System.out.println("3.SEARCH");
	System.out.println("4.DELETE");
	System.out.println("5.UPDATE");
	}
	
switch(choice)
{
case 1:
       System.out.println("Enter Your Id:");
       int studId=s.nextInt();
       System.out.println("Enter Your Name:");
       String studName=s1.nextLine();
       System.out.println("Enter Your DepartmentName:");
       String deptName=s1.nextLine();

Student stud=New Student();
stud.add(studId,studName,deptName);
System.out.println("Your Datas Entered Successfully!!!");
break;
}
while(choice!=5)

























