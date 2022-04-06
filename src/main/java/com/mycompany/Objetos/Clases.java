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
public class Clases implements Serializable {

    String T_Valor;
    String T_dato;
    String Clase;
    String nombre;
    String parentesisA;
    String declaracion;
    String parentesisC;
    String llaveA;
    String sentencia;
    String llaveC;

    public Clases() {
    }

    public Clases(String T_Valor, String T_dato, String Clase, String nombre, String parentesisA, String declaracion, String parentesisC, String llaveA, String sentencia, String llaveC) {
        this.T_Valor = T_Valor;
        this.T_dato = T_dato;
        this.Clase = Clase;
        this.nombre = nombre;
        this.parentesisA = parentesisA;
        this.declaracion = declaracion;
        this.parentesisC = parentesisC;
        this.llaveA = llaveA;
        this.sentencia = sentencia;
        this.llaveC = llaveC;
    }

    public Clases(String T_Valor, String Clase, String nombre, String llaveA, String sentencia, String llaveC) {
        this.T_Valor = T_Valor;
        this.Clase = Clase;
        this.nombre = nombre;
        this.llaveA = llaveA;
        this.sentencia = sentencia;
        this.llaveC = llaveC;
    }

    public String getT_Valor() {
        return T_Valor;
    }

    public void setT_Valor(String T_Valor) {
        this.T_Valor = T_Valor;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLlaveA() {
        return llaveA;
    }

    public void setLlaveA(String llaveA) {
        this.llaveA = llaveA;
    }

    public String getLlaveC() {
        return llaveC;
    }

    public void setLlaveC(String llaveC) {
        this.llaveC = llaveC;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
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

    public String getT_dato() {
        return T_dato;
    }

    public void setT_dato(String T_dato) {
        this.T_dato = T_dato;
    }

    public String getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(String declaracion) {
        this.declaracion = declaracion;
    }

    @Override
    public String toString() {
        return "Clases {"
                + T_Valor + T_dato + Clase + nombre + parentesisA
                + declaracion + parentesisC + llaveA + sentencia + llaveC
                + '}';
    }
}
