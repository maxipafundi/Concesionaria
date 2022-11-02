package edu.unlam.pb2;

public class Camioneta extends Vehiculo {

	private boolean tieneTraccion4x4;

	public Camioneta(String patente, Integer año, String marca, Integer precio, boolean tieneTraccion4x4) {
		super(patente, año, marca, precio);
		this.tieneTraccion4x4 = tieneTraccion4x4;
	}

	public boolean isTieneTraccion4x4() {
		return tieneTraccion4x4;
	}

	public void setTieneTraccion4x4(boolean tieneTraccion4x4) {
		this.tieneTraccion4x4 = tieneTraccion4x4;
	}

	
	
	
	
	
	
}
