package com.company;

public class Circulo {

    private double radio;
    private String color;

    public Circulo(){
        this.radio=1;
        this.color="rojo";
    }
    public Circulo(double radio,String color){
        this.radio=radio;
        this.color=color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        double area;
        area=3.14 * Math.pow(this.radio,2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }


}
