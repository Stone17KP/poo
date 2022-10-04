

public class Detalle {

	private String detalle;
	private String sintomas;
	private String tratamiento;
	private String diagnostico;

	public Detalle(String detalle, String sintomas, String tratamiento, String diagnostico) {
		super();
		this.detalle = detalle;
		this.sintomas = sintomas;
		this.tratamiento = tratamiento;
		this.diagnostico = diagnostico;
	}

	@Override
	public String toString() {
		return "Detalle [detalle=" + detalle + ", sintomas=" + sintomas + ", tratamiento=" + tratamiento
				+ ", diagnostico=" + diagnostico + "]";
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
	
}
