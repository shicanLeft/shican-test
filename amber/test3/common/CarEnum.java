package test3.common;

import jdk.nashorn.internal.objects.annotations.Getter;
import test3.business.BicycleCar;
import test3.business.SmallCar;
import test3.client.Car;

import java.util.Objects;

/**
 * 车类型枚举
 *
 * @Author: shican.sc
 * @Date: 2022/6/19 22:06
 * @see
 */
public enum CarEnum {
    small("small", new SmallCar()),

    bicycle("bicycle", new BicycleCar());

    String carType;
    Car car;

    CarEnum(String carType, Car car) {
        this.carType = carType;
        this.car = car;
    }


    public void setCarType(String carType){
       this.carType = carType;
    }
    public String getCarType(){
        return this.carType;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public String getCar(){
        return this.carType;
    }

    public static Car typeToCar(String carType){
        CarEnum[] values = CarEnum.values();
        for (CarEnum carEnum: values) {
            if (Objects.equals(carEnum.getCarType(), carType)) {
                return carEnum.car;
            }
        }
        return null;
    }
}
