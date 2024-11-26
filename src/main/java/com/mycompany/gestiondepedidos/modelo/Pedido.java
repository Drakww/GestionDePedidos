/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepedidos.modelo;

import java.util.List;

/**
 *
 * @author Asus
 */
public class Pedido {
    private final int id;
    private final List<String> productos;
    private double costoTotal;

    public Pedido(int id, List<String> productos) {
        this.id = id;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public List<String> getProductos() {
        return productos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
}
