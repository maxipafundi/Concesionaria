package edu.unlam.pb2;

public class BiciElectrica extends Vehiculo {

	
	public BiciElectrica(String patente, Integer año, String marca, Integer precio) {
		super(patente, año, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public void EncenderPantalla() {
		System.out.println("pantalla encendida");
	}
	
	public void energizarMotor() {
		System.out.println("Motor listo");
	}
	
	@Override
	public void encender() {
		
		EncenderPantalla();
		energizarMotor();
	}

	
}
