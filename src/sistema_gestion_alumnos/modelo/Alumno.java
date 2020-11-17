package sistema_gestion_alumnos.modelo;

import java.sql.Date;

public class Alumno {
    private boolean activo;
    private Date nacimiento_alumno;
    private int id=-1;
    private String nombre_completo;

    public Alumno(boolean activo, Date nacimiento_alumno,String nombre_completo, int id) {
        this.activo = activo;
        this.nacimiento_alumno = nacimiento_alumno;
        this.nombre_completo = nombre_completo;
        this.id = id;
    }

    public Alumno(boolean activo, Date nacimiento_alumno, String nombre_completo) {
        this.id = -1;
        this.activo = activo;
        this.nacimiento_alumno = nacimiento_alumno;
        this.nombre_completo = nombre_completo;
    }

    public Alumno() {
        this.id = -1;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public Date getNacimiento_alumno() {
        return nacimiento_alumno;
    }

    public int getId() {
        return id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setNacimiento_alumno(Date nacimiento_alumno) {
        this.nacimiento_alumno = nacimiento_alumno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    
    public String toString(){
        return id+" "+nombre_completo;
    }
}
