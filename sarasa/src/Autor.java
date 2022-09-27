
public class Autor {
	private String nombre;
	private String apellido;
	private String nacimiento;
	private String email;
	private String sexo;
	
	public Autor(String nombre, String apellido, String nacimiento, String email, String sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.email = email;
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", email=" + email
				+ ", sexo=" + sexo + "]";
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
	
	public String getNacimiento() {
		return nacimiento;
	}
	
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
