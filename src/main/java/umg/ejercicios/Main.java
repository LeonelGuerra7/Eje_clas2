package umg.ejercicios;

import umg.ejercicios.grupo1.areacirculo;

public class Main {
    public static void main(String[] args) {
        areacirculo circulo = new areacirculo(10.0);
        double area = circulo.calcularArea();
        System.out.println("El área del círculo con radio " + circulo.getRadio() + " es: " + area);
    }
}
