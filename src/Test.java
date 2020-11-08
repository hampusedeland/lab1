import java.awt.*;
import java.util.ArrayList;

public class Test {

    private ArrayList<Car> cars;

    public Test(){
      cars = new ArrayList<>(2);
        cars.add(new Saab95( 2, Color.red, 125));
        cars.add(new Volvo240(4, Color.black, 100));


    }
}
