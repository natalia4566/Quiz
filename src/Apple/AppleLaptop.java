package Apple;

import Abstract.Laptop;

public class AppleLaptop implements Laptop {
    @Override
    public void displayInfo() {
        System.out.println("Mac");
    }
}
