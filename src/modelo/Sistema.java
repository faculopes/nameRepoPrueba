package modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import modelo.Funciones;

public class Sistema {

	
	private List<Vehiculo> LstVehiculos;
	private List<Envio>LstEnvios;
	
	
	public Sistema() {
		
		this.LstVehiculos=new ArrayList<Vehiculo>();
		this.LstEnvios=new ArrayList<Envio>();
	}


	public List<Vehiculo> getLstVehiculos() {
		return LstVehiculos;
	}


	public void setLstVehiculos(List<Vehiculo> lstVehiculos) {
		LstVehiculos = lstVehiculos;
	}


	public List<Envio> getLstEnvios() {
		return LstEnvios;
	}


	public void setLstEnvios(List<Envio> lstEnvios) {
		LstEnvios = lstEnvios;
	}


	@Override
	public String toString() {
		return "Sistema [LstVehiculos=" + LstVehiculos + ", LstEnvios=" + LstEnvios + "]";
	}
	
	
	public Vehiculo traerVehiculo(String dominio) {
		
		Vehiculo vehiculoAux=null;
		int i=0;
		
		while(vehiculoAux==null && i<LstVehiculos.size()) {
			
			if(LstVehiculos.get(i).getDominio().equals(dominio)) {
				
				vehiculoAux=LstVehiculos.get(i);
			}
			
			i++;
		}
		return vehiculoAux;
	}
	
	public boolean agregarAuto(String marca,String modelo,String dominio,boolean tieneGNC) throws Exception{
		
		Vehiculo auto=traerVehiculo(dominio);
		
		
		if(auto !=null)throw new Exception("dominio  Repetido");
		
		//if(auto.esValidoDominio(dominio)==false)throw new Exception("DOMINIO INVALIDO");
		
		int id=1;
		
		if(LstVehiculos.size()>0) {
			
			id=LstVehiculos.get(this.LstVehiculos.size()-1).getId()+1;
		}
		
		return LstVehiculos.add(new Auto(id,marca,modelo,dominio,tieneGNC));
	}
	
	public boolean agregarCamioneta(String marca,String modelo,String dominio,float largo,
			float ancho,float alto) throws Exception {
		
		Vehiculo camioneta=traerVehiculo(dominio);
		
		if(camioneta !=null)throw new Exception("dominio Repetido");
		
		int id=1;
		
		if(LstVehiculos.size()>0) {
			
			id= LstVehiculos.get(this.LstVehiculos.size()-1).getId()+1;
		}
		
		return LstVehiculos.add(new Camioneta(id,marca,modelo,dominio,largo,ancho,alto));
	}
	
	public boolean agregarEnvio(Vehiculo vehiculo,LocalDate fecha,LocalTime hora,String origen,
			String destino,float espacioRequerido) throws Exception{
		Vehiculo aux=traerVehiculo(vehiculo.dominio);
		if(espacioRequerido>aux.calcularEspacioMaximo())throw new Exception("SUPERA EL LIMITE DE ESPACIO");
		
		int id=1;
		
		if(LstEnvios.size()>0) {
			
			id=LstEnvios.get(this.LstEnvios.size()-1).getId()+1;
		}
		
		return LstEnvios.add(new Envio(id,vehiculo,fecha,hora,origen,destino,espacioRequerido));
	}
	
	public List<Envio> traerEnviosConCamioneta(LocalDate fechaDesde,LocalDate fechaHasta){
		
		List<Envio>LstAux=new ArrayList<Envio>();
		
		for(Envio e : LstEnvios) {
			if(e.getVehiculo() instanceof Camioneta) {
			if(Funciones.entreFechas(fechaDesde, fechaHasta,e.getFecha() )) {
				
				LstAux.add(e);
			}
		}
		}
		
		return LstAux;
	}
	
	public Vehiculo traerMinimoVehiculoPorEspacioMinimo(float espacioRequerido) {
		
		Vehiculo vAux=null;
		
		for(Vehiculo v : LstVehiculos) {
			
			if(v.calcularEspacioMaximo()>=espacioRequerido) {
				
				vAux=v;
			}
		}
		
		return vAux;
	}
}
