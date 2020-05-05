/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.nomina;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PROFESIONAL
 */
@ManagedBean(name = "salario", eager = true)
@RequestScoped
public class Salario implements Serializable {

    @ManagedProperty("#{index}")
    private Index data;
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
    private String fechaNacimiento;
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
     * variable para almacenar el sueldo calculado
     */
    private int sueldo;
    /**
     * variable para almacenar el salario base
     */
    private int salarioBase;

    /**
     * Constructor principal de la clase
     */
    public Salario() {

    }

    /**
     * Constructor secundario de la clase
     */
    @PostConstruct
    public void Salario() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        
        this.nombre = data.getNombre();
        this.apellido = data.getApellido();
        this.documento = data.getDocumento();
        this.fechaNacimiento = dateFormat.format(data.getFechaNacimiento());
        this.estudios = data.getEstudios();
        this.idiomas = data.getIdiomas();
        this.diasTrabajados = data.getDiasTrabajados();
        this.sueldo = 0;
        this.salarioBase = 30000 * this.diasTrabajados;
        calcularSalario();
    }

    /**
     * Metodo que calcula el salario de la persona
     */
    public void calcularSalario() {
        switch (this.estudios) {
            case "Primaria":
                this.salarioBase += 0;
                break;
            case "Secundaria":
                this.salarioBase += 0;
                break;
            case "Tecnico":
                this.salarioBase += 5000;
                break;
            case "Tecnologo":
                this.salarioBase += 15000;
                break;
            case "Profesional":
                this.salarioBase += 30000;
                break;
            case "Magister":
                this.salarioBase += 40000;
                break;
        }
        for (int i = 0; i < this.idiomas.size(); i++) {
            if (this.idiomas.get(i).equals("Ninguno")) {
                System.out.println("No ha seleccionado ningun idioma o selecciono ninguno y otro");
                System.out.println(this.salarioBase);
                break;
            } else {
                this.salarioBase += (this.idiomas.size() * 10000);
                break;
            }

        }
        this.sueldo = this.salarioBase;
        System.out.println("Sueldo:" + this.sueldo);
        System.out.println(data.getFechaNacimiento());
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
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo para establecer la fecha de nacimiento
     *
     * @param fechaNacimiento variable para guardar la fecha de nacimiento
     */
    public void setFechaNacimiento(String fechaNacimiento) {
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

    /**
     * Metodo para obtener los datos capturados del bean index
     *
     * @return
     */
    public Index getData() {
        return data;
    }

    /**
     * Metodo para enviar los datos capturados bean index
     *
     * @param data
     */
    public void setData(Index data) {
        this.data = data;
    }

    /**
     *
     * Metodo para capturar el sueldo
     *
     * @return
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Metodo para enviar el sueldo
     *
     * @param sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Metodo para enviar el sueldo base
     *
     * @return
     */
    public int getSalarioBase() {
        return salarioBase;
    }

    /**
     *
     * @param salarioBase
     */
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

}
