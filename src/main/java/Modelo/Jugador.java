/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PCG
 */
public class Jugador {
    private String nombre; 
    private int edad;
    private int numeroCedula; 
    private String nacionalidad; 

    public Jugador(String nombre, int edad, int numeroCedula, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCedula = numeroCedula;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + 
                        ", numeroCedula=" + numeroCedula + ", nacionalidad=" + 
                        nacionalidad + '}';
    }
    
    
}
