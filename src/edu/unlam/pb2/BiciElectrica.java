package edu.unlam.pb2;

public class BiciElectrica extends Vehiculo {

	
	public BiciElectrica(String patente, Integer a�o, String marca, Integer precio) {
		super(patente, a�o, marca, precio);
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
