import java.util.Scanner;

public class Student_Details
{
    public static void main(String args[])
    {
  
        
        int i;
        float total=0, avg;
        Scanner s1 = new Scanner(System.in);
	System.out.println("Enter the id of the student:");	
        int stuid=s1.nextInt();
        System.out.println("Enter the name of the student:");
         String name = s1.nextLine();
        System.out.println("Enter the branch of the student:");
         String branch=s1.nextLine();
         System.out.println("Enter the year of study:");
         int year=s1.nextInt();

       int marks[] = new int[6];

        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = s1.nextInt();
           total = total + marks[i];
        }
        s1.close();
        
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}