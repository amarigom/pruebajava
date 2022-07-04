/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1;

/**
 *
 * @author Usuario
 */
public class Project1 {

    /**
     *
     * @param a 
     * @param b
     * @return
     */
    public static int suma (int a, int b ){
        return a + b;
    };
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("la suma es : "+ suma (2,8));
        coche micoche = new coche(8);
        micoche.agregar_puerta();
        micoche.mostrarnumero_puertas();
        
    }
}
