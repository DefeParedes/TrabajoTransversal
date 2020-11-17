package sistema_gestion_alumnos.modelo;

import com.mysql.jdbc.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlumnoData {
    private Connection con = null;

    public AlumnoData(Conexion conexion) {
        con = conexion.getConnection();
    }
    
    public void guardarAlumno(Alumno alumno){
        try{
            String sql = "INSERT INTO alumno (nombre_completo,nacimiento_alumno,activo) VALUES (? , ? , ?);";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre_completo());
            ps.setDate(2, alumno.getNacimiento_alumno());
            ps.setBoolean(3, alumno.isActivo());
            ps.executeUpdate(); 
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next())
                alumno.setId(rs.getInt(1));
            else
                System.out.println("Error no hay ID");
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnos(){
        List<Alumno> alumnos = new ArrayList<>();
        try{
            String sql = "SELECT * FROM alumno;";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Alumno alumno;
            while(resultSet.next()){
                alumno = new Alumno();
                alumno.setId(resultSet.getInt("id"));
                alumno.setNombre_completo(resultSet.getString("nombre_completo"));
                alumno.setNacimiento_alumno(resultSet.getDate("nacimiento_alumno"));
                alumno.setActivo(resultSet.getBoolean("activo"));
                alumnos.add(alumno);
            }
            statement.close();
        }
        catch(SQLException e){
            System.out.println("Error al obtener los alumnos: "+e.getMessage());
        }
        return alumnos;
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno=null;
        String sql = "SELECT * FROM alumno WHERE id=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre_completo(rs.getString("nombre_completo"));
                alumno.setNacimiento_alumno(rs.getDate("nacimiento_alumno"));
                alumno.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        return alumno;
    }

    public void actualizarAlumno(Alumno alumno){
        try{
            String sql = ("UPDATE alumno SET nombre_completo=?, nacimiento_alumno=?, activo=? WHERE id=?");
            
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre_completo());
            ps.setDate(2, alumno.getNacimiento_alumno());
            ps.setBoolean(3, alumno.isActivo());
            ps.setInt(4, alumno.getId());
            
            ps.executeUpdate();
            
            ps.close();
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void borrarAlumno (int id){
        String sql = "DELETE FROM alumno WHERE id=?";
        
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