package com.bl.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to AddressBook Program");

		AddressBook contact = new AddressBook();
		contact.setFirstName("Akshay");
		contact.setLastName("Dighe");
		contact.setAddress("At post mahud b.k tal-sangola dist-solapur pin-413306");
		contact.setCity("Solapur");
		contact.setState("Maharashtra");
		contact.setZip("413306");
		contact.setPhoneNumber("8600198664");
		contact.setEmail("digheakshay21@gmail.com");

		ContactStore contactStore = new ContactStore();
		contactStore.add(contact);

		UserInterface userInterface = new UserInterface();
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println(
					"Enter choice 1.Add the new contact\n 2.Edit Existing contact\n 3.Remove the Contact\n 4.exit");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1 -> {
				AddressBook newContact = new AddressBook();
				userInterface.enterDetails(newContact);
				contactStore.add(newContact);
				System.out.println("Contact List after add");
				userInterface.print(contactStore.getContactList());
			}
			case 2 -> {
				contactStore.edit();
				System.out.println("Contact List after edit");
				userInterface.print(contactStore.getContactList());
			}
			case 3 -> {
				contactStore.remove();
				System.out.println("Contact List after deletion");
				userInterface.print(contactStore.getContactList());
			}
			case 4 -> check = false;
			}
		}
	}
}