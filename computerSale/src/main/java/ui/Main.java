package ui;

import model.Computer;
import model.ComputerSale;

public class Main {

    public static void printArray(Computer[] cs) {
        for (Computer c : cs) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Computer[] computers = ComputerSale.generateRandomComputers(100);
        ComputerSale sale = new ComputerSale(computers);

        sale.sortByBrand();
        System.out.println("Por Brand ");
        printArray(sale.getComputers());

        sale.sortByProcessing();
        System.out.println("Por Procesamiento");
        printArray(sale.getComputers());

        sale.sortByBrandAndOS();
        System.out.println("Por Brand y OS ");
        printArray(sale.getComputers());

        sale.sortByRam();
        System.out.println(" Por RAM ");
        printArray(sale.getComputers());

        sale.sortByBrandReverse();
        System.out.println("Por Brand Inversp ");
        printArray(sale.getComputers());
    }
}