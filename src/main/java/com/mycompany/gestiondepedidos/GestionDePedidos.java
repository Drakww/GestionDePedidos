/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestiondepedidos;

import com.mycompany.gestiondepedidos.controlador.ControladorDePedido;
import com.mycompany.gestiondepedidos.modelo.Pedido;
import com.mycompany.gestiondepedidos.servicio.CalculadorDeCostos;
import com.mycompany.gestiondepedidos.servicio.GestorDePedidos;
import com.mycompany.gestiondepedidos.servicio.notificador.NotificadorCelular;
import com.mycompany.gestiondepedidos.servicio.notificador.NotificadorEmail;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class GestionDePedidos {

    public static void main(String[] args) {
        
        CalculadorDeCostos calculadorDeCostos = new CalculadorDeCostos();
        NotificadorEmail emailNotificador = new NotificadorEmail();
        GestorDePedidos gestorDePedidos = new GestorDePedidos(calculadorDeCostos, emailNotificador);
        NotificadorCelular notificadorCelular = new NotificadorCelular();
        ControladorDePedido controladorDePedido = new ControladorDePedido(gestorDePedidos);

        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    
                    IngresarPedido(scanner, controladorDePedido,emailNotificador,notificadorCelular);
                    break;

                case 2:
                    
                    System.out.println("Regrese pronto!!! :3");
                    salir = true;
                    break;

                default:
                    System.out.println("Elige una opcion correcta :D");
            }
        }

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de Sistema de Tienda ---");
        System.out.println("1. Crear un nuevo pedido");
        System.out.println("2. Salir");
        System.out.print("Elija una opción: ");
    }

    public static void IngresarPedido(Scanner scanner, ControladorDePedido controladorDePedido, NotificadorEmail notificadorEmail,NotificadorCelular notificadorCelular) {
        System.out.print("Ingrese los productos del pedido separados por coma (ejemplo. p1, p2): ");
        String productosInput = scanner.nextLine();
        List<String> productos = Arrays.asList(productosInput.split(","));

        Pedido nuevoPedido = controladorDePedido.crearPedido(productos);
        System.out.println("\n¡Pedido creado con éxito!");
        System.out.println("ID: " + nuevoPedido.getId());
        System.out.println("Productos: " + nuevoPedido.getProductos());
        System.out.println("Costo Total: " + nuevoPedido.getCostoTotal());
        // Notificación al usuario
        System.out.println("Notificación enviada al cliente: ");
        notificadorEmail.enviarNotificacion("Tu pedido ya esta listo!. Costo total: " + nuevoPedido.getCostoTotal());
        notificadorCelular.enviarNotificacion("Tu pedido ya esta listo! .Costo total: " + nuevoPedido.getCostoTotal());
    }
}
