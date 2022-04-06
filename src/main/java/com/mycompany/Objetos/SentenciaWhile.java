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
public class SentenciaWhile implements Serializable {

    String While;
    String parentesisA;
    String sentencia;
    String parentesisC;
    String llaveA;
    String sent;
    String llaveC;

    public SentenciaWhile() {
    }

    public SentenciaWhile(String While, String parentesisA, String sentencia, String parentesisC, String llaveA, String sent, String llaveC) {
        this.While = While;
        this.parentesisA = parentesisA;
        this.sentencia = sentencia;
        this.parentesisC = parentesisC;
        this.llaveA = llaveA;
        this.sent = sent;
        this.llaveC = llaveC;
    }

    public String getWhile() {
        return While;
    }

    public void setWhile(String While) {
        this.While = While;
    }

    public String getParentesisA() {
        return parentesisA;
    }

    public void setParentesisA(String parentesisA) {
        this.parentesisA = parentesisA;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public String getParentesisC() {
        return parentesisC;
    }

    public void setParentesisC(String parentesisC) {
        this.parentesisC = parentesisC;
    }

    public String getLlaveA() {
        return llaveA;
    }

    public void setLlaveA(String llaveA) {
        this.llaveA = llaveA;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getLlaveC() {
        return llaveC;
    }

    public void setLlaveC(String llaveC) {
        this.llaveC = llaveC;
    }

    @Override
    public String toString() {
        return "While {"
                + While + parentesisA + sentencia
                + parentesisC + llaveA + sent + llaveC
                + '}';
    }

}
