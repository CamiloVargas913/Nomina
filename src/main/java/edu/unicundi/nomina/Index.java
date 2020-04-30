/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.nomina;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author PROFESIONAL
 */
@Named(value = "index")
@RequestScoped
public class Index implements Serializable{
    private String nombre;
    private String apellido;
    private int documento;
    private String fechaNacimiento;
    private String estudios;
    private ArrayList idiomas;
    private int diasTrabajados;

    
    
    public Index() {

    }
    
    public String vista (){
        System.out.println("redireccionando");
        return "salario";
    }
    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    
}
