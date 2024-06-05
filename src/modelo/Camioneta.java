package modelo;

public class Camioneta extends Vehiculo {

	
	private float largo;
	private float ancho;
	private float alto;
	
	public Camioneta(int id,String marca,String modelo,String dominio,float largo,float ancho,float alto) {
		
		super(id,marca,modelo,dominio);
		
		this.largo=largo;
		this.ancho=ancho;
		this.alto=alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		return "Camioneta [largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public float calcularEspacioMaximo() {
		
		
		return (largo*ancho*alto)/1000;
	}
	
}
