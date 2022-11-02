package edu.unlam.pb2;

public class Auto extends Vehiculo {
	
	private boolean tieneAire;
	

	public Auto(String patente, Integer año, String marca, Integer precio, boolean tieneAire) {
		super(patente, año, marca, precio);
		
		this.tieneAire = tieneAire;
		
	}
	
	
	public void prenderAire () {
		if(this.tieneAire) {
			System.out.println("el aire esta prendido");
		}
	}


	@Override
	public String toString() {
		return "Auto [getPatente()=" + getPatente() + ", getAño()=" + getAño() + ", getMarca()=" + getMarca()
				+ ", getPrecio()=" + getPrecio() +  "]";
	}
		
	
	
	
}
