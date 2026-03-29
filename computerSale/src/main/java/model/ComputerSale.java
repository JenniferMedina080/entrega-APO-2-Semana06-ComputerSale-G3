package model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ComputerSale {
    private Computer[] computer;

    public ComputerSale(Computer[] computers) {
        this.computer = computers;
    }

    public Computer[] getComputers() {
        return computer;
    }

    //ordenamiento por inserccion
    public void sortByBrand() {
        for (int i = 1; i < computer.length; i++) {
            Computer key = computer[i];
            int j = i - 1;
            while (j >= 0 && computer[j].compareTo(key) > 0) {
                computer[j + 1] = computer[j];
                j--;
            }
            computer[j + 1] = key;
        }

    }

    //ordenamiento por borbuja
    public void sortByProcessing() {
        int n = computer.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                double proc1 = computer[j].getProcessors() * computer[j].getProcessingSpeed();
                double proc2 = computer[j + 1].getProcessors() * computer[j + 1].getProcessingSpeed();
                if (proc1 > proc2) {
                    Computer temp = computer[j];
                    computer[j] = computer[j + 1];
                    computer[j + 1] = temp;
                }
            }
        }
    }

    public void sortByBrandAndOS() {
        Arrays.sort(computer, new BrandAndOSComparator());
    }

    public void sortByRam() {
        Arrays.sort(computer, new Comparator<Computer>() {
            @Override
            public int compare(Computer c1, Computer c2) {
                return Integer.compare(c1.getRam(), c2.getRam());
            }
        });
    }

    public void sortByBrandReverse() {
        Arrays.sort(computer, Comparator.reverseOrder());
    }

    // Generar arreglo de computadores aleatorios
    public static Computer[] generateRandomComputers(int c) {
        Random rand = new Random();
        Computer[] computers = new Computer[c];

        String[] marcas = {"Apple", "Dell", "HP", "Lenovo"};
        char[] sistemas = {'W', 'M', 'L'};

        for (int i = 0; i < c; i++) {
            String brand = marcas[rand.nextInt(4)];
            int ram = rand.nextInt(32) + 1;
            int processors = rand.nextInt(8) + 1;
            double processingSpeed = rand.nextInt(5) + 1;
            char operatingSystem = sistemas[rand.nextInt(3)];

            computers[i] = new Computer(brand, ram, processors, processingSpeed, operatingSystem);
        }
        return computers;
    }
}
