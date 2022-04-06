/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Objetos;

import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
public class Objetos implements Serializable {

    String objeto;
    String nombre;
    String igual;
    String nuevo;
    String Ob;
    String parentesisA;
    String parentesisC;
    String pC;

    public Objetos() {
    }

    public Objetos(String objeto, String nombre, String igual, String nuevo, String Ob, String parentesisA, String parentesisC, String pC) {
        this.objeto = objeto;
        this.nombre = nombre;
        this.igual = igual;
        this.nuevo = nuevo;
        this.Ob = Ob;
        this.parentesisA = parentesisA;
        this.parentesisC = parentesisC;
        this.pC = pC;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIgual() {
        return igual;
    }

    public void setIgual(String igual) {
        this.igual = igual;
    }

    public String getNuevo() {
        return nuevo;
    }

    public void setNuevo(String nuevo) {
        this.nuevo = nuevo;
    }

    public String getOb() {
        return Ob;
    }

    public void setOb(String Ob) {
        this.Ob = Ob;
    }

    public String getParentesisA() {
        return parentesisA;
    }

    public void setParentesisA(String parentesisA) {
        this.parentesisA = parentesisA;
    }

    public String getParentesisC() {
        return parentesisC;
    }

    public void setParentesisC(String parentesisC) {
        this.parentesisC = parentesisC;
    }

    public String getpC() {
        return pC;
    }

    public void setpC(String pC) {
        this.pC = pC;
    }

    @Override
    public String toString() {
        return "Objetos {"
                + objeto + nombre + igual + nuevo + Ob
                + parentesisA + parentesisC + pC
                + '}';
    }
}
