package practica;

public abstract class Empleado  {

	
	private int legajo;
	private String nombre;
	private String apellido;
	private int dni;
	private Double sueldo;
	
	public Empleado(int legajo, String nombre, String apellido, int dni, Double sueldo) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", sueldo=" + sueldo + "]";
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
}
