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
public class Metodos implements Serializable {

    String nombre;
    String parA;
    String operacion;
    String parC;
    String pc;

    public Metodos() {
    }

    public Metodos(String nombre, String parA, String operacion, String parC, String pc) {
        this.nombre = nombre;
        this.parA = parA;
        this.operacion = operacion;
        this.parC = parC;
        this.pc = pc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParA() {
        return parA;
    }

    public void setParA(String parA) {
        this.parA = parA;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getParC() {
        return parC;
    }

    public void setParC(String parC) {
        this.parC = parC;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }



}
