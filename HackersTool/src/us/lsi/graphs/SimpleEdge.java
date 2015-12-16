package us.lsi.graphs;

import org.jgrapht.EdgeFactory;

/**
 * <a> Un arista simple entre dos v�rtices de tipo V
 * El tipo tambi�n implementa la factor�a de aristas </a>
 * 
 * @author Miguel Toro
 *
 * @param <V> El tipo de los v�rtices de la arista
 */
public class SimpleEdge<V> implements EdgeFactory<V, SimpleEdge<V>> {

	private V source;
	private V target;
	
	/**
	 * 
	 * @param <E> El tipo de las aristas
	 * @return La factor�a de aristas
	 */
	public static <E> SimpleEdge<E> create() {
		return  new SimpleEdge<E>(null,null);
	}

	protected SimpleEdge(V c1, V c2) {
		super();
		this.source = c1;
		this.target = c2;
	}

	/**
	 * @return El v�rtice origen
	 */
	public V getSource(){
		return this.source;
	}
	
	/**
	 * @return El v�rtice destino
	 */
	public V getTarget(){
		return this.target;
	}
	
	/**
	 * @return El peso asociado a la arista
	 */
	public double getEdgeWeight(){
		return 1.;
	}
	
	@Override
	public String toString() {
		return this.source+","+this.target;
	}

	/* (non-Javadoc)
	 * @see org.jgrapht.EdgeFactory#createEdge(java.lang.Object, java.lang.Object)
	 */
	@Override
	public SimpleEdge<V> createEdge(V v1, V v2) {
		return new SimpleEdge<V>(v1,v2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SimpleEdge))
			return false;
		SimpleEdge<?> other = (SimpleEdge<?>) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}	
	
}

