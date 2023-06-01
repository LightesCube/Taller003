import java.util.ArrayList;

public class Bus {
	private String patente;
	private String marca;
	private String modeloBus;
	private Conductor conductor;
	private ArrayList<Viajes> viajes = new ArrayList<Viajes>();

	public Bus(String patente, String marca, String modeloBus) {
		this.patente = patente;
		this.marca = marca;
		this.modeloBus = modeloBus;
	}

	public String getPatente() {
		return this.patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModeloBus() {
		return this.modeloBus;
	}

	public Conductor getConductor() {
		return this.conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public ArrayList<Viajes> getViajes() {
		return this.viajes;
	}

	public void agregarViaje(Viajes viaje) {
		this.viajes.add(viaje);
	}
}

