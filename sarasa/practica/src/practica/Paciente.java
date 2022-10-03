package practica;

public class Paciente {

	private int paciente;
	private String apellido;
	private String nombre;
	private int edad; 
	private int dni;
	
	
	public Paciente(int paciente, String apellido, String nombre, int edad, int dni) {
		super();
		this.paciente = paciente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Paciente [paciente=" + paciente + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad
				+ ", dni=" + dni + "]";
	}


	public int getPaciente() {
		return paciente;
	}


	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
}
