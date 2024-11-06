package org.example.Clases;
public abstract

public class Sayayin {
    private String nombres;
    private Integer cantidadPoder;

    public void comer(){
        System.out.println("Todo me lo como");
    }

    public Sayayin(String nombres) {
        this.nombres = nombres;
    }

    public Sayayin(String nombres, Integer cantidadPoder) {
        this.nombres = nombres;
        this.cantidadPoder = cantidadPoder;
    }

    public abstract void  pelear();
}
