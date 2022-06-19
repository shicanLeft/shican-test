package test3.common;

import test3.client.Car;

/**
 * 车载工厂
 *
 * @Author: shican.sc
 * @Date: 2022/6/19 22:05
 * @see
 */
public interface CarFactory {

    Car create(String carType);
}
