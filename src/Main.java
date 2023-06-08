import com.dlozano.caranddriver.car;
import com.dlozano.caranddriver.driver;

public class Main {
    public static void main(String[] args) {
        car vroomMobile = new car();
        System.out.println(vroomMobile.getGasLevel());
        driver steveMcqueen = new driver();
        steveMcqueen.drive();
        steveMcqueen.drive();
        steveMcqueen.drive();
        steveMcqueen.drive();
        steveMcqueen.useBooster();
        steveMcqueen.refuel();
        steveMcqueen.refuel();
        steveMcqueen.refuel();
        System.out.println(steveMcqueen.getGasLevel());
    }
}