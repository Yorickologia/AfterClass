package com.coderhouse;

public class Variables {

    public static void main(String[] args) {
        float numero = 12.2302f;

        // Casteo el tipo de dato para obtener la parte entera
        int parteEntera = (int) numero;

        // Obtengo la parte decimal restando la parte entera
        float parteDecimal = numero - parteEntera;

        // Muestro en consola los números.
        System.out.println("Número original: " + numero);
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }
}

