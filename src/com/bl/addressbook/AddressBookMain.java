package com.bl.addressbook;

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
		userInterface.print(contactStore.getContactList());
	}
}