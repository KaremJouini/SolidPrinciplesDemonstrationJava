
public class CarDAO {

    public Car getFromDb(List<Car> _carsDb, final String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}