package us.lsi.ejercicios;

import us.lsi.graphs.StringVertexFactory;

public class NodoRed {

	private String dominio;
	private boolean SSL;
	private Integer identificador, quality;

	static Factoria factoria = new Factoria();

	public NodoRed(Integer identificador, String dominio, Integer quality,
			boolean sSL) {
		super();
		this.identificador = identificador;
		this.dominio = dominio;
		this.quality = quality;
		SSL = sSL;
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

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
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
		result = prime * result + ((dominio == null) ? 0 : dominio.hashCode());
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
		if (dominio == null) {
			if (other.dominio != null)
				return false;
		} else if (!dominio.equals(other.dominio))
			return false;
		return true;
	}

	private static class Factoria implements StringVertexFactory<NodoRed> {

		@Override
		public NodoRed createVertex(String[] formato) {
			Boolean b = false;
			if (formato[2].equalsIgnoreCase("SSL"))
				b = true;

			return new NodoRed((int) Math.random(), formato[0],
					Integer.parseInt(formato[1]), b);
		}
	}

}
