package ui;

import java.util.Scanner;

import model.Controller;

public class Executable {

	private Scanner input;
	private Controller controller;

	public Executable() {

		input = new Scanner(System.in);
		controller = new Controller();
	}

	/**
	 * The main function creates an instance of the Executable class and calls its menu method.
	 */
	public static void main(String[] args) {

		Executable ejecutable = new Executable();
		ejecutable.menu();

	}
//|||||||||||||||||||||||||||||||||||MENUS||||||||||||||||||||||||||||||

	/**
	 * This function displays a menu with options for managing users, products, and uses, and allows the
	 * user to select an option or exit the menu.
	 */
	public void menu() {
		boolean indicator=false;
	
		while(!indicator){
			System.out.println("\nWelcome to TaskManager");
            System.out.println("||||||||||||||||||||||||||||||||||||||");
			System.out.println("Choose what would you like to do:");
			System.out.println("1. Store tasks and reminders");
			System.out.println("2. Change tasks priority");
			System.out.println("3. Undo");
			System.out.println("0. Exit");
			int option = input.nextInt();

			switch (option) {

				case 1:
                    storeTaskAndReminders();
				break;

				case 2:
					changeTaskPriority();
				break;

				case 3:
					undo();
				break;

                case 4:
                System.out.println("I missclicked sorry");
				break;

				case 0:
                System.out.println("Thanks for using TaskManager");
					indicator=true;
				break;


				default:
					System.out.println("Thats not an option!");
				break;
			}
		}
	}

    public void undo() {
        controller.undo();
    }

    public void changeTaskPriority() {
        controller.changeTaskPriority();
    }

    public void storeTaskAndReminders() {
        controller.storeTaskAndReminders();
    }
}
