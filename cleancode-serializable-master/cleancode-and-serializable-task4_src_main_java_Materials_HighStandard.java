package Materials;

import java.util.Scanner;

public class HighStandard implements CalculateCost {
    Scanner sc = new Scanner(System.in);

    public double calculatecost(double area) {
        System.out.append("Enter automation: if full --> enter full\n");
        String standard1 = sc.next();
        if (standard1.equals("full")) {
            return area * 2500;
        } else {
            return area * 1800;
        }
    }
}
