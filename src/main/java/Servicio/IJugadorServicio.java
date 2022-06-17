/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Jugador;
import java.util.List;

/**
 *
 * @author PCG
 */
public interface IJugadorServicio {
    public Jugador crear(Jugador jugador);
    public List<Jugador>listar();
}
