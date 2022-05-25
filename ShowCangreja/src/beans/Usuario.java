package beans;

public class Usuario {
	
	static String nombre;
	static int edad;
	static int altura;
	static int peso;
	static String ubicacion;
	
	public Usuario(String nombre, int edad, int altura, int peso, String ubicacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.ubicacion = ubicacion;
	}
	
		public static String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
		
		public static int getEdad() {
			return edad;
		}
		
		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public static int getAltura() {
			return altura;
		}
		
		public void setAltura(int altura) {
			this.altura = altura;
		}
	
		public static int getPeso() {
			return peso;
		}
		
		public void setPeso(int peso) {
			this.peso = peso;
		}
		
		public static String getUbicacion() {
			return ubicacion;
		}
		
		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
}
