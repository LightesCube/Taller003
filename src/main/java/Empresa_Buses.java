import java.util.ArrayList;

public class Empresa_Buses {
	private String attribute;
	private String redesSociales;
	private String direccion;
	private Object attribute2;
	private String rut;
	public ArrayList<Bus> unnamed_Bus_ = new ArrayList<Bus>();
	public ArrayList<Viajes> viaje = new ArrayList<Viajes>();

	public String getAttribute() {
		return this.attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getRedesSociales() {
		return this.redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
}