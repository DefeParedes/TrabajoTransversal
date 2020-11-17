package sistema_gestion_alumnos.modelo;

public class Materia {
    private int id = -1;
    private String nombre;

    public Materia(String nombre, int id) {
        this.id = id;
        this.nombre = nombre;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
