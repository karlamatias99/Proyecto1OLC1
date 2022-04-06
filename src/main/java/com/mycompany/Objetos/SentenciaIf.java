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
public class SentenciaIf implements Serializable {

    String If;
    String ParentesisA;
    String Sentencia;
    String ParentesisC;
    String LLaveA;
    String sentencias;
    String LLaveC;

    public SentenciaIf() {
    }

    public SentenciaIf(String If, String ParentesisA, String Sentencia, String ParentesisC, String LLaveA, String sentencias, String LLaveC) {
        this.If = If;
        this.ParentesisA = ParentesisA;
        this.Sentencia = Sentencia;
        this.ParentesisC = ParentesisC;
        this.LLaveA = LLaveA;
        this.sentencias = sentencias;
        this.LLaveC = LLaveC;
    }

    public String getIf() {
        return If;
    }

    public void setIf(String If) {
        this.If = If;
    }

    public String getParentesisA() {
        return ParentesisA;
    }

    public void setParentesisA(String ParentesisA) {
        this.ParentesisA = ParentesisA;
    }

    public String getSentencia() {
        return Sentencia;
    }

    public void setSentencia(String Sentencia) {
        this.Sentencia = Sentencia;
    }

    public String getParentesisC() {
        return ParentesisC;
    }

    public void setParentesisC(String ParentesisC) {
        this.ParentesisC = ParentesisC;
    }

    public String getLLaveA() {
        return LLaveA;
    }

    public void setLLaveA(String LLaveA) {
        this.LLaveA = LLaveA;
    }

    public String getSentencias() {
        return sentencias;
    }

    public void setSentencias(String sentencias) {
        this.sentencias = sentencias;
    }

    public String getLLaveC() {
        return LLaveC;
    }

    public void setLLaveC(String LLaveC) {
        this.LLaveC = LLaveC;
    }

    @Override
    public String toString() {
        return "IF {"
                + If + ParentesisA + Sentencia + ParentesisC + LLaveA
                + sentencias + LLaveC
                + '}';
    }

}
