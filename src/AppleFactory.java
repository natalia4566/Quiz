import Abstract.Cellphone;
import Abstract.Laptop;
import Abstract.Tablet;
import Apple.AppleCellphone;
import Apple.AppleLaptop;
import Apple.AppleTablet;

public class AppleFactory implements GUIFactory{

    public Cellphone createCellphone() {
        return new AppleCellphone();
    }

    public Laptop createLaptop() {
        return new AppleLaptop();
    }

    public Tablet createTablet() {
        return new AppleTablet();
    }
}
