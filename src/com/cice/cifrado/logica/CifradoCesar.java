package com.cice.cifrado.logica;

import java.util.Arrays;

public class CifradoCesar {

    private char[] abcdario;

    public CifradoCesar(){
        this.abcdario = new char[26];
        generarAbecedario();
    }

    private void generarAbecedario() {
        char firstChar = 'a';
        for (int i = 0; i < this.abcdario.length; i++) {
            this.abcdario[i] = firstChar++;
        }
    }

    public String cifrarCadena(String cadenaDescifrada, int posiciones){

        String cadenaCifrada = "";
        int posicionCifrada = 0;

        for (int j = 0; j < cadenaDescifrada.length(); j++) {

            char caracter = cadenaDescifrada.charAt(j);
            for (int i = 0; i < this.abcdario.length; i++) {
                if (abcdario[i] == caracter) {
                    posicionCifrada = (i + posiciones) % this.abcdario.length;
                    cadenaCifrada += abcdario[posicionCifrada];
                    break;
                }
            }

        }

        return cadenaCifrada;
    }

    public String descifrarCadena(String cadenaCifrada, int posiciones){
        String cadenaDescifrada = "";
        int posicionCifrada = 0;

        for (int j = 0; j < cadenaCifrada.length(); j++) {

            char caracter = cadenaCifrada.charAt(j);
            for (int i = 0; i < this.abcdario.length; i++) {
                if (abcdario[i] == caracter) {
                    posicionCifrada = (i - posiciones + 26) % this.abcdario.length;
                    break;
                }
            }

            cadenaDescifrada += abcdario[posicionCifrada];

        }
        return cadenaDescifrada;
    }

    @Override
    public String toString() {
        return "CifradoCesar{" +
                "abcdario=" + Arrays.toString(abcdario) +
                '}';
    }
}
