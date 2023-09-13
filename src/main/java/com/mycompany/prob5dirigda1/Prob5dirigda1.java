/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prob5dirigda1;


public class Prob5dirigda1 {

    public static void main(String[] args) {
        int A,B,cont=0,cont2=0,carry=0,delete=0;
        A=11100111;
        B=10111111;
        String cadena = ""+A;
        String cadena2 = ""+B;
            while(A>0){
            A=A/10;
            cont++;}
            while(B>0){
            
                B=B/10;
            cont2++;}
        int maximo = Math.max(cont, cont2);
        int decimal=0;
        for (int i = 0; i < cont; i++) {
            char bit = cadena.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, cont - 1 - i);
            }
        }
        System.out.println("La cantidad de cifras de A es"+cont+" de B es "+cont2+" el maximo de los dos es "+ maximo+" ");
        System.out.println("El numero decimal es "+decimal +" ");
        StringBuilder resultado = new StringBuilder(maximo + 1);
        for (int i = maximo - 1; i >= 0; i--) {
            int bit1 = cadena.charAt(i) - '0';
            int bit2 = cadena2.charAt(i) - '0';
            int suma = bit1 + bit2 + carry;
            resultado.insert(0, suma % 2);
            carry = suma / 2;
        }
        if (carry > 0) {
            resultado.insert(0, carry);
        }
        System.out.println("la suma binaria es "+resultado.toString());
        StringBuilder resultado2 = new StringBuilder(maximo);
        for (int i = maximo - 1; i >= 0; i--) {
            int bit3 = cadena.charAt(i) - '0';
            int bit4 = cadena2.charAt(i) - '0';
            int resta = bit3 - bit4 - delete;
            if (resta < 0) {
                resta += 2;
                delete = 1;
            } else {
                delete = 0;
            }

            resultado2.insert(0, resta);
        }
        System.out.println("la resta binaria: " + resultado2.toString());
    }
}
