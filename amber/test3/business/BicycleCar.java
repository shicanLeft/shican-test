package test3.business;

import test3.client.Car;

/**
 * @Author: shican.sc
 * @Date: 2022/6/19 22:05
 * @see
 */
public class BicycleCar implements Car {
    @Override
    public void run() {
        System.out.println("Bicycle Car");
    }
}
