package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\Korisnik\\Desktop\\Global-University-Students\\Global_University_Students.csv";

        File file = new File(path);

        Scanner input = new Scanner(file);
        Scanner reader = new Scanner(System.in);

        String[] students;
        BinarySearchTree bst = new BinarySearchTree();

        int i = 0;
        while (input.hasNextLine() && i < 1000000) {

            String data = input.nextLine();
            students = data.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            int studentID = Integer.parseInt(students[0]);
            int studentYearOfEnrolment = Integer.parseInt(students[6]);
            Student student = new Student(studentID, students[1], students[2], students[3], students[4], students[5], studentYearOfEnrolment);
            bst.put(studentID, student);
            i++;

        }
        input.close();

        System.out.println("Enter the ID of the student you want to look up: ");
        int lookUpID = reader.nextInt();
        Student lookUpStudent =(Student) bst.get(lookUpID);
        if(lookUpStudent!= null) {
            System.out.println("Student ID: " + lookUpStudent.getStudentID());
            System.out.println("Name and surname: " + lookUpStudent.getStudentName());
            System.out.println("Date of birth: " + lookUpStudent.getStudentDateOfBirth());
            System.out.println("University: " + lookUpStudent.getUniversityName());
            System.out.println("Department code: " + lookUpStudent.getDepartmentCode());
            System.out.println("Department: " + lookUpStudent.getDepartmentName());
            System.out.println("Year of enrolment: " + lookUpStudent.getStudentYearOfEnrolment() + "\n");
            System.out.println("The student was retrieved from BST in " + bst.getSteps() + " steps.");
        } else{
            System.out.println("The student with the given ID does not exist.\n");
            System.out.println("The search was completed in " + bst.getSteps() + " steps.");
        }
        traversalOverTree(bst);
    }

    public static void traversalOverTree(BinarySearchTree bst){
        Scanner input = new Scanner(System.in);

        System.out.println("Select a traversal algorithm: ");
        System.out.println("[1] inorder");
        System.out.println("[2] preorder");
        System.out.println("[3] postorder");
        int traversalAlgorithm = input.nextInt();

        if(traversalAlgorithm == 1){
            System.out.println("How many elements do you want to print out?");
            int numOfElements = input.nextInt();
            bst.inorderSpecific(numOfElements);

        } else if(traversalAlgorithm == 2){
            System.out.println("How many elements do you want to print out?");
            int numOfElements = input.nextInt();
            bst.preorderSpecific(numOfElements);

        } else if(traversalAlgorithm == 3){
            System.out.println("How many elements do you want to print out?");
            int numOfElements = input.nextInt();
            bst.postorderSpecific(numOfElements);

        } else{
            System.out.println("You have selected invalid algorithm. Try Again!");
        }
    }
}
