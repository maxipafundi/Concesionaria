package edu.unlam.pb2;

public class Auto extends Vehiculo {
	
	private boolean tieneAire;
	

	public Auto(String patente, Integer a�o, String marca, Integer precio, boolean tieneAire) {
		super(patente, a�o, marca, precio);
		
		this.tieneAire = tieneAire;
		
	}
	
	
	public void prenderAire () {
		if(this.tieneAire) {
			System.out.println("el aire esta prendido");
		}
	}


	@Override
	public String toString() {
		return "Auto [getPatente()=" + getPatente() + ", getA�o()=" + getA�o() + ", getMarca()=" + getMarca()
				+ ", getPrecio()=" + getPrecio() +  "]";
	}
		
	
	
	
}
