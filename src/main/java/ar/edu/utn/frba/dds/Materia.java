package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Materia {

    private List<Materia> materiasCorrelativas;

    public Materia() {
        materiasCorrelativas = new ArrayList<>();
    }

    public Materia(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public Boolean alumnoCumpleCorrelativas(Alumno alumno){
        return materiasCorrelativas.stream().allMatch(alumno::materiaAprobada);
    }
}
