package edu.unlam.pb2;

public class Moto extends Vehiculo {

	private int anchoManubrio;

	public Moto(String patente, Integer a�o, String marca, Integer precio, int anchoManubrio) {
		super(patente, a�o, marca, precio);
		this.anchoManubrio = anchoManubrio;
	}

	
	public void hacerLaWhelee() {
		System.out.println(getMarca());
		System.out.println("Estas haciendo la re williee amigoo!");
	}


	@Override
	public String toString() {
		return "Moto [getPatente()=" + getPatente() + ", getA�o()=" + getA�o() + ", getMarca()=" + getMarca()
				+ ", getPrecio()=" + getPrecio() + "]";
	}


	
	
	
	
}
