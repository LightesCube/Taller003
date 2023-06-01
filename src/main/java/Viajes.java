import java.util.ArrayList;

public class Viajes {
	private ArrayList<String> pasajeros;
	private String ciudadOrigen;
	private String ciudadDestino;
	private String horaLlegada;
	private String horaSalida;
	private int cantidadPasajeros;
	public ArrayList<Empresa_Buses> empresa = new ArrayList<Empresa_Buses>();

	public ArrayList<String> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		throw new UnsupportedOperationException();
	}

	public String getCiudadOrigen() {
		return this.ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return this.ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getHoraLlegada() {
		return this.horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getCantidadPasajeros() {
		return this.cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}
}