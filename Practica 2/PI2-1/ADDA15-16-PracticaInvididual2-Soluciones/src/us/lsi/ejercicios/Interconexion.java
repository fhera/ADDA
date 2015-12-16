package us.lsi.ejercicios;

import org.jgraph.graph.DefaultEdge;

import us.lsi.ejercicios.TipoConexion.Tipo;
import us.lsi.graphs.StringEdgeFactory;

public class Interconexion extends DefaultEdge {

	private String nombre;
	private Tipo e;
	private Integer velocidad;

	static Factoria factoria = new Factoria();

	public Interconexion(NodoRed n1, NodoRed n2) {
		super();
		this.source = n1;
		this.target = n2;
	}

	public Interconexion(NodoRed n1, NodoRed n2, String nombre,
			Integer velocidad, Tipo tipo) {
		super();
		this.source = n1;
		this.target = n2;
		this.nombre = nombre;
		this.e = tipo;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getE() {
		return e;
	}

	public void setE(Tipo e) {
		this.e = e;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public String toString() {
		return "Interconexión (" + source + ", " + target + ")";
	}

	private static class Factoria implements
			StringEdgeFactory<NodoRed, Interconexion> {

		@Override
		public Interconexion createEdge(NodoRed arg0, NodoRed arg1) {
			return new Interconexion(arg0, arg1);
		}

		@Override
		public Interconexion createEdge(NodoRed v1, NodoRed v2, String[] formato) {
			return new Interconexion(v1, v2, v1.toString() + v2.toString(),
					Integer.valueOf(formato[2]),
					TipoConexion.Tipo.valueOf(formato[3].toUpperCase()));
		}
	}
}
