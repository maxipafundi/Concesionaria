package edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestConcesionaria {

	@Test
	public void QueSePuedaCrearUnaConcesionaria() {
		
		Concesionaria HotCar = new Concesionaria("HotCar");
		
		String nombreEsperado = "HotCar";
		String nombreObtenido = HotCar.getNombre();
		
		assertEquals(nombreEsperado, nombreObtenido);
		
		
	}
	@Test
	public void QueSePuedaCrearUnVehiculo() {
		Vehiculo vehiculo1 = new Vehiculo("AAA001", 2010, "Ford", 50000);
		assertNotNull(vehiculo1);
		
	}
	
	@Test
	public void QueSePuedaCrearUnAuto() {
		Auto auto1 = new Auto("AAA001", 2010, "Ford", 50000, true);
		auto1.prenderAire();
		
		assertNotNull(auto1);
		
	}
	@Test
	public void QueSePuedaCrearUnaMoto() {
		Moto moto1 = new Moto ("CCC23", 2015, "Susuki", 20000, 50);
		moto1.setMarca("Tu Vieja");
		moto1.hacerLaWhelee();
		assertNotNull(moto1);
	}
	
	@Test
	
	public void queSePuedaAgregarUnVehiculoALaConcesionaria() {
		Concesionaria HotCar = new Concesionaria("HotCar");
		Auto auto5 = new Auto("AAA001", 2010, "Ford", 50000, true);
		Auto auto1 = new Auto("AAA444", 2010, "Ford", 50000, true);
		Moto moto1 = new Moto ("CCC23", 2015, "Ford", 20000, 50);
		Auto auto2 = new Auto("AAA424", 2010, "Ford", 50000, true);
		HotCar.agregarVehiculoALaConcesionaria(moto1);
		HotCar.agregarVehiculoALaConcesionaria(auto1);
		HotCar.agregarVehiculoALaConcesionaria(auto1);
		HotCar.agregarVehiculoALaConcesionaria(auto2);
		HotCar.agregarVehiculoALaConcesionaria(auto5);
		
		Integer cantidadDeVehiculosEsperados = 3;
		Integer cantidadDeVehiculosObtenidos = HotCar.cantidadDeVehiculos();
		
		HotCar.listarVehiculos();
		
		assertEquals(cantidadDeVehiculosEsperados,cantidadDeVehiculosObtenidos);
		
		
	}
	
	
	@Test
	public void queSePuedaAgregarUnVehiculoALaConcesionariaOrdenadosPorAño() {
		Concesionaria HotCar = new Concesionaria("HotCar");
		Vehiculo vehiculo1 = new Vehiculo("AAA201", 2021, "Ford", 100000);
		Vehiculo vehiculo2 = new Vehiculo("AAA0401", 2006, "Ford", 20000);
		Vehiculo vehiculo3 = new Vehiculo("AAA0051", 2020, "Ford", 50000);
		Vehiculo vehiculo4 = new Vehiculo("AAA2001", 2010, "Ford", 250000);
		
		HotCar.agregarVehiculoALaConcesionaria(vehiculo1);
		HotCar.agregarVehiculoALaConcesionaria(vehiculo4);
		HotCar.agregarVehiculoALaConcesionaria(vehiculo3);
		HotCar.agregarVehiculoALaConcesionaria(vehiculo2);
		
		Integer cantidadDeVehiculosEsperados = 4;
		Integer cantidadDeVehiculosObtenidos = HotCar.cantidadDeVehiculos();
		
		HotCar.listarVehiculos();
		
		assertEquals(cantidadDeVehiculosEsperados,cantidadDeVehiculosObtenidos);
		
		
	}
	
	
	public void queNoSePuedaAgregarUnaCamionetaALaConcesionaria() {
		Concesionaria HotCar = new Concesionaria("HotCar");
		Vehiculo vehiculo1 = new Vehiculo("AAA001", 2010, "Ford", 50000);
		Auto auto1 = new Auto("AAA444", 2010, "Ford", 50000, true);
		Moto moto1 = new Moto ("CCC23", 2015, "Susuki", 20000, 50);
		Auto auto2 = new Auto("AAA444", 2010, "Ford", 50000, true);
		Camioneta camioneta1 = new Camioneta("PPP222", 2017, "Chevrolet", 800000, true);
		HotCar.agregarVehiculoALaConcesionaria(moto1);
		HotCar.agregarVehiculoALaConcesionaria(auto1);
		HotCar.agregarVehiculoALaConcesionaria(auto1);
		HotCar.agregarVehiculoALaConcesionaria(auto2);
		HotCar.agregarVehiculoALaConcesionaria(vehiculo1);
		
		Integer cantidadDeVehiculosEsperados = 3;
		Integer cantidadDeVehiculosObtenidos = HotCar.cantidadDeVehiculos();
		
		HotCar.listarVehiculos();
		
		assertEquals(cantidadDeVehiculosEsperados,cantidadDeVehiculosObtenidos);
		
		
	}
	
	
	
	
	public void queSePuedaCrearUnaCamioneta () {
		Camioneta camioneta1 = new Camioneta("PPP222", 2017, "Chevrolet", 800000, true);
		
		
		assertNotNull(camioneta1);
		
	}
	@Test
	public void queSePuedaCrearUnAvion() {
		Avion avion1 = new Avion (null, null, null, null);
		
	}
	
	@Test
	public void queSePuedaCrearUnaBiciElectrica() {
		Vehiculo vehi1 = new Vehiculo(null, null, null, null);
		BiciElectrica biciElec1 = new BiciElectrica(null, null, null, null);
		Avion avion1 = new Avion (null, null, null, null);
		Auto auto1 = new Auto(null, null, null, null, false);
		auto1.encender();
		System.out.println("/////");
		avion1.encender();
		System.out.println("/////");
		biciElec1.encender();
		
	}
	
	
}
