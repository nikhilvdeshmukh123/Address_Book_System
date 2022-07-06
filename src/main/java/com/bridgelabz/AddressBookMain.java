package com.bridgelabz;

import java.util.Scanner;

/*
 * @author: Nikhil Deshmukh
 * Ability to delete a person using person's name - Use Console to delete a person
 */
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();

        //Chose option to edit or delete contact
        System.out.println("Enter E to edit contact");
        System.out.println("Enter D to delete contact");
        //user input
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        // If user Choose E to edit contact
        if (input.equals("e") || input.equals("E")) {
            addressBook.editContact();
            // If user Choose D to edit contact
        } else if (input.equals("d") || input.equals("D")) {
            addressBook.deleteContact();
        } else {
            System.out.println("Thank You");
        }
    }
}