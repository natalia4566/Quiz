import Abstract.Cellphone;
import Abstract.Laptop;
import Abstract.Tablet;
import HP.HPCellphone;
import HP.HPLaptop;
import HP.HPTablet;

public class HpFactory implements GUIFactory{

    public Cellphone createCellphone() {
        return new HPCellphone();
    }

    public Tablet createTablet() {
        return new HPTablet();
    }

    public Laptop createLaptop() {
        return new HPLaptop();
    }
}
