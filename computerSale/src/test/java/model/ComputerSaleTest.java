package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerSaleTest {

    private ComputerSale sale;

    public void setupStage1() {
        Computer[] computers = {
                new Computer("HP", 16, 4, 3.0, 'W'),
                new Computer("Apple", 8, 2, 2.0, 'M'),
                new Computer("Dell", 32, 8, 5.0, 'L'),
                new Computer("Lenovo", 4, 1, 1.0, 'W'),
                new Computer("Asus", 16, 6, 4.0, 'M')
        };
        sale = new ComputerSale(computers);
    }

    @Test
    public void sortByBrandTest() {
        // Arrange
        setupStage1();
        // Act
        sale.sortByBrand();
        // Assert
        assertEquals("Apple", sale.getComputers()[0].getBrand());
        assertEquals("Lenovo", sale.getComputers()[4].getBrand());
    }

    @Test
    public void sortByProcessingTest() {
        // Arrange
        setupStage1();
        // Act
        sale.sortByProcessing();
        // Assert
        assertEquals("Lenovo", sale.getComputers()[0].getBrand());
        assertEquals("Dell", sale.getComputers()[4].getBrand());
    }

    @Test
    public void sortByBrandAndOSTest() {
        // Arrangr
        setupStage1();
        // Act
        sale.sortByBrandAndOS();
        // Assert
        assertEquals("Apple", sale.getComputers()[0].getBrand());
        assertEquals("Lenovo", sale.getComputers()[4].getBrand());
    }

    @Test
    public void sortByRamTest() {
        // Arrange
        setupStage1();
        // Act
        sale.sortByRam();
        // Assert
        assertEquals(4, sale.getComputers()[0].getRam());
        assertEquals(32, sale.getComputers()[4].getRam());
    }

    @Test
    public void sortByBrandReverseTest() {
        // Arrange
        setupStage1();
        // Act
        sale.sortByBrandReverse();
        // Assert
        assertEquals("Lenovo", sale.getComputers()[0].getBrand());
        assertEquals("Apple", sale.getComputers()[4].getBrand());
    }

    @Test
    public void generateRandomComputersTest() {
        // Arrange
        int cantidad = 100;
        // Act
        Computer[] computers = ComputerSale.generateRandomComputers(cantidad);

        // Assert
        assertEquals(100, computers.length);
        assertTrue(computers[0] instanceof Computer);
    }
}