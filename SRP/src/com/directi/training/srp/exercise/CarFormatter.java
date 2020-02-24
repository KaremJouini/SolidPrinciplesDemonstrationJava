
public class CarFormatter {

    public StringBuilder formatCar(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append(car.getBrand());
        sb.append(" ");
        sb.append(car.getModel());
        sb.append(", ");
        return sb;
    }
}