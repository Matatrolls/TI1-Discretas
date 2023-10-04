package ui;

import java.util.Scanner;

import model.*;

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

		/*Executable ejecutable = new Executable();
		ejecutable.menu();*/
		IHashTable<ObjetoPrueba, ObjetoPrueba> hash = new HashTable<>(10);

		ObjetoPrueba obj1 = new ObjetoPrueba("Luis", 22);
		ObjetoPrueba obj2 = new ObjetoPrueba("San", 23);
		ObjetoPrueba obj3 = new ObjetoPrueba("Gregorio", 24);
		ObjetoPrueba obj4 = new ObjetoPrueba("Magno", 25);
		ObjetoPrueba obj5 = new ObjetoPrueba("Juan", 26);
		ObjetoPrueba obj6 = new ObjetoPrueba("camilo", 27);
		ObjetoPrueba obj7 = new ObjetoPrueba("corrales", 28);
		ObjetoPrueba obj8 = new ObjetoPrueba("osvath", 29);
		ObjetoPrueba obj9 = new ObjetoPrueba("el", 30);
		ObjetoPrueba obj10 = new ObjetoPrueba("profe", 31);


		System.out.println(hash.add(obj1, obj1));
		hash.add(obj2, obj2);
		hash.add(obj3, obj3);
		hash.add(obj4, obj4);
		hash.add(obj5, obj5);
		hash.add(obj6, obj6);
		System.out.println(hash.add(obj7, obj7));
		hash.add(obj8, obj8);
		hash.add(obj9, obj9);
		hash.add(obj10, obj10);
		ObjetoPrueba obj11 = new ObjetoPrueba("Hola mundo, este es un nombre intencionalemnte muy largo", 31);
		hash.add(obj11, obj11);
		System.out.println("borrando con la key del elemento 11 (1ra vez): " + hash.delete(obj11));
		System.out.println("borrando el elemento 11 por segunda vez : "+ hash.delete(obj11));
		System.out.println("borrando el elemento 11 por tercera vez : "+ hash.delete(obj11));
		System.out.println("borrando el elemento 8: " + hash.delete(obj8));
		System.out.println("borrando el elemento 8 (2): " + hash.delete(obj8));


	}
//|||||||||||||||||||||||||||||||||||MENUS||||||||||||||||||||||||||||||

	/**
	 * This function displays a menu with options for managing users, products, and uses, and allows the
	 * user to select an option or exit the menu.
	 */
	/*
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
	}*/
/*
    public void undo() {
        controller.undo();
    }

    public void changeTaskPriority() {
        controller.changeTaskPriority();
    }

    public void storeTaskAndReminders() {
        controller.storeTaskAndReminders();
    }*/
}
