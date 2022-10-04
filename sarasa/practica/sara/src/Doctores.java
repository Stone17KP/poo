
public class Doctores extends Empleado {
	
	private String doctor;
	private String titulo;
	private String especialidad;

	


	public Doctores(int legajo, String nombre, String apellido, int dni, Double sueldo, String doctor, String titulo,
			String especialidad) {
		super(legajo, nombre, apellido, dni, sueldo);
		this.doctor = doctor;
		this.titulo = titulo;
		this.especialidad = especialidad;
	}


	@Override
	public String toString() {
		return "Doctores [doctor=" + doctor + ", titulo=" + titulo + ", especialidad=" + especialidad + "]";
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	
}
