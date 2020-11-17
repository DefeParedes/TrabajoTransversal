package sistema_gestion_alumnos.modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InscripcionData {
    private Connection con = null;

    public InscripcionData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
    public Alumno buscarAlumno(int id){
        Conexion c = new Conexion();
        AlumnoData alumnoData = new AlumnoData(c);
        return alumnoData.buscarAlumno(id);
    }
    
    public Materia buscarMateria(int id){
        Conexion c = new Conexion();
        MateriaData materiaData = new MateriaData(c);
        return materiaData.buscarMateria(id);
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
        try{
            String sql = "INSERT INTO inscripcion (id_alumno,id_materia,nota) VALUES (? , ? , ?);";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getId());
            ps.setInt(2, inscripcion.getMateria().getId());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate(); 
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next())
                inscripcion.setId(rs.getInt(1));
            else
                System.out.println("Error no hay ID");
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones = new ArrayList<>();
        try{
            String sql = "SELECT * FROM inscripcion;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Inscripcion inscripcion;
            while(resultSet.next()){
                inscripcion = new Inscripcion();
                inscripcion.setAlumno(buscarAlumno(resultSet.getInt("id_alumno")));
                inscripcion.setMateria(buscarMateria(resultSet.getInt("id_materia")));
                inscripcion.setId(resultSet.getInt("id"));
                inscripcion.setNota(resultSet.getDouble("nota"));
                inscripciones.add(inscripcion);
            }
            statement.close();
        }
        catch(SQLException e){
            System.out.println("Error al obtener las materias: "+e.getMessage());
        }
        return inscripciones;
    }
    
    public Inscripcion buscarInscripciones(int id){
        Inscripcion inscripcion=null;
        String sql = "SELECT * FROM inscripcion WHERE id=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                inscripcion = new Inscripcion();
                inscripcion.setAlumno(buscarAlumno(rs.getInt("id_alumno")));
                inscripcion.setMateria(buscarMateria(rs.getInt("id_materia")));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setId(rs.getInt("id"));
            }
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return inscripcion;
    }

    public void actualizarInscripcion(Inscripcion inscripcion){
        try{
            String sql = ("UPDATE inscripcion SET id_alumno=?, id_materia=?, nota=? WHERE id=?");
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getId());
            ps.setInt(2, inscripcion.getMateria().getId());
            ps.setDouble(3, inscripcion.getNota());
            ps.setInt(4, inscripcion.getId());
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void borrarInscripcion (int id){
        String sql = "DELETE FROM inscripcion WHERE id=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
