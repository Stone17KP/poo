

public class Autor {

	//Variables de referencia
	private String nombre;
	private String apellido;
	private String fecha;
	private String sexo;
	private String eMail;

	public Autor(String nombre, String apellido, String fecha, String sexo, String eMail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.sexo = sexo;
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "Autor" + nombre + apellido  + fecha + sexo + eMail + "]";
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
