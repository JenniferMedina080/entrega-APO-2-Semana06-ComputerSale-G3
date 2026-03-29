package model;
import java.util.Comparator;


public class BrandAndOSComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        int brandComparison = c1.getBrand().compareTo(c2.getBrand());
        if (brandComparison != 0) {
            return brandComparison;
        }
        return Character.compare(c1.getOperatingSystem(), c2.getOperatingSystem());
    }
}
