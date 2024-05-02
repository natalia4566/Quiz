import Abstract.Cellphone;
import Abstract.Laptop;
import Abstract.Tablet;
import Samsung.SamsungCellphone;
import Samsung.SamsungLaptop;
import Samsung.SamsungTablet;

public class SamsungFactory implements  GUIFactory{

    public Cellphone createCellphone(){
        return new SamsungCellphone();
    }

    public Laptop createLaptop(){
        return new SamsungLaptop();
    }

    public Tablet createTablet(){
        return new SamsungTablet();
    }
}
