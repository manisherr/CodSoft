import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
            Scanner sc  =new Scanner(System.in);
            System.out.println("Enter English Marks out of 100");
            int english=sc.nextInt();
            System.out.println("Enter Hindi Marks out of 100");
            int hindi=sc.nextInt();
            System.out.println("Enter Physics Marks out of 100");
            int physics=sc.nextInt();
            System.out.println("Enter Chemistry Marks out of 100");
            int chemistry=sc.nextInt();
            System.out.println("Enter Maths Marks out of 100");
            int math=sc.nextInt();
            int sum = english+hindi+physics+chemistry+math;
            float avg=sum/5;
            String grade;
            if(avg>=90){
                grade="A++";
            }
            else if(avg>=80 && avg<90){
                grade="A+";
            }
            else if(avg>=70 && avg<80){
                grade="A";
            }
            else if(avg>=60 && avg<70){
                grade="B+";
            }
            else if(avg>=50 && avg<60){
                grade="B";
            }
            else if(avg>=40 && avg<50){
                grade="C+";
            }
            else if(avg>=30 && avg<40){
                grade="C";
            }
            else if(avg>=20 && avg<30){
                grade="D";
            }
            else{
                grade="Fail";
            }
            System.out.println("Average Percentage : "+avg+"%");
            System.out.println("Total Marks : "+sum);
            System.out.println("Grade : "+grade);
    }
}