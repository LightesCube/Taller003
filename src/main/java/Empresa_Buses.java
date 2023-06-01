import java.util.ArrayList;
import java.util.List;

public class Empresa_Buses {
	private String rut;
	private String direccion;
	private String redesSociales;
	private ArrayList<Bus> buses = new ArrayList<>();
	private ArrayList<Viajes> viajes = new ArrayList<>();

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public ArrayList<Bus> getBuses() {
		return buses;
	}

	public void agregarBus(Bus bus) {
		buses.add(bus);
	}

	public ArrayList<Viajes> getViajes() {
		return viajes;
	}

	public void agregarViaje(Viajes viaje) {
		viajes.add(viaje);
	}

		private List<Conductor> conductores;

		public Empresa_Buses(String rut, String direccion, String redesSociales) {
		this.rut=rut;
		this.direccion=direccion;
		this.redesSociales=redesSociales;
		}

		public void agregarBus(String patente, String marca, String modelo) {
			Bus nuevoBus = new Bus(patente, marca, modelo);
			this.buses.add(nuevoBus);

			System.out.println("Bus agregado correctamente.");
		}

		public void agregarConductor(String nombre, String apellido, String numeroContacto, Conductor.TipoLicencia tipoLicencia) {
			if (!validarTipoLicencia(String.valueOf(tipoLicencia))) {
				System.out.println("Tipo de licencia inválido.");
				return;
			}

			Conductor nuevoConductor = new Conductor(nombre, apellido, numeroContacto, tipoLicencia);
			this.conductores.add(nuevoConductor);

			System.out.println("Conductor agregado correctamente.");
		}

		private boolean validarTipoLicencia(String tipoLicencia) {
			return false;
		}
	}

}
