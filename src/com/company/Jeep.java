package com.company;

public class Jeep extends Toyota {

    private String colorCar;
    private String modelCar;

    public Jeep(String colorCar, String modelCar) {
        this.colorCar = colorCar;
        this.modelCar = modelCar;
    }

    @Override
    public void print() {
        System.out.println("Цвет машины:" + colorCar + "\nМодель машины:" + modelCar);
    }
}
