package Datos;

public class Encargado {
		
	private int id;
	private String nombre;
	
	public Encargado(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Encargado [id=" + id + ", nombre=" + nombre + "]";
	}
}
