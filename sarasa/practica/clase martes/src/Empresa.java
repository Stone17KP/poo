
public class Empresa {
	
	private int id;
	private String nombre;
	
	
	public Empresa(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + "]";
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
	
	
	
	
}
