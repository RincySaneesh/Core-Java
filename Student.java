class Student
{
String studName;
int rollNo;
Subject[] subs=new Subject[3];
}

class Subject
{
String subName;
int mark;
}

class StudentDetail
{
public static void main(String args[])
{
Student stud=new Student();
stud.studName="Rincy";
stud.rollNo=26;

Subject sub1=new Subject();
sub1.subName="English";
sub1.mark=20;

Subject sub2=new Subject();
sub2.subName="Maths";
sub2.mark=30;

Subject sub3=new Subject();
sub3.subName="Chemistry";
sub3.mark=60;

stud.subs={sub1,sub2,sub3};
 
   public void getDetails()
   {
    System.out.println("Student Name: " + studName\n"Roll No: " + rollNo\n"Subjects and Marks:");
        
        for (int i = 0; i < subs.length; i++)
	{
        System.out.println("Subject: " + subs[i].subName + ", Marks: " + subs[i].mark);
	}
  }


}
}