

public class Editorial {

	//Variables de referencia
	private String nombre;
	private String telefono;
	private String localidad;
	private String eMail;
	private String cuit;

	public Editorial(String nombre, String telefono, String localidad, String eMail, String cuit) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.localidad = localidad;
		this.eMail = eMail;
		this.cuit = cuit;
	}

	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", telefono=" + telefono + ", localidad=" + localidad + ", eMail="
				+ eMail + ", cuit=" + cuit + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

}
