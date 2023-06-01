public class Conductor {
	private String nombre;
	private String apellido;
	private String numeroDeContacto;
	private TipoLicencia tipoLicencia;
	public Bus bus;

	public enum TipoLicencia {
		A1,
		A2,
		A3,
		A4,
		A5
	}

	public Conductor(String nombre, String apellido, String numeroDeContacto, TipoLicencia tipoLicencia){
		this.nombre=nombre;
		this.apellido=apellido;
		this.numeroDeContacto=numeroDeContacto;
		this.tipoLicencia=tipoLicencia;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNumeroDeContacto() {
		return this.numeroDeContacto;
	}

	public void setNumeroDeContacto(String numeroDeContacto) {
		this.numeroDeContacto = numeroDeContacto;
	}

	public TipoLicencia getTipoLicencia() {
		return this.tipoLicencia;
	}

	public void setTipoLicencia(TipoLicencia tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}
}