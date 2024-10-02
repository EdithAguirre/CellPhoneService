/*
An application that manages cell phones.
 */
package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // Create a new instance of a CellPhone
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        // Prompt the user for the cell phone information and set values
        obtainPhoneInfo(cellPhone1);
        obtainPhoneInfo(cellPhone2);

//        // Exercise 1: Print properties of the phone to the screen
//        System.out.println("Phone properties: ");
//        System.out.println("Serial number: " + cellPhone1.getSerialNumber());
//        System.out.println("Model: " + cellPhone1.getModel());
//        System.out.println("Carrier: " + cellPhone1.getCarrier());
//        System.out.println("Phone number: " + cellPhone1.getPhoneNumber());
//        System.out.println("Owner: " + cellPhone1.getOwner());

        // Call the display method passing it cellPhone1 and cellPhone2
        display(cellPhone1);
        display(cellPhone2);

        // Makes your first cell phone dial your second one
        cellPhone1.dial( cellPhone2.getPhoneNumber() );
        // Makes your second cell phone dial your first one
        cellPhone2.dial( cellPhone1.getPhoneNumber() );
    }

    // Method to prompt the user for the cell phone information and set values
    public static void obtainPhoneInfo(CellPhone phone){
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input cell phone information:");

        System.out.print("What is the serial number? ");
        phone.setSerialNumber(scanner.nextInt());
        // Catch the new line character
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        phone.setModel(scanner.nextLine());

        System.out.print("What is the carrier? ");
        phone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.print("What is the owner of the phone? ");
        phone.setOwner(scanner.nextLine());
        // New line to make space
        System.out.println(" ");
    }

    // Display method displays the properties of a cell phone
    public static void display(CellPhone phone){
        System.out.println("Phone properties: ");
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner() + "\n");
    }
}