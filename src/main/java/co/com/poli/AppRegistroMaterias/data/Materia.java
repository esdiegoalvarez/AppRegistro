/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppRegistroMaterias.data;

/**
 *
 * @author sala313
 */
public class Materia {
    
    private String idMateria;
    private String nombre;
    private double numCreditos;
    private double cupoMin;
    private double cupoMax;

    public Materia(String idMateria, String nombre, double numCreditos, double cupoMin, double cupoMax) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.numCreditos = numCreditos;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
    }

    public Materia() {
    }

    public String getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNumCreditos() {
        return numCreditos;
    }

    public double getCupoMin() {
        return cupoMin;
    }

    public double getCupoMax() {
        return cupoMax;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumCreditos(double numCreditos) {
        this.numCreditos = numCreditos;
    }

    public void setCupoMin(double cupoMin) {
        this.cupoMin = cupoMin;
    }

    public void setCupoMax(double cupoMax) {
        this.cupoMax = cupoMax;
    }
    
    
}
