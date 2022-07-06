package com.bridgelabz;

import java.util.Scanner;
/*
 * @author: Nikhil Deshmukh
 * Ability to edit existing contact person using their
 */
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();
        addressBook.editContact();
    }
}