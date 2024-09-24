import java.util.*;
class Student
{
String studName;
int rollNo;
Subject[] subs=new Subject[3];

public void getDetails()
   {
        System.out.println("Student Name:"+studName);
        System.out.println("Roll No:"+rollNo);
        System.out.println("Subjects and Marks:");

        for (int i=0;i<subs.length;i++)
	{
        System.out.println("Subject:"+ subs[i].subName + ", Marks:"+ subs[i].mark);
	}
  }

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

ArrayList<Student>studList=new ArrayList<>();

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

stud.subs[0] = sub1;
stud.subs[1] = sub2;
stud.subs[2] = sub3;

Student stud1=new Student();
stud1.studName="Thomas";
stud1.rollNo=03;

Subject sub4=new Subject();
sub4.subName="Hindi";
sub4.mark=40;

Subject sub5=new Subject();
sub5.subName="Malayalam";
sub5.mark=30;

Subject sub6=new Subject();
sub6.subName="Biology";
sub6.mark=50;

stud1.subs[0] = sub4;
stud1.subs[1] = sub5;
stud1.subs[2] = sub6;


studList.add(stud);
studList.add(stud1);

for(Student student:studList)
{
student.getDetails();
}
}
}