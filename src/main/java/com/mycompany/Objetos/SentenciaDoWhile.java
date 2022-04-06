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
public class SentenciaDoWhile implements Serializable {

    String Do;
    String Llave_a;
    String sent;
    String Llave_c;
    String While;
    String parentesis_a;
    String sn;
    String parentesis_c;
    String pc;

    public SentenciaDoWhile() {
    }

    public SentenciaDoWhile(String Do, String Llave_a, String sent, String Llave_c, String While, String parentesis_a, String sn, String parentesis_c, String pc) {
        this.Do = Do;
        this.Llave_a = Llave_a;
        this.sent = sent;
        this.Llave_c = Llave_c;
        this.While = While;
        this.parentesis_a = parentesis_a;
        this.sn = sn;
        this.parentesis_c = parentesis_c;
        this.pc = pc;
    }

    public String getDo() {
        return Do;
    }

    public void setDo(String Do) {
        this.Do = Do;
    }

    public String getLlave_a() {
        return Llave_a;
    }

    public void setLlave_a(String Llave_a) {
        this.Llave_a = Llave_a;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getLlave_c() {
        return Llave_c;
    }

    public void setLlave_c(String Llave_c) {
        this.Llave_c = Llave_c;
    }

    public String getWhile() {
        return While;
    }

    public void setWhile(String While) {
        this.While = While;
    }

    public String getParentesis_a() {
        return parentesis_a;
    }

    public void setParentesis_a(String parentesis_a) {
        this.parentesis_a = parentesis_a;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getParentesis_c() {
        return parentesis_c;
    }

    public void setParentesis_c(String parentesis_c) {
        this.parentesis_c = parentesis_c;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "Do While {"
                + Do + Llave_a + sent + Llave_c + While
                + parentesis_a + sn + parentesis_c + pc
                + '}';
    }
}
