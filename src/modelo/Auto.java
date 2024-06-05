package modelo;

public class Auto extends Vehiculo {

	
	private boolean tieneGNC;
	
	public Auto(int id,String marca,String modelo,String dominio,boolean tieneGNC) {
		
		super(id,marca,modelo,dominio);
		
		this.tieneGNC=tieneGNC;
	}

	public boolean isTieneGNC() {
		return tieneGNC;
	}

	public void setTieneGNC(boolean tieneGNC) {
		this.tieneGNC = tieneGNC;
	}

	@Override
	public String toString() {
		return "Auto [tieneGNC=" + tieneGNC + ", toString()=" + super.toString() + "]";
	}

	@Override
	public float calcularEspacioMaximo() {
		
		float valor=0;
		
		if(tieneGNC) {
			
			valor=400/2;
		}
		
		else {
			
			valor=400;
		}
		return valor;
	}
	
	
}
