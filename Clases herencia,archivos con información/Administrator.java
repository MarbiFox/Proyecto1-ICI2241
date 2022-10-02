/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;

/**
 *
 * @author thoma
 */
public class Administrator extends User{
    private String password;
    
    public Administrator(String nombre,String mail,int numero,String password){
        super(nombre,mail,numero);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean acceder(String nombre,String mail,int numero,String password){
        if(!getNombre().equals(nombre)||!getMail().equals(mail)||
                getNumero()!=numero || this.password.equals(password)){
            return false;
        }
        return true;
    }
    
    @Override
    public void vaciarDatos(){
        setNombre(null);
        setMail(null);
        setNumero(0);
        this.password = null;
    }
}
