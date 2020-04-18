package com.company;

public class Cilindro extends Circulo{

    private double altura;

    public Cilindro(){
        super();
        this.altura=1;

    }
    public Cilindro(double altura,double radio,String color){
       super(radio, color);
       this.altura=altura;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen(){
        return super.calcularArea()*this.altura;
    }
}
