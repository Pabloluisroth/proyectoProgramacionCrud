package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.Conexion;
import beans.Usuario;

public class Usuarios {
	
	public void crearUsuario(Usuario usuario) {
		String nombre = usuario.getNombre();
		int edad = usuario.getEdad();
		int altura = usuario.getAltura();
		int peso = usuario.getPeso();
		String ubicacion = usuario.getUbicacion();
		
		Conexion.ejecutarUpdate("INSERT INTO usuarios (nombre, edad, altura, peso, ubicacion) VALUES ('"+nombre+"', '"+edad+"','"+altura+"','"+ubicacion+"');");
	}
	
	public ArrayList<Usuario> recogersuarios(){
		// TODO: Hacer la petici�n a BBDD para recoger los usuarios//
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet resultado = Conexion.ejecutarSentencia("SELECT * FROM usuarios;");
		try {
			while(resultado.next()) {
				String nombre = resultado.getString("nombre");
				int edad = resultado.getInt("edad");
				int altura = resultado.getInt("altura");
				int peso = resultado.getInt("peso");
				String ubicacion = resultado.getString("ubicacion");
				usuarios.add(new Usuario( nombre, edad, altura, peso, ubicacion));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	
	public void borrarAlumno(String Usuario) {
		Conexion.ejecutarUpdate("DELETE FROM usuarios WHERE id="+Usuario+";");
	}

	public void modificarAlumno(Usuario usuario) {
		
		String nombre = Usuario.getNombre();
		int edad = Usuario.getEdad();
		int altura = Usuario.getAltura();
		int peso = Usuario.getPeso();
		String ubicacion = Usuario.getUbicacion();
		
		Conexion.ejecutarUpdate("UPDATE Usuario SET usuario='"+nombre+"','"+edad+"','"+altura+"','"+peso+"','"+ubicacion+";");
	}
}
