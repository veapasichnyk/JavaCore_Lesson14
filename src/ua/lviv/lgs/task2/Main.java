package ua.lviv.lgs.task2;

import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println();
        System.out.println("Enter 1 to add the goods to the store \nEnter 2 to remove the goods from the store " +
                           "\nEnter 3 to replace the goods in the store \nEnter 4 to sort the goods by their name" +
                           "\nEnter 5 to sort the goods by their length \nEnter 6 to sort the goods by their width" +
                           "\nEnter 7 to sort the goods by their weight \nEnter 8 to display the goods by its serial " +
                           "number \nEnter 9 to exit the program");
    }

    public static void main(String[] args) {

        Store   store   = new Store ();
        Scanner scanner = new Scanner( System.in);

        while (true) {
            menu();

            switch (scanner.nextInt()) {

                case 1: {
                    store.addCommodity();
                    break;
                }

                case 2: {
                    store.removeCommodity();
                    break;
                }

                case 3: {
                    store.replaceGoods ();
                    break;
                }

                case 4: {
                    store.sortByName();
                    break;
                }

                case 5: {
                    store.sortByLength();
                    break;
                }

                case 6: {
                    store.sortByWidth();
                    break;
                }

                case 7: {
                    store.sortByWeight();
                    break;
                }

                case 8: {
                    store.getCommodity();
                    break;
                }

                case 9: {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("Enter a number from 1 to 9.");
                    break;
                }
            }
        }

    }

}
