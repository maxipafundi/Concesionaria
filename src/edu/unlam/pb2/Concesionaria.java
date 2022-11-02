package edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Concesionaria {

	private String nombre;
	private TreeSet<Vehiculo> vehiculos;

	public Concesionaria(String nombre) {
		this.nombre = nombre;
		this.vehiculos =  new TreeSet<>();
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void agregarVehiculoALaConcesionaria(Vehiculo vehiculo) {
	
			this.vehiculos.add(vehiculo);
		}
		

	
	public Integer cantidadDeVehiculos () {
		return this.vehiculos.size();
	}
	
	public void listarVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
	}
	
}
