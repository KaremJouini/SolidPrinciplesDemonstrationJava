
import java.util.Arrays;
import java.util.List;

public class CarManager {

    public static void main(String[] args) {
        List<Car> _carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                new Car("3", "Megane", "Renault"));

        CarDAO carDAO = new CarDAO();
        CarNames carNames = new CarNames();
        BestCar bestCar = new BestCar();

        Car c1 = carDAO.getFromDb(_carsDb);
        System.out.println(c1.getModel());
        System.out.println(carNames.getCarNames(_carsDb));
        Car c2 = bestCar.getBestCar(_carsDb);
        System.out.println(c2.getModel());

    }

}
