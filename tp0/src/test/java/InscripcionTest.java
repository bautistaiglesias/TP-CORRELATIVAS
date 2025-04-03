package org.example;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class InscripcionTest {

    @Test
    @DisplayName("Test 1")
    public void pruebaInscripcion() {
        // INSTANCIACION
        Materia fisica1 = new Materia("Fisica1", new ArrayList<>());
        Materia fisica2 = new Materia("Fisica2", List.of(fisica1));
        Materia am1 = new Materia("Analisis Matematico 1", new ArrayList<>());
        Materia am2 = new Materia("Analisis Matematico 2", List.of(am1));

        // ACTUAR Y METODOS
        Alumno alumno = new Alumno("Bautista", new ArrayList<>());
        alumno.getMateriasAprobadas().add(fisica1);
        Inscripcion inscripcion = new Inscripcion(alumno, List.of(fisica2));


        //  ASSERTS
        Assertions.assertTrue(inscripcion.aprobada());

    }


    @Test
    @DisplayName("Alumno2 necesita am1 y no lo tiene")
    public void inscripcionDos(){


        Materia fisica1 = new Materia("Fisica1", new ArrayList<>());
        Materia fisica2 = new Materia("Fisica2", List.of(fisica1));
        Materia am1 = new Materia("Analisis Matematico 1", new ArrayList<>());
        Materia am2 = new Materia("Analisis Matematico 2", List.of(am1));


        Alumno alumno2 = new Alumno("Juan", new ArrayList<>());
        alumno2.getMateriasAprobadas().add(fisica1);
        Inscripcion inscripcion2 = new Inscripcion(alumno2, List.of(am2));


        Assertions.assertTrue(inscripcion2.aprobada());//pero no puede ya que no tiene am1 aprobada
    }
}


