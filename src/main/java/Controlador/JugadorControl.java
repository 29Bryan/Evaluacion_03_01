/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import Servicio.JugadorServicio;
import java.util.List;

/**
 *
 * @author PCG
 */
public class JugadorControl {
    private final JugadorServicio jugadorServicio = new JugadorServicio(); 
    
    public Jugador crear(String [] args){
        var jugador = new Jugador(args[0], Integer.valueOf(args[1]), Integer.valueOf(args[2]), args[3]); 
        this.jugadorServicio.crear(jugador);
        return jugador; 
    }
    
    public List<Jugador>listar(){
        return this.jugadorServicio.listar(); 
    }
}
