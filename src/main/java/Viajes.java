import java.util.ArrayList;

public class Viajes {
	private ArrayList<String> pasajeros;
	private String ciudadOrigen;
	private String ciudadDestino;
	private String horaSalida;
	private String horaLlegada;
	private int cantidadPasajeros;
	public ArrayList<Empresa_Buses> empresas = new ArrayList<>();

	public Viajes(String ciudadOrigen, String ciudadDestino, String horaSalida, String horaLlegada, int cantidadPasajeros){
		this.ciudadOrigen=ciudadOrigen;
		this.ciudadDestino=ciudadDestino;
		this.horaSalida=horaSalida;
		this.horaLlegada=horaLlegada;
		this.cantidadPasajeros=cantidadPasajeros;
	}

	public ArrayList<String> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<String> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}
}