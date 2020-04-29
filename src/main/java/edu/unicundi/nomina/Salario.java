/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.nomina;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author PROFESIONAL
 */
@ManagedBean(name = "salario", eager = true)
@RequestScoped
public class Salario implements Serializable {

    @ManagedProperty("#{index}")
    private Index data;
    private String Nombre;
    private String apellido;
    private int documento;
    private String fechaNacimiento;
    private String estudios;
    private ArrayList idiomas;
    private int diasTrabajados;
    private int sueldo;

    public Salario() {

    }
    
    @PostConstruct
     public void Salario() {
        this.Nombre = data.getNombre();
        this.apellido = data.getApellido();
        this.documento = data.getDocumento();
        this.fechaNacimiento = data.getFechaNacimiento();
        this.estudios = data.getEstudios();
        this.idiomas = data.getIdiomas();
        this.diasTrabajados = data.getDiasTrabajados();
        this.sueldo = 0;       
    }

    public Index getData() {
        return data;
    }

    public void setData(Index data) {
        this.data = data;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public ArrayList getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

}
