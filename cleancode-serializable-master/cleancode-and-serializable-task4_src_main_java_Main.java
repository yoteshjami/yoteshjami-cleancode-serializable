import Materials.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Simple Interest and Compound Interest
        CompoundInterest ci = new CompoundInterest();
        SimpleInterest si = new SimpleInterest();
        double arr[] = new double[3];
        String vals[] = {"principle", "rate", "time"};
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the " + vals[i]);
            arr[i] = sc.nextDouble();
        }
        double principle = arr[0];
        double rate = arr[1];
        double year = arr[2];
        System.out.append("Simple Interest: " + si.simpleInterest(principle, rate, year) + "\n");
        System.out.append("Compound Interest: " + ci.compoundInterest(principle, rate, year) + "\n");

        //House Construction cost
        System.out.append("\nEnter the material:(Standard/AboveStandard/HighStandard)\n");
        String material = sc.next();
        System.out.append("Enter area:\n");
        double area = sc.nextDouble();
        HighStandard hs = new HighStandard();
        System.out.append("Total cost:");
        HouseCost hc = new HouseCost();
        hc.calculatecost(material, area);
    }
}