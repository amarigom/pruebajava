/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1;

/**
 *
 * @author Usuario
 */
public class coche {
    private int nro_puertas;
    
    public coche(){};
    
    public coche(int nro_puertas){
    this.nro_puertas= nro_puertas;}
    
    public void agregar_puerta(){
    nro_puertas ++;}
    
 
    public void mostrarnumero_puertas( ){
    System.out.println("cantidad de puertas"+ " = "+ nro_puertas);}

    public int getNro_puertas() {
        return nro_puertas;
    }

    public void setNro_puertas(int nro_puertas) {
        this.nro_puertas = nro_puertas;
    }
}
