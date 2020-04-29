/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.nomina;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author PROFESIONAL
 */
@Named(value = "salario")
@Dependent
public class Salario {

    private String Nombre;
    
    public Salario() {
        this.Nombre="camilo";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
