package com.directi.training.srp.exercise;

public class CarNames {
  CarFormatter carFormatter = new CarFormatter();

  public String getCarsNames(List<Car> _carsDb) {
    StringBuilder sb = new StringBuilder();
    for (Car car : _carsDb) {
      sb.append(carFormatter.formatCar(car));
    }
    return sb.substring(0, sb.length() - 2);
  }
}