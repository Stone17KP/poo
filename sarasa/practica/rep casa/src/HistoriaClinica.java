
public class HistoriaClinica {

	private String historia;
	private int fecha;
	
	public HistoriaClinica(String historia, int fecha) {
		super();
		this.historia = historia;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "HistoriaClinica [historia=" + historia + ", fecha=" + fecha + "]";
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
}
