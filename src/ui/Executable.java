package ui;

import java.util.*;

import model.Controller;

public class Executable {

	private final Scanner input;
	private final Controller controller;

	public Executable() {

		input = new Scanner(System.in);
		controller = new Controller();
	}

	/**
	 * The main function creates an instance of the Executable class and calls its
	 * menu method.
	 */
	public static void main(String[] args) {
		Executable ejecutable = new Executable();
		ejecutable.menu();
	}
	// |||||||||||||||||||||||||||||||||||MENUS||||||||||||||||||||||||||||||

	/**
	 * This function displays a menu with options for managing users, products, and
	 * uses, and allows the
	 * user to select an option or exit the menu.
	 * 
	 */

	public void menu() {
		boolean indicator = false;
		int option = 10;

		while (!indicator) {
			System.out.println("\nWelcome to TaskManager");
			System.out.println("||||||||||||||||||||||||||||||||||||||");
			System.out.println("Choose what would you like to do:");
			System.out.println("1. Manage tasks");
			System.out.println("2. View tasks");
			System.out.println("3. Undo");
			System.out.println("10. testing");

			System.out.println("0. Exit");

			try {
				option = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("An character was entered instead of an int");
				System.exit(0);
			}

			switch (option) {

				case 1:
					menuManageTasks();
					break;

				case 2:
					menuViewTask();
					break;

				case 3:
					undo();
					break;

				case 10:
					System.out.println("Test cases created");
					controller.testing();
					break;

				case 0:
					System.out.println("Thanks for using TaskManager");
					indicator = true;
					break;

				default:
					System.out.println("Thats not an option!");
					break;
			}
		}
	}

	public void menuViewTask(){
		boolean indicator = false;
		int option=0;

		while (!indicator) {
			System.out.println("Choose what would you like to do:");
			System.out.println("1. view all tasks");
			System.out.println("2. view common tasks");
			System.out.println("3. view priority tasks");
			System.out.println("0. Exit");

			try {
				option = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("An character was entered instead of an int");
				System.exit(0);
			}

			switch (option) {

				case 1:
					System.out.println(controller.printAllTasks());
					break;
				case 2:
					System.out.println(controller.printCommonTasks());
					break;

				case 3:
					System.out.println(controller.printPriorityTasks());
					break;
					
				default:
					System.out.println("Thats not an option!");
				break;
			}
		}
	}

	public void menuManageTasks() {
		boolean indicator = false;
		int option = 10;

		while (!indicator) {
			System.out.println("\nWelcome to TaskManager");
			System.out.println("||||||||||||||||||||||||||||||||||||||");
			System.out.println("Choose what would you like to do:");
			System.out.println("1. Store tasks and reminders");
			System.out.println("2. Change tasks priority");
			System.out.println("3. Check tasks");

			System.out.println("0. Exit");

			try {
				option = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("An character was entered instead of an int");
				System.exit(0);
			}

			switch (option) {

				case 1:
					storeTasks();
					break;

				case 2:
					changeTaskPriority();
					break;

				case 3:
					checkTask();
					break;

				case 0:
					System.out.println("Thanks for using TaskManager");
					indicator = true;
					break;

				default:
					System.out.println("Thats not an option!");
					break;
			}
		}
	}

	public void undo() {
		// buffer cleanse
		input.nextLine();
		controller.undo();
	}

	public void changeTaskPriority() {
		// buffer cleanse
		input.nextLine();

		System.out.println(	controller.printPriorityTasks());
		System.out.println("Choose wich task you want to chane the priority by title");
		String tittleSearch="";
		tittleSearch = input.nextLine();



		controller.changeTaskPriority();
	}

	public void checkTask(){
		// buffer cleanse
		input.nextLine();

		System.out.println(	controller.printAllTasks());
		System.out.println("Choose wich task you want to Check by title");
		String tittleSearch="";
		tittleSearch = input.nextLine();

		


	}

	public void storeTasks() {
		// buffer cleanse
		input.nextLine();
		String title, description, priority="N";
		String limitDate="00/00/00";
		int priorityLvl=0;
		
		System.out.println("Please enter your Task Title");
		title = input.nextLine();

		System.out.println("Please enter your Task Description");
		description = input.nextLine();

		System.out.println("Please enter your limit date dd/mm/yy");
		limitDate = input.nextLine();
		// useless String because of changes in the integrator proyect

		System.out.println("Please enter if your task has priority or not: Y/N(Default N)");
		
		priority = input.nextLine().toUpperCase();
		
		
		if(priority.equals("Y")){
			System.out.println("Please enter your priority from zero to 100(zero its the lowest and default)");
		try {
			priorityLvl = input.nextInt();

			if(priorityLvl >100 || priorityLvl<0){
				priorityLvl=0;
				System.out.println("Since the value was invalid it was set as default(zero)");

			}
		} catch (InputMismatchException e) {
			System.out.println("An character was entered instead of an int");
			priorityLvl=0;
			System.out.println("Since the value was invalid it was set as default(zero)");
		}
		}

		try {
			controller.storeTasks(title,description,limitDate,priority,priorityLvl);
		} catch (Exception e) {
			System.out.println("It wasn't possible to to add a new task");
		}

	}
}
