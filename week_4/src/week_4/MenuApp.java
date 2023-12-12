package week_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MenuApp {

	static Scanner scanner = new Scanner(System.in);
	static List<String> students = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		while (choice != -1) {
			
			showMenu();
			
			choice = getUserChoice();
			if(choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
				break;
			} else {
				System.out.println("Invalid Choice.");
			}
		}
	}
	
	public static void showMenu() {
		
		System.out.println("\n1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit");
		System.out.println("----------------------");
	}
	
	public static int getUserChoice() {
		
		return scanner.nextInt();
	}
	
	public static void printStudentNames() {
		
		for (String student : students) {
			System.out.println(student);
		}
	}
	
	public static void addNewStudent() {
		
		System.out.print("Enter the name of student to add: ");
		
		String name = scanner.next();
		students.add(name);
		
		System.out.println("Student added: " + name);
	}
	
	public static void deleteStudent() {
		
		System.out.print("Enter index of student to delete: ");
		
		int id = getUserChoice();
		if (id < students.size()) {
			students.remove(id);
		} else {
			System.out.println("Not a valid student.");
		}
	}

}
