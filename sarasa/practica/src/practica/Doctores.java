package practica;

public class Doctores extends Empleado {
	
	private String doctor;
	private String titulo;
	private String especialidad;

	


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
