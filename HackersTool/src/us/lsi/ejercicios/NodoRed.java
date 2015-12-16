package us.lsi.ejercicios;

import us.lsi.graphs.StringVertexFactory;

public class NodoRed {

	private String identificador, dominio;
	private boolean SSL;
	private Integer quality;

	static Factoria factoria = new Factoria();

	public NodoRed(String identificador, String dominio) {
		super();
		this.identificador = identificador;
		this.dominio = dominio;
	}

	public NodoRed(String identificador, String dominio, Integer quality) {
		super();
		this.identificador = identificador;
		this.dominio = dominio;
		this.quality = quality;

	}

	public NodoRed(String identificador, String dominio, Integer quality,
			boolean sSL) {
		super();
		this.identificador = identificador;
		this.dominio = dominio;
		this.quality = quality;
		SSL = sSL;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public boolean isSSL() {
		return SSL;
	}

	public void setSSL(boolean sSL) {
		SSL = sSL;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((identificador == null) ? 0 : identificador.hashCode());
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
		NodoRed other = (NodoRed) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dominio + " ¿Es SSL? "+ SSL;
	}

	private static class Factoria implements StringVertexFactory<NodoRed> {

		@Override
		public NodoRed createVertex(String[] formato) {
			return new NodoRed(formato[0], formato[0],
					Integer.valueOf(formato[1]), formato[2].equals("SSL"));
		}
	}

}
