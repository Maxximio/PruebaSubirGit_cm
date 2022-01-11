package cm.com.ec.edu;

public class Estudiante {

	private String nombre;
	private String apellido;
	
	public void llenarDatos(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
				
	}
	
	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
}
