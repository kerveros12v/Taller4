package com.krakedev.Carrito;

public class Carrito {
    private String nombreCliente;
    private String[] productos = new String[10];
    private double[] precio = new double[10];
    private int cantidad = 0;

    public Carrito(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void agregarProducto(String nombre, double precio) {
        if(cantidad<10){
        this.productos[cantidad] = nombre;
        this.precio[cantidad] = precio;
        cantidad++;
        }
    }

    public double calcularTotal() {
        double s = 0;
        for (int i = 0; i < cantidad; i++) {
            s += precio[i];
        }
        return s;
    }

    public void mostrarResumen() {
        System.out.println("=== Carrito de " + nombreCliente + " ===");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precio[i]);
        }
        System.out.println("Total:" + calcularTotal());
    }
}
