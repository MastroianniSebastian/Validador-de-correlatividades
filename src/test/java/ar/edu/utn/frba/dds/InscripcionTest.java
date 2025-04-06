package ar.edu.utn.frba.dds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InscripcionTest {

    private static Materia algoritmos;

    private static Materia paradigmas;

    private static Materia matematicaDiscreta;

    private static Alumno matias;

    private static Inscripcion inscripcionAMatematicaDiscretaYParadigmas;
    private static Inscripcion inscripcionAMatematicaDiscreta;

    @BeforeAll
    static void setUp(){
        algoritmos = new Materia();
        matematicaDiscreta = new Materia();
        paradigmas = new Materia(List.of(matematicaDiscreta,algoritmos));
        matias = new Alumno(List.of(algoritmos));
        inscripcionAMatematicaDiscretaYParadigmas = new Inscripcion(matias,List.of(matematicaDiscreta,paradigmas));
        inscripcionAMatematicaDiscreta = new Inscripcion(matias, List.of(matematicaDiscreta));
    }

    @Test
    void unaInscripcionDeberiaSerRechazadaSiNoSeCumpleConLasCorrelatividadesDeUnaMateria(){
        Assertions.assertFalse(inscripcionAMatematicaDiscretaYParadigmas.aprobada());
    }

    @Test
    void unaInscripcionDeberiaSerAceptadaSiSeCumpleConLasCorrelatividadesDeUnaMateria(){
        Assertions.assertTrue(inscripcionAMatematicaDiscreta.aprobada());
    }
}
