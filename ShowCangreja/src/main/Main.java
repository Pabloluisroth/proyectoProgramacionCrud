package main;

import bbdd.Conexion;
import vista.BanearUsuario;
import vista.EliminarUsuario;
import vista.Interface;
import vista.Introduccionusuario;
import vista.Login;
import vista.Match;
import vista.ModificarUsuario;

public class Main {

	public static void main(String[] args) {
		Conexion.conectar();
		
		new Login();
		new Interface();
		new Introduccionusuario();
		new ModificarUsuario();
		new BanearUsuario();
		new EliminarUsuario();
		new Match();
		
		// abrir ventana principal //
	}

}