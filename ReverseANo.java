public class ReverseANo   
{  
public static void main(String[] args)   
{  
int number = 123;
int reverse = 0;  
 
for(;number != 0; number=number/10)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
}  
System.out.println("Reverse of the number is: " + reverse);  
}  
}  