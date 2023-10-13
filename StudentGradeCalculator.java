package Npackage;
import java.util.Scanner;

public class StudentGradeCalculator{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = sc.nextInt();

	        int[] subjectMarks = new int[numSubjects];
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
	            subjectMarks[i] = sc.nextInt();
	        }
	        int totalMarks = 0;
	        for (int marks : subjectMarks) {
	            totalMarks += marks;
	        }
	        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
	        
	        char grade;
	        if (averagePercentage >= 90) {
	            grade = 'A';
	        } else if (averagePercentage >= 80) {
	            grade = 'B';
	        } else if (averagePercentage >= 70) {
	            grade = 'C';
	        } else if (averagePercentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + String.format("%.2f%%", averagePercentage));
	        System.out.println("Grade: " + grade);

	      sc.close();
	    }
	}



