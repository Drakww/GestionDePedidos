/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepedidos.servicio;

import com.mycompany.gestiondepedidos.modelo.Pedido;
import com.mycompany.gestiondepedidos.servicio.notificador.Notificador;
import java.util.List;

/**
 *
 * @author Asus
 */
public class GestorDePedidos {
    private final CalculadorDeCostos calculadorDeCostos;
    private final Notificador notificador;
    private int contadorPedidos = 0;

    public GestorDePedidos(CalculadorDeCostos calculadorDeCostos, Notificador notificador) {
        this.calculadorDeCostos = calculadorDeCostos;
        this.notificador = notificador;
    }

    public Pedido crearPedido(List<String> productos) {
        contadorPedidos++;
        Pedido pedido = new Pedido(contadorPedidos, productos);
        double costo = calculadorDeCostos.calcularCosto(productos);
        pedido.setCostoTotal(costo);

        // Notificar al cliente
        notificador.enviarNotificacion("Pedido creado con éxito. Total: " + costo);
        return pedido;
    }
}
