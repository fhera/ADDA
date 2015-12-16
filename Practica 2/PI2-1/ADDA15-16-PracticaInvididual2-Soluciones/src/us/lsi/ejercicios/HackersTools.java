package us.lsi.ejercicios;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.jgrapht.graph.SimpleWeightedGraph;

import us.lsi.graphs.GraphsReader;

public class HackersTools {

	public static SimpleWeightedGraph<NodoRed, Interconexion> LeerRed(
			String entrada) {
		SimpleWeightedGraph<NodoRed, Interconexion> g = new SimpleWeightedGraph<NodoRed, Interconexion>(
				Interconexion.factoria);
		GraphsReader.newGraph(entrada, NodoRed.factoria,
				Interconexion.factoria, g);
		return g;
	}

	public static Integer getTotalNodos(
			SimpleWeightedGraph<NodoRed, Interconexion> sg) {
		return sg.vertexSet().size();
	}

	public static List<NodoRed> getNodosCalidad(
			SimpleWeightedGraph<NodoRed, Interconexion> sg) {
		return sg
				.vertexSet()
				.stream()
				.sorted((x, y) -> (Integer.compare(x.getQuality(),
						y.getQuality()))).collect(Collectors.toList());
	}
}
