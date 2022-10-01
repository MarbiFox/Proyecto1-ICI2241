/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainprogram;

/**
 *
 * @author thoma
 */
public class Client extends User{
    private int rut;

    public Client(String nombre,String mail,int numero,int rut){
        super(nombre,mail,numero);
        this.rut = rut;
    }
    
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
    public boolean acceder(String nombre,String mail,int numero,int rut){
        if(!getNombre().equals(nombre)||!getMail().equals(mail)||
                getNumero()!=numero||this.rut!=rut){
            return false;
        }
        return true;
    }
    
}
