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
public class SentenciaIfElse extends SentenciaIf implements Serializable {

    String Else;
    String Llave_a;
    String sen;
    String Llave_c;

    public SentenciaIfElse() {
    }

    public SentenciaIfElse(String Else, String Llave_a, String sen, String Llave_c) {
        this.Else = Else;
        this.Llave_a = Llave_a;
        this.sen = sen;
        this.Llave_c = Llave_c;
    }

    public SentenciaIfElse(String Else, String Llave_a, String sen, String Llave_c, String If, String ParentesisA, String Sentencia, String ParentesisC, String LLaveA, String sentencias, String LLaveC) {
        super(If, ParentesisA, Sentencia, ParentesisC, LLaveA, sentencias, LLaveC);
        this.Else = Else;
        this.Llave_a = Llave_a;
        this.sen = sen;
        this.Llave_c = Llave_c;
    }

    public String getElse() {
        return Else;
    }

    public void setElse(String Else) {
        this.Else = Else;
    }

    public String getLlave_a() {
        return Llave_a;
    }

    public void setLlave_a(String Llave_a) {
        this.Llave_a = Llave_a;
    }

    public String getSen() {
        return sen;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }

    public String getLlave_c() {
        return Llave_c;
    }

    public void setLlave_c(String Llave_c) {
        this.Llave_c = Llave_c;
    }

    @Override
    public String toString() {
        return "IF Else {"
                + If + ParentesisA + Sentencia + ParentesisC + LLaveA
                + sentencias + LLaveC + Else + Llave_a + sen + Llave_c
                + '}';
    }

}
