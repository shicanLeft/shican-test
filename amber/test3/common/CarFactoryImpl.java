package test3.common;

import test3.client.Car;

/**
 * @Author: shican.sc
 * @Date: 2022/6/19 22:11
 * @see
 */
public class CarFactoryImpl implements CarFactory{

    @Override
    public Car create(String carType) {
        return CarEnum.typeToCar(carType);
    }

    public static void main(String[] args) {
        CarFactoryImpl c = new CarFactoryImpl();
        System.out.println(c.create("small"));
    }
}
