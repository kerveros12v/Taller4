package com.krakedev.producto;

public class Producto {
	private String nombre;
	private double precio;
	private int stock;
	private String categoria;
	
	public Producto(String nombre, double precio, int stock, String categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.categoria = categoria;
	}
	
	public void mostrarInfo() {
		System.out.println("Producto: "+nombre
				+"\nCategoria: "+categoria
				+"\nPrecio: "+precio
				+"\nStok: "+stock+" unidades");
	}
	
	public void aplicarDescuento(double porcentaje) {
		double descuento = precio * porcentaje / 100;
        double precioFinal = precio - descuento;

        System.out.println("Precio con descuento: $" + precioFinal);
	}
	
	public void verificarStock(int cantidad) {
        if (cantidad <= stock) {
            System.out.println("Disponible (si alcanza)");
        } else {
            System.out.println("Stock insuficiente");
            System.out.println("Disponible: " + stock);
        }
    }
}
