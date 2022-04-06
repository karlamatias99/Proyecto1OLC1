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
public class Imports implements Serializable {

    String imports;
    String java;
    String punto;
    String nombre;
    String util;
    String punto2;
    String asterisco;
    String p_coma;
    

    public Imports() {
    }

    public Imports(String imports, String java, String punto, String nombre, String util, String punto2, String asterisco, String p_coma) {
        this.imports = imports;
        this.java = java;
        this.punto = punto;
        this.nombre = nombre;
        this.util = util;
        this.punto2 = punto2;
        this.asterisco = asterisco;
        this.p_coma = p_coma;
    }


    public String getImports() {
        return imports;
    }

    public void setImports(String imports) {
        this.imports = imports;
    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public String getPunto() {
        return punto;
    }

    public void setPunto(String punto) {
        this.punto = punto;
    }

    public String getPunto2() {
        return punto2;
    }

    public void setPunto2(String punto2) {
        this.punto2 = punto2;
    }

    public String getP_coma() {
        return p_coma;
    }

    public void setP_coma(String p_coma) {
        this.p_coma = p_coma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsterisco() {
        return asterisco;
    }

    public void setAsterisco(String asterisco) {
        this.asterisco = asterisco;
    }

    
      @Override
    public String toString() {
        return "Imports {"
                + imports + " " + java + " " + punto + " " + nombre + " " + util + " " + punto2 + " " + asterisco + " " + p_coma
                + '}';
    }
}
