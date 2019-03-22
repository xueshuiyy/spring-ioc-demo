package org.demo;

/**
 * Created by Administrator on 2019/3/21.
 */
public class Car {
    private String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
        System.out.println("carName: " + carName);
    }
}
