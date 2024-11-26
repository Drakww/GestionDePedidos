/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepedidos.controlador;

import com.mycompany.gestiondepedidos.modelo.Pedido;
import com.mycompany.gestiondepedidos.servicio.GestorDePedidos;
import java.util.List;

/**
 *
 * @author Asus
 */
public class ControladorDePedido {
    private final GestorDePedidos gestorDePedidos;

    public ControladorDePedido(GestorDePedidos gestorDePedidos) {
        this.gestorDePedidos = gestorDePedidos;
    }

    public Pedido crearPedido(List<String> productos) {
        return gestorDePedidos.crearPedido(productos);
    }
}
