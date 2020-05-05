/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.nomina;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author David Marquez
 */
@Named(value = "index")
@RequestScoped
/**
 * Clase principal del programa
 */
public class Index implements Serializable {

    /**
     * variable para almacenar el nombre
     */
    private String nombre;
    /**
     * variable para almacenar el apellido
     */
    private String apellido;
    /**
     * variable para almacenar el numero de documento
     */
    private int documento;
    /**
     * variable para almacenar la fecha de nacimiento
     */
    private Date fechaNacimiento;
    /**
     * variable para almacenar el nivel de estudios
     */
    private String estudios;
    /**
     * variable para almacenar los idiomas
     */
    private ArrayList idiomas;
    /**
     * variable para almacenar los dias trabajados
     */
    private int diasTrabajados;

    /**
     * Constructor principal de la clase
     */
    public Index() {

    }

    /**
     * Metodo para redireccionar a otra vista
     *
     * @return String
     */
    public String vista() {
        System.out.println("redireccionando");
        System.out.println(this.fechaNacimiento);
        return "salario";
    }

    /**
     * Metodo para obtener el valor de los idiomas
     *
     * @return ArrayList
     */
    public ArrayList getIdiomas() {
        return idiomas;
    }

    /**
     * Metodo para establecer el valor de los idiomas
     *
     * @param idiomas variable para almacenar el valor de los idiomas
     */
    public void setIdiomas(ArrayList idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * Metodo para obtener el nombre
     *
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el valor del nombre
     *
     * @param nombre variable para guardar el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el valor del apellido
     *
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para establecer el valor del apellido
     *
     * @param apellido variable para guardar el apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo par obtener el valor del documento
     *
     * @return int
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * Metodo para establecer el valor del documento
     *
     * @param documento variable para guardar el numero de documento
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    /**
     * Variable para obtener el valor de la fecha de nacimiento
     *
     * @return String
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo para establecer la fecha de nacimiento
     *
     * @param fechaNacimiento variable para guardar la fecha de nacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo para obtener el valor del nivel de estudios
     *
     * @return String
     */
    public String getEstudios() {
        return estudios;
    }

    /**
     * Metodo para establecer el nivel de estudios
     *
     * @param estudios variable para guardar el nivel de estudios
     */
    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    /**
     * Metodo para obtener el valor de los dias trabajados
     *
     * @return int
     */
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    /**
     * Metodo para establecer el valor de los dias trabajados
     *
     * @param diasTrabajados variable para guardar los dias trabajados
     */
    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

}
