package com.krakedev.test;

import com.krakedev.Carrito;
import com.krakedev.Cliente.Cliente;
import com.krakedev.producto.Producto;
import com.krakedev.tienda.tienda;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== Bienvenido a la Tienda Digital =====");
        System.out.println();
        
        //--- Integrante 1: Producto ---
        Producto p1 = new Producto("Audifonos Bluetooth", 89.99, 50, "Electrónica");
        System.out.println("INTEGRANTE 1");
        p1.mostrarInfo();
        System.out.println();

        p1.aplicarDescuento(15.0);
        System.out.println();

        p1.verificarStock(20);
        System.out.println();
        
        
        //--- Integrante 2: Cliente ---
        Cliente c1 =  new Cliente("Tarzan", "tarzan@.com", 54.6);
        System.out.println("ITEGRANTE 2");
        c1.mostrarPerfil();
        System.out.println();
        
        c1.realizarCompra(12.3);
        System.out.println();
        
        c1.mostrarSaldo();
        System.out.println("");
        
        //--- Integrante 3: Carrito ---
        Carrito ca1 = new Carrito("Tarzan");
        System.out.println("Integrante 3");
        ca1.agregarProducto("Audufonos Bluetooth", 89.99);
        ca1.agregarProducto("Mouse Gamer", 25.50);
        System.out.println();
        
        ca1.calcularTotal();
        System.out.println();
        
        ca1.mostrarResumen();
        System.out.println();
        
        //--- Integrante 4: Tienda ---
        tienda t = new tienda("DeTodito");
        System.out.println("Integrante 4");
        t.registrarProductos("PC Gamer");
        t.registrarProductos("Pantalla");
        t.registrarProductos("Table");
        System.out.println();
        
        t.buscarProducto("Lapto");
        System.out.println();
        
        t.generarReporte();
        System.out.println();
        
        
        System.out.println("===== Fin del programa =====");
        
	}

}
