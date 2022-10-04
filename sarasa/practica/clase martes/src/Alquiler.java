
public class Alquiler {

	private int id;
	private String fecha;
	
	public Alquiler(int id, String fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Alquiler [id=" + id + ", fecha=" + fecha + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
