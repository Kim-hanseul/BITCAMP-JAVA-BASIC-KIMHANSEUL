package com.example.demo.auth.domain;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp
 * author     : Kim-hanseul
 * date       : 2022-01-25
 * ================================
 * DATE      AUTHOR      NOTE
 * ================================
 * 2022-01-25  Kim-hanseul   최초 생성
 */
public class BmiDTO {
    public static String BMI = "BMI TEST";


    private String name;
    private double height;
    private double weight;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


