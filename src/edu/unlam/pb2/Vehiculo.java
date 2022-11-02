package edu.unlam.pb2;



public  class Vehiculo implements Comparable<Vehiculo> {

	private String patente;
	private Integer a�o;
	private String marca;
	private Integer precio;
	
	
	
	public Vehiculo(String patente, Integer a�o, String marca, Integer precio) {
		super();
		this.patente = patente;
		this.a�o = a�o;
		this.marca = marca;
		this.precio = precio;
		
	}

	
	






	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	
	public void encender() {
		
			System.out.println("vehiculo encendido!");
		}
	

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", a�o=" + a�o + ", marca=" + marca + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}





	@Override
	public int compareTo(Vehiculo o) {
		if(this.precio.equals(o.precio)) {
			
		} return this.precio.compareTo(o.precio);
	}
	
		
}
	









	


	
	
	
	
	

