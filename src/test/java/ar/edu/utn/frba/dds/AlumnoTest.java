package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlumnoTest {


    private static Materia algoritmos;

    private static Materia paradigmas;

    private static Materia matematicaDiscreta;

    private static Alumno matias;

    @BeforeAll
    static void setUp(){
        algoritmos = new Materia();
        matematicaDiscreta = new Materia();
        paradigmas = new Materia(List.of(matematicaDiscreta,algoritmos));
        matias = new Alumno(List.of(algoritmos));
    }

    @Test
    void siLaMateriaNoPerteneceAlConjuntoDeMateriasAprobadaEnElAlumnoMateriaAprobadaDeberiaRetornarFalse(){
        Assertions.assertFalse(matias.materiaAprobada(paradigmas));
    }

    @Test
    void siLaMateriaPerteneceAlConjuntoDeMateriasAprobadaEnElAlumnoMateriaAprobadaDeberiaRetornarTrue(){
        Assertions.assertTrue(matias.materiaAprobada(algoritmos));
    }

}
