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
public class SentenciaFor implements Serializable {

    String For;
    String parentesisa;
    String sent;
    String parentesisc;
    String llavea;
    String sn;
    String llavec;

    public SentenciaFor() {
    }

    public SentenciaFor(String For, String parentesisa, String sent, String parentesisc, String llavea, String sn, String llavec) {
        this.For = For;
        this.parentesisa = parentesisa;
        this.sent = sent;
        this.parentesisc = parentesisc;
        this.llavea = llavea;
        this.sn = sn;
        this.llavec = llavec;
    }

    public String getFor() {
        return For;
    }

    public void setFor(String For) {
        this.For = For;
    }

    public String getParentesisa() {
        return parentesisa;
    }

    public void setParentesisa(String parentesisa) {
        this.parentesisa = parentesisa;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getLlavec() {
        return llavec;
    }

    public void setLlavec(String llavec) {
        this.llavec = llavec;
    }

    @Override
    public String toString() {
        return "For {"
                + For + parentesisa + sent + parentesisc + llavea
                + sn + llavec
                + '}';
    }
}
