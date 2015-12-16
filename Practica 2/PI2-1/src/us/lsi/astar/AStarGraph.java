package us.lsi.astar;

import java.util.Set;
import java.util.function.Predicate;

import org.jgrapht.Graph;

public interface AStarGraph<V, E> extends Graph<V,E> {
	/**
	 * @param vertex es el v�rtice actual
	 * @return El peso de vertex
	 */
	double getVertexWeight(V vertex);
	/**
	 * @param vertex El v�rtice actual
	 * @param edgeIn Una arista entrante o incidente en el v�rtice actual
	 * @param edgeOut Una arista saliente o incidente en el v�rtice actual
	 * @return el peso asociado al v�rtice suponiendo las dos aristas dadas d�nde la primera puede ser null
	 */
	double getVertexWeight(V vertex, E edgeIn, E edgeOut);
	
	/**
	 * @param actual El v�rtice actual
	 * @param endVertex El v�rtice destino
	 * @param goal El predicado que debe cumplir el v�rtice destino
	 * @param goalSet Un conjunto de v�rtices destino
	 * @return Una cota inferior del peso del camino desde el v�rtice actual al destino, 
	 * o desde el v�rtice actual al v�rtice que cumple el predicado
	 * o de la suma de los pesos de los caminos m�nimos del v�rtice actual a los objetivos
	 */
	double getWeightToEnd(V actual, V endVertex, Predicate<V> goal, Set<V> goalSet);
}
