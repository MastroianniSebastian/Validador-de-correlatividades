package ar.edu.utn.frba.dds;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private List<Materia> materiasAprobadas;

    public Alumno() {
        materiasAprobadas = new ArrayList<>();
    }

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Boolean materiaAprobada(Materia unaMateria){
        return materiasAprobadas.contains(unaMateria);
    }


}
