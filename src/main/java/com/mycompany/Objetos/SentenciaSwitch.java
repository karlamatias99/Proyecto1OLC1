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
public class SentenciaSwitch implements Serializable {

    String Switch;
    String parentesisa;
    String id;
    String parentesisc;
    String llavea;
    String sentencia;
    String llavec;

    public SentenciaSwitch() {
    }

    public SentenciaSwitch(String Switch, String parentesisa, String id, String parentesisc, String llavea, String sentencia, String llavec) {
        this.Switch = Switch;
        this.parentesisa = parentesisa;
        this.id = id;
        this.parentesisc = parentesisc;
        this.llavea = llavea;
        this.sentencia = sentencia;
        this.llavec = llavec;
    }

    public String getSwitch() {
        return Switch;
    }

    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public String getParentesisa() {
        return parentesisa;
    }

    public void setParentesisa(String parentesisa) {
        this.parentesisa = parentesisa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentesisc() {
        return parentesisc;
    }

    public void setParentesisc(String parentesisc) {
        this.parentesisc = parentesisc;
    }

    public String getLlavea() {
        return llavea;
    }

    public void setLlavea(String llavea) {
        this.llavea = llavea;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getLlavec() {
        return llavec;
    }

    public void setLlavec(String llavec) {
        this.llavec = llavec;
    }

    @Override
    public String toString() {
        return "Switch {"
                + Switch + parentesisa + id
                + parentesisc + llavea + sentencia + llavec
                + '}';
    }
}
