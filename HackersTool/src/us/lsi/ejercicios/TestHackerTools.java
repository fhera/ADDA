package us.lsi.ejercicios;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.Multigraph;
import org.jgrapht.graph.Pseudograph;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;

import us.lsi.graphs.GraphsReader;

public class TestHackerTools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UndirectedGraph<NodoRed, Interconexion> g = new Multigraph<NodoRed, Interconexion>(
				Interconexion.factoria);

		GraphsReader.newGraph("cluster.txt", NodoRed.factoria,
				Interconexion.factoria, g);
		
		System.out.println(g);

	}
}
