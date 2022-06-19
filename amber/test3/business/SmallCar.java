package test3.business;

import test3.client.Car;

/**
 * @Author: shican.sc
 * @Date: 2022/6/19 22:03
 * @see
 */
public class SmallCar implements Car {
    @Override
    public void run() {
        System.out.println("small car");
    }
}
