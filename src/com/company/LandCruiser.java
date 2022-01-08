package com.company;

public class LandCruiser extends Toyota {

    private String colorCar;
    private String modelCar;

    public LandCruiser(String colorCar, String modelCar) {
        this.colorCar = colorCar;
        this.modelCar = modelCar;
    }

    @Override
    public void print() {
        System.out.println("Цвет машины:" + colorCar + "\nМодель машины:" + modelCar);
    }
}
