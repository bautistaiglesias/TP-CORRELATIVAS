package org.example;

import java.util.List;


public class Alumno {
    public String nombre;
    public List<Materia> materiasAprobadas;

    public Alumno(String nombre, List<Materia> materiasAprobadas){
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
