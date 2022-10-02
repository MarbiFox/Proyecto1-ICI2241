/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;

/**
 *
 * @author thoma
 */
public class User {
    private String nombre;
    private String mail;
    private int numero;

    public User(String nombre, String mail, int numero) {
        this.nombre = nombre;
        this.mail = mail;
        this.numero = numero;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public boolean acceder(String nombre,String mail){
        if(!getNombre().equals(nombre)||!getMail().equals(mail)||
                getNumero()!=numero){
            return false;
        }
        return true;
    }
    
    public void vaciarDatos(){
        this.nombre = null;
        this.mail = null;
        this.numero = 0;
    }
}
