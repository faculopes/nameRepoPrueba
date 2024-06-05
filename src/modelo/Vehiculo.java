package modelo;

public abstract class Vehiculo {

	
	protected int id;
	protected String marca;
	protected String modelo;
	protected String dominio;
	
	
	public Vehiculo(int id,String marca,String modelo,String dominio) {
		
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		this.dominio=dominio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getDominio() {
		return dominio;
	}


	public void setDomicilio(String dominio) {
		this.dominio = dominio;
	}


	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", domicilio=" + dominio + "]";
	}
	
/*	public boolean esValidoDominio(String dominio) {
		
		boolean valido=false;
		
		if(dominio.length()==7) {
		if(Funciones.esLetra(dominio.charAt(0)) && Funciones.esLetra(dominio.charAt(1)) && 
				Funciones.esNumero((char) Character.getNumericValue(dominio.charAt(2))) &&
				Funciones.esNumero((char) Character.getNumericValue(dominio.charAt(3))) && 
				Funciones.esNumero((char) Character.getNumericValue(dominio.charAt(4))) &&
				Funciones.esLetra(dominio.charAt(5)) && Funciones.esLetra(dominio.charAt(5))){
			
			valido=true;
		}}
		
		if(dominio.length()==6) {
		if(Funciones.esLetra(dominio.charAt(0)) && Funciones.esLetra(dominio.charAt(1)) && 
				Funciones.esLetra(dominio.charAt(2)) &&
				Funciones.esNumero((char) Character.getNumericValue(dominio.charAt(3))) && 
				Funciones.esNumero((char) Character.getNumericValue(dominio.charAt(4))) &&
				Funciones.esNumero((char) Character.getNumericValue(dominio.charAt(5)))){
					
				valido=true;
				
				}
				}
				
			
		
		return valido;
		
		
	}*/
	
	public abstract float calcularEspacioMaximo();
}
