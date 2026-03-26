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
}
