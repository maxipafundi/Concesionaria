package edu.unlam.pb2;

public class Avion extends Vehiculo {

	
	public Avion(String patente, Integer año, String marca, Integer precio) {
		super(patente, año, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public void calefaccionarCarbudador() {
		System.out.println("Calefaccionando");
	}
	
	public void regularMezclaCombustiblre() {
		System.out.println("Mezcla regulada");
	}
	
	public void contarPasos() {
		System.out.println("pasos contados");
	}
	
	public void inyectarCombustible() {
		System.out.println("combustible inyectado");
	}

	
	@Override
	public void encender() {
		calefaccionarCarbudador();
		regularMezclaCombustiblre();
		contarPasos();
		inyectarCombustible();
		
	}

	
}


