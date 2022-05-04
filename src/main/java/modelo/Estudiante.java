/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author celes
 */
public class Estudiante {
    String Nombre;
    String Matrícula;
    String Carrera;
    String Correo;
    
    //Generamos el Constructor, los Getters y Setters y ToString
    public Estudiante(String Nombre, String Matrícula, String Carrera, String Correo) {
        this.Nombre = Nombre;
        this.Matrícula = Matrícula;
        this.Carrera = Carrera;
        this.Correo = Correo;
    }

    public Estudiante() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatrícula() {
        return Matrícula;
    }

    public void setMatrícula(String Matrícula) {
        this.Matrícula = Matrícula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Matr\u00edcula=" + Matrícula + ", Carrera=" + Carrera + ", Correo=" + Correo + '}';
    }

    
}
