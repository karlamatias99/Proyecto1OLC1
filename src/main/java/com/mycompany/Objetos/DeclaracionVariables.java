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
public class DeclaracionVariables implements Serializable {

    String T_valor;
    String T_dato;
    String nombre;
    String signoIgual;
    String comillaA;
    String datos;
    String comillaC;
    String p_coma;

    public DeclaracionVariables() {
    }

    public DeclaracionVariables(String T_valor, String T_dato, String nombre, String signoIgual, String comillaA, String datos, String comillaC, String p_coma) {
        this.T_valor = T_valor;
        this.T_dato = T_dato;
        this.nombre = nombre;
        this.signoIgual = signoIgual;
        this.comillaA = comillaA;
        this.datos = datos;
        this.comillaC = comillaC;
        this.p_coma = p_coma;
    }

    public String getT_valor() {
        return T_valor;
    }

    public void setT_valor(String T_valor) {
        this.T_valor = T_valor;
    }

    public String getT_dato() {
        return T_dato;
    }

    public void setT_dato(String T_dato) {
        this.T_dato = T_dato;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getSignoIgual() {
        return signoIgual;
    }

    public void setSignoIgual(String signoIgual) {
        this.signoIgual = signoIgual;
    }

    public String getP_coma() {
        return p_coma;
    }

    public void setP_coma(String p_coma) {
        this.p_coma = p_coma;
    }

    @Override
    public String toString() {
        return "Variables {"
                + T_valor + T_dato + nombre + signoIgual
                + comillaA + datos + comillaC + p_coma
                + '}';
    }
}
