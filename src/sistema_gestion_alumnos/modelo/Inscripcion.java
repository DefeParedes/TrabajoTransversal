package sistema_gestion_alumnos.modelo;

public class Inscripcion {
    private int id=-1;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion(Alumno alumno, Materia materia, double nota, int id) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.id=id;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion() {
        this.id=-1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }


}
