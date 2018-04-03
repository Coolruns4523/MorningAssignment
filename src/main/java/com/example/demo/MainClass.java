package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s;
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 1; i < 5; i++) {

            s = new Student();
            System.out.println("Enter your Course Number: ");
            s.setCourseNumber(scan.nextLine());

            System.out.println("Enter your Course Name: ");
            s.setCourseName(scan.nextLine());

            System.out.println("Enter the Room Number: ");
            s.setRoomNumber(scan.nextLine());

            System.out.println("Enter the semester: ");
            s.setSemester(scan.nextLine());

            System.out.println("Enter the Year");
            s.setYear(scan.nextLine());

            students.add(s);

            for(Student eachStudent:students)
            {
                System.out.println(eachStudent.getCourseNumber());
                System.out.println(eachStudent.toString());
                System.out.println(eachStudent.getCourseName());
                System.out.println(eachStudent.toString());
                System.out.println(eachStudent.getRoomNumber());
                System.out.println(eachStudent.toString());
                System.out.println(eachStudent.getSemester());
                System.out.println(eachStudent.toString());
                System.out.println(eachStudent.getYear());
                System.out.println(eachStudent.toString());


                System.out.println("The course that you entered is full");
                System.out.println("Can I call you Brandon?");
                System.out.println();


                Boolean stop = false;
            String color;

            do {
                System.out.println("Whould you like to guees my favorite color?");
                color = scan.nextLine();

                if (color.equalsIgnoreCase("blue")) {
                    stop = true;
                }
                else {
                    stop = false;
                }
                }

                while (!stop);

//                while (stop){
                    System.out.println("Yup! Blue is my favorite color too.");

//            }

        }

       }
    }
}