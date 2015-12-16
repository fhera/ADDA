package us.lsi.ejercicios;

import org.jgrapht.graph.SimpleWeightedGraph;

public class TestHackerTools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleWeightedGraph<NodoRed, Interconexion> sg = HackersTools
				.LeerRed("cluster.txt");

		System.out.println(HackersTools.getTotalNodos(sg));
		
		System.out.println(HackersTools.getNodosCalidad(sg));

	}
}
