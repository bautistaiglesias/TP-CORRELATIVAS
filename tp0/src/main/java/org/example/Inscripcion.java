package org.example;

import java.util.List;


public class Inscripcion {
    private Alumno alumno;
    List<Materia> materias;


    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }


    public boolean aprobada() {

        return materias.stream()
                .allMatch(materia -> alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas()));
    }

}

// List<Materia> materiasAprobadasAlumno = this.Alumno.getMateriasAprobadas();
//        //List<Materia> correlativasNecesarias = this.materia.getCorrelativas();
//        //materiasAprobadasAlumno.containsAll(correlativasNecesarias);