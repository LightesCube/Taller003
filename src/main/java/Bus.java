import java.util.ArrayList;

public class Bus {
	private String patente;
	private String marca;
	private String modeloBus;
	public Conductor conductor;
	public ArrayList<Viajes> viaje = new ArrayList<Viajes>();

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModeloBus() {
		return this.modeloBus;
	}

	public void setModeloBus(String modeloBus) {
		this.modeloBus = modeloBus;
	}
}