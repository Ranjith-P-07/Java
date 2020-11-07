import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AddressBook {

	
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.askUser();
	}

	/** Menu **/
	void askUser() {
		System.out.println("Select an action..");
		System.out.println("1. Add a person");
		System.out.println("2. Edit");
		System.out.println("3. Delete a person");
		System.out.println("4. Search a person");
		System.out.println("5. Quit");
		
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			addAPerson();
			System.out.println("\n");
			askUser();
			break;
		case 2:
			System.out.print("Enter first and last name of the person to edit the contact: ");
			commonPart(choice);
			System.out.println("\n");
			askUser();
			break;
		case 3:
			System.out.print("Enter first and last name of the person to delete the contact: ");
			commonPart(choice);
			System.out.println("\n");
			askUser();
			break;
		case 4:
			System.out.print("Enter first and last name of the person to search: ");
			commonPart(choice);
			System.out.println("\n");
			askUser();
			break;
		default:
			break;
		}
	}

	/** gets user's info **/
	void addAPerson() {
		System.out.print("Enter first and last name: ");
		String firstName = scanner.next();
		String lastName = scanner.next();
		
		System.out.print("Enter complete address: ");
		scanner.nextLine();
		String address = scanner.nextLine();
		
		System.out.print("Enter city, state and zip: ");
		String city = scanner.next();
		String state = scanner.next();
		String zip = scanner.next();
		
		System.out.println("Enter phone number: ");
		String phoneNumber = scanner.next();
		
		Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
		JSONObject jsonObject = person.toJsonObject();
		
		writeBook(jsonObject);
	}
