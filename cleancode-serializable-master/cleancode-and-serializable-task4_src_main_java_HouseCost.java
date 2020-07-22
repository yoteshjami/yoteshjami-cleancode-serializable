import Materials.*;

public class HouseCost {
    public void calculatecost(String material, double area) {
        CalculateCost costs[] = {new Standard(), new AboveStandard()};
        CalculateCost hss = new HighStandard();
        String material1[] = {"Standard", "AboveStandard"};
        int val = 0;
        if (material.equals("HighStandard")) {
            System.out.append("" + hss.calculatecost(area));
        } else if (material == "Standard" || material == "AboveStandard") {

            for (int i = 0; i < 2; i++) {
                if (material.equals(material1[i])) {
                    val = i;
                    break;
                }
            }
            System.out.append("" + costs[val].calculatecost(area));
        }
    }
}

