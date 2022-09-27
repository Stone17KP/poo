

public class Libro{
	private String nombre;
	private Autor autor; 
	private Editorial editorial;
	private String año;
	private int ejemplares;
	private int costo;
	
	public Libro(String nombre, Autor autor, Editorial editorial, String año, int ejemplares, int costo) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.año = año;
		this.ejemplares = ejemplares;
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", año=" + año
				+ ", ejemplares=" + ejemplares + ", costo=" + costo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	
	
	
	
	
	
	
	
}
