package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Envio {

	
	private int id;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private LocalTime hora;
	private String origen;
	private String destino;
	private float espacioRequerido;
	
	public Envio(int id,Vehiculo vehiculo,LocalDate fecha,LocalTime hora,String origen,String destino,
			float espacioRequerido) {
		
		this.id=id;
		this.vehiculo=vehiculo;
		this.fecha=fecha;
		this.hora=hora;
		this.origen=origen;
		this.destino=destino;
		this.espacioRequerido=espacioRequerido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public float getEspacioRequerido() {
		return espacioRequerido;
	}

	public void setEspacioRequerido(float espacioRequerido) {
		this.espacioRequerido = espacioRequerido;
	}

	@Override
	public String toString() {
		return "Envio [id=" + id + ", vehiculo=" + vehiculo + ", fecha=" + fecha + ", hora=" + hora + ", origen="
				+ origen + ", destino=" + destino + ", espacioRequerido=" + espacioRequerido + "]";
	}
	
	
}
