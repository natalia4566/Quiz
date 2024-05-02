import Abstract.Cellphone;
import Abstract.Laptop;
import Abstract.Tablet;

public interface GUIFactory {

    Cellphone createCellphone ();
    Tablet createTablet ();
    Laptop createLaptop ();



}
