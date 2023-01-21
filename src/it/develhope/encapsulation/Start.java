package it.develhope.encapsulation;

import it.develhope.encapsulation.entities.House;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the number of floors of The House:");
        house.setFloorsNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Now the Address of this House:");
        house.setAddress(scanner.nextLine());

        System.out.println("Write the residents name separated by a comma (,)");
        house.setResidentsNames(scanner.nextLine().split(","));
        scanner.close();

        System.out.println(String.format("Your address is %s and the build is of %d floors.\nThe residents are: %s",
                house.getAddress(), house.getFloorsNumber(), String.join(", ", house.getResidentsNames())));

    }
}

