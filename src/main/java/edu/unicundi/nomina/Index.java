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
@Named(value = "index")
@Dependent
public class Index {
    private String nombre;
    private String apellido;
    
    public Index() {
    }
    
}
