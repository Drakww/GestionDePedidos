/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepedidos.servicio;

import java.util.List;

/**
 *
 * @author Asus
 */
public class CalculadorDeCostos {
    public double calcularCosto(List<String> productos) {
        // Ejemplo: cada producto tiene un costo base de 10.0
        return productos.size() * 10.0;
    }
}
