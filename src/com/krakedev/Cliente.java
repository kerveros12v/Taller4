package com.krakedev;

public class Cliente {
    private String nombre;
    private String correo;
    private double saldo;
    private int totalCompras;

    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
        this.totalCompras = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }

    public void mostrarPerfil() {
        System.out.println("Cliente: " + nombre + " Correo: " + correo + " Saldo: $" + saldo + " Compras realizadas: " + totalCompras);
    }

    public void realizarCompra(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            totalCompras++;
            System.out.println("Compra exitosa por $" + monto + " Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente. Saldo actual: $" + saldo);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }

}
