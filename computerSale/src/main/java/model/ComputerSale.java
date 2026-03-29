package model;

import java.util.Arrays;

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
    }

    public void sortByBrandReverse() {
    }

    // Generar arreglo de computadores aleatorios
    public static Computer[] generateRandomComputers(int c) {
        return null;
    }
}
