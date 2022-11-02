package edu.unlam.pb2;

public class Moto extends Vehiculo {

	private int anchoManubrio;

	public Moto(String patente, Integer año, String marca, Integer precio, int anchoManubrio) {
		super(patente, año, marca, precio);
		this.anchoManubrio = anchoManubrio;
	}

	
	public void hacerLaWhelee() {
		System.out.println(getMarca());
		System.out.println("Estas haciendo la re williee amigoo!");
	}


	@Override
	public String toString() {
		return "Moto [getPatente()=" + getPatente() + ", getAño()=" + getAño() + ", getMarca()=" + getMarca()
				+ ", getPrecio()=" + getPrecio() + "]";
	}


	
	
	
	
}
