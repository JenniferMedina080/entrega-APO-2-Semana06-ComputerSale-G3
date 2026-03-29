package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {

    private Computer computer;

    public void setupStage1() {
        computer = new Computer("Apple", 16, 4, 3.0, 'W');
    }

    @Test
    public void compareToMenorTest() {
        // Arrange
        setupStage1();
        Computer otro = new Computer("Dell", 8, 2, 2.0, 'M');
        // Act
        int resultado = computer.compareTo(otro);
        // Assert
        assertTrue(resultado < 0); // Apple va antes que Dell
    }

    @Test
    public void compareToMayorTest() {
        // Arrange
        setupStage1();
        Computer otro = new Computer("Acer", 8, 2, 2.0, 'M');

        // Act
        int resultado = computer.compareTo(otro);

        // Assert
        assertTrue(resultado > 0); // Apple va después que Acer
    }

    @Test
    public void compareToIgualTest() {
        // Arrange
        setupStage1();
        Computer otro = new Computer("Apple", 32, 8, 5.0, 'L');
        // Act
        int resultado = computer.compareTo(otro);
        // Assert
        assertEquals(0, resultado); // misma marca, resultado es 0
    }

    @Test
    public void toStringTest() {
        // Arrange
        setupStage1();
        // Act
        String resultado = computer.toString();
        // Assert
        assertEquals("Computer{brand=Apple, ram=16, processors=4, processingSpeed=3.0, operatingSystem=W}", resultado);
    }
}