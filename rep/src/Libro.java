

public class Libro {
//Variables de referencia 
	private String nombre;
	private Autor autor;
	private Editorial editorial;
	//Variables de tipo primitvo
	private int costo;
	private int a�o;
	private int cantidad;

	public Libro(String nombre, Autor autor, Editorial editorial, int costo, int a�o, int cantidad) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.costo = costo;
		this.a�o = a�o;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + "\n"  + ", autor=" + autor +  "\n" + ", editorial=" + editorial + "" + "\n"
				+ ", costo=" + costo + ", a�o=" + a�o + ", cantidad=" + cantidad + "]";
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

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
