package ar.edu.utn.frba.dds;

import java.util.List;

public class Inscripcion {

    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribir) {
        this.alumno = alumno;
        this.materiasAInscribir = materiasAInscribir;
    }

    public Boolean aprobada(){
        return materiasAInscribir.stream().allMatch(unaMateria -> unaMateria.alumnoCumpleCorrelativas(alumno));
    }
}
