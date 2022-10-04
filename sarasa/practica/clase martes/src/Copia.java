
public class Copia {

	private int id;
	private String pelicula;
	
	
	public Copia(int id, String pelicula) {
		super();
		this.id = id;
		this.pelicula = pelicula;
	}


	@Override
	public String toString() {
		return "Copia [id=" + id + ", pelicula=" + pelicula + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPelicula() {
		return pelicula;
	}


	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	
	
	
}
