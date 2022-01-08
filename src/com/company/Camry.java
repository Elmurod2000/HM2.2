package com.company;

public class Camry extends Toyota {

    private String colorCar;
    private String modelCar;

    public Camry(String colorCar, String modelCar) {
        this.colorCar = colorCar;
        this.modelCar = modelCar;
    }

    @Override
    public void print() {
        System.out.println("Цвет машины:" + colorCar + "\nМодель машины:" + modelCar);
    }
}

