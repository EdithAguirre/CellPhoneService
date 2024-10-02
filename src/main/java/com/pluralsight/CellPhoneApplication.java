/*
An application that manages cell phones.
 */
package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Create a new instance of a CellPhone
        CellPhone cellphone1 = new CellPhone();

        // Prompt the user for the cell phone information and set values
        System.out.print("What is the serial number? ");
        cellphone1.setSerialNumber(scanner.nextInt());
        // Catch the new line character
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellphone1.setModel(scanner.nextLine());

        System.out.print("What is the carrier? ");
        cellphone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellphone1.setPhoneNumber(scanner.nextLine());

        System.out.print("What is the owner of the phone? ");
        cellphone1.setOwner(scanner.nextLine());

        // Print properties of the phone to the screen
        System.out.println("Phone properties: ");
        System.out.println("Serial number: " + cellphone1.getSerialNumber());
        System.out.println("Model: " + cellphone1.getModel());
        System.out.println("Carrier: " + cellphone1.getCarrier());
        System.out.println("Phone number: " + cellphone1.getPhoneNumber());
        System.out.println("Owner: " + cellphone1.getOwner());
    }
}
