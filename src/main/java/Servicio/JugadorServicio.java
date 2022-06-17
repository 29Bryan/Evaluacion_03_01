/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCG
 */
public class JugadorServicio implements IJugadorServicio{
    
    private final List<Jugador> jugadorList = new ArrayList<>(); 

    @Override
    public Jugador crear(Jugador jugador) {
        this.jugadorList.add(jugador);
        return jugador; 
    }

    @Override
    public List<Jugador> listar() {
        return this.jugadorList;
    }
    
}
