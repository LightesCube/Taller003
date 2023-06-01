public class Conductor {
	private Object nombre;
	private Object apellido;
	private Object numero_de_contacto;
	private Object tipo_de_licencia;
	private enum tipo;
	private String attribute;
	private String apellido;
	private Tipo tipoLicencia;
	private int numeroContacto;
	public Bus bus;

	public enum getTipo() {
		return this.tipo;
	}

	public void setTipo(enum tipo) {
		this.tipo = tipo;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public enum getTipoLicencia() {
		throw new UnsupportedOperationException();
	}

	public void setTipoLicencia(enum tipoLicencia) {
		throw new UnsupportedOperationException();
	}

	public void setTipoLicencia(Tipo tipoLicencia) {
		this.tipoLicencia = tipoLicencia;
	}

	public int getNumeroContacto() {
		return this.numeroContacto;
	}

	public void setNumeroContacto(int numeroContacto) {
		this.numeroContacto = numeroContacto;
	}
}