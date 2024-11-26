/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondepedidos.servicio.notificador;

/**
 *
 * @author Asus
 */
public class NotificadorEmail implements Notificador{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando mensaje de celular :"+ mensaje);
    }
    
}
