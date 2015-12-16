package us.lsi.ejercicios;

import us.lsi.graphs.StringEdgeFactory;
import us.lsi.graphs.StringVertexFactory;

public class Interconexion {

	private String nombre;
	private TipoConexion e;
	private Integer velocidad;

	static Factoria factoria = new Factoria();

	public Interconexion(String nombre, Integer velocidad, TipoConexion e) {
		super();
		this.nombre = nombre;
		this.e = e;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoConexion getE() {
		return e;
	}

	public void setE(TipoConexion e) {
		this.e = e;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((velocidad == null) ? 0 : velocidad.hashCode());
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
		Interconexion other = (Interconexion) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (velocidad == null) {
			if (other.velocidad != null)
				return false;
		} else if (!velocidad.equals(other.velocidad))
			return false;
		return true;
	}

	private static class Factoria implements
			StringEdgeFactory<NodoRed, Interconexion> {

		@Override
		public Interconexion createEdge(NodoRed arg0, NodoRed arg1) {
			// TODO Auto-generated method stub
			return new Interconexion(arg0, arg1);
		}

		@Override
		public Interconexion createEdge(NodoRed v1, NodoRed v2, String[] formato) {
			// TODO Auto-generated method stub
			return new Interconexion(v1,v2, formato[0]);
		}
	}

}
