package com.bridgelabz;

import java.util.Scanner;
/*
 * @author: Nikhil Deshmukh
 * Ability to create a Contacts in Address Book with first and last names, address,
 * city, state, zip, phone number and email...
 */
public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
    }
}