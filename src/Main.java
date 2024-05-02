import Abstract.Cellphone;
import Abstract.Laptop;
import Abstract.Tablet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GUIFactory appleFactory = new AppleFactory();
        GUIFactory samsungFactory = new SamsungFactory();
        GUIFactory hpFactory = new HpFactory();

        //Cellphone
        Cellphone AppleCellphone = appleFactory.createCellphone();
        AppleCellphone.displayInfo();

        Cellphone SamsungCellphone = samsungFactory.createCellphone();
        SamsungCellphone.displayInfo();

        Cellphone HPCellphone = hpFactory.createCellphone();
        HPCellphone.displayInfo();


        //Tablet
        Tablet AppleTablet = appleFactory.createTablet();
        AppleTablet.displayInfo();

        Tablet SamsungTablet = samsungFactory.createTablet();
        SamsungTablet.displayInfo();

        Tablet HPTablet = hpFactory.createTablet();
        HPTablet.displayInfo();


        //Laptop
        Laptop AppleLaptop = appleFactory.createLaptop();
        AppleLaptop.displayInfo();

        Laptop SamsungLaptop = samsungFactory.createLaptop();
        SamsungLaptop.displayInfo();

        Laptop HPLaptop = hpFactory.createLaptop();
        HPLaptop.displayInfo();


    }
}