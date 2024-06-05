package test;

import java.time.LocalDate;
import java.time.LocalTime;

import modelo.Sistema;

public class TesteModelo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  
		
		Sistema sistema=new Sistema();
		
		System.out.println("1");
		
		sistema.agregarAuto("Renault", "Logan", "AB123CD", false);
		sistema.agregarAuto("Chevrolet","Cruze", "CDE456", true);
		sistema.agregarCamioneta("Peugeot", "Partner", "FGH789", 134.7f, 147.0f, 114.0f);
		sistema.agregarCamioneta("Fiat", "Doblo", "EF654GH", 150f, 120f, 110.8f);
		
		System.out.println("2");
		sistema.agregarEnvio(sistema.traerVehiculo("AB123CD"), LocalDate.of(2022, 11, 10),LocalTime.of(13, 00),
				"Av. Uriarte 301", "Av. Colombres 224", 300f);
		sistema.agregarEnvio(sistema.traerVehiculo("CDE456"), LocalDate.of(2022, 11, 11),
				LocalTime.of(14, 00), "Cordero 505", "Portela 915", 150f);
		sistema.agregarEnvio(sistema.traerVehiculo("FGH789"), LocalDate.of(2022, 11, 12),
				LocalTime.of(15, 00), "España 450","Vieytes 1302", 2000f);
		sistema.agregarEnvio(sistema.traerVehiculo("EF654GH"), LocalDate.of(2022, 11, 13),
				LocalTime.of(16, 00), "Boedo 1375","Malabia 593", 1800f);
		
		sistema.agregarEnvio(sistema.traerVehiculo("FGH789"), LocalDate.of(2022, 11, 14),
				LocalTime.of(17, 00), "Av. Larroque 185","9 de Julio 1654", 1700f);	
		
		System.out.println("3");
		
		System.out.println(sistema.traerEnviosConCamioneta(LocalDate.of(2022, 11, 12), LocalDate.of(2022, 11, 13)));
		
		System.out.println("4");
		
		System.out.println(sistema.traerMinimoVehiculoPorEspacioMinimo(600));
		
		System.out.println("5");
		
		try {
			
			sistema.agregarAuto("Renault", "Logan", "AB123CD", false);
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		System.out.println("7");
		
        try {
			
			sistema.agregarEnvio(sistema.traerVehiculo("AB123CD"), LocalDate.of(2022, 11, 9),
					LocalTime.of(12, 00), "Av. las heras", "Italia 148", 600f);
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
	
		System.out.println(sistema);
	}

}
