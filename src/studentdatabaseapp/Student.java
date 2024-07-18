package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;


    //Constructor: prompt user to enter student's name and year

    public Student(){

        Scanner in = new Scanner(System.in);

        //this will prompt the user to enter the student's first name
        System.out.println("Enter Students first name: ");
        this.firstName = in.nextLine();

        //this will prompt the user to enter the student's last name

        System.out.println("Enter Students last name: ");
        this.lastName = in.nextLine();

        //this will prompt the user to enter the student's grade year
        System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Students class level:");
        this.gradeYear = in.nextInt();

        System.out.println(firstName + " " + lastName + " "+" you are in grade" + " " + gradeYear);
    }

    //generate an ID

    //Enroll in courses

    //View balance

    //Pay tuition

    //Show status of students (name, ID, courses enrolled, balance, and status)
}
