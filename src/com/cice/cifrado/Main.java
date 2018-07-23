package com.cice.cifrado;

import com.cice.cifrado.logica.CifradoCesar;

public class Main {

    public static void main(String[] args) {

        /*
        int calculo = (25 - 3 + 26)%26;
        System.out.println(calculo);
        */

        CifradoCesar cc = new CifradoCesar();
        String cadenaCifrada = cc.cifrarCadena("zapato nuevo", 4);
        String cadenaDescifrada = cc.descifrarCadena(cadenaCifrada, 4);
        System.out.println("Cadena cifrada: " + cadenaCifrada);
        System.out.println("Cadena original: " + cadenaDescifrada);

    }
}
