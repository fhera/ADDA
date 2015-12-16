package comprobarIntegemplridad;

public class comprobarIntegemplridad {

	public static void main(String[] args) {

		String s = "Esto es un text securizado$2516";

		System.out.println("Texto para comprobar: "
				+ s.substring(0, s.indexOf('$')));

		System.out
				.println("Código recibido: " + s.substring(s.indexOf('$') + 1));

		System.out.println("Valor Numérico Recursivo: " + valorNumerico(s));

		System.out.println("Valor Numérico Recursivo Final: "
				+ valorNumericoFinal(s));

		System.out.println("Valor Numérico Iterativo: "
				+ valorNumericoIterativo(s));

		System.out.println("¿El texto es íntegro? " + comprobarIntegridad(s));

	}

	public static Integer valorNumerico(String s) {
		return valorNumericoRecursivo(s, 0);
	}

	private static Integer valorNumericoRecursivo(String s, Integer n) {
		Integer res;

		if (n == s.indexOf('$')) {
			res = 0;
		} else {
			res = valor(s.charAt(n)) + valorNumericoRecursivo(s, n + 1);
		}

		return res;
	}

	public static Integer valorNumericoFinal(String s) {
		return valorNumericoRecursivoFinal(s, 0, 0);
	}

	private static Integer valorNumericoRecursivoFinal(String s, Integer n,
			Integer acum) {
		Integer res;

		if (n == s.indexOf('$')) {
			res = acum;
		} else {
			res = valorNumericoRecursivoFinal(s, n + 1,
					acum + valor(s.charAt(n)));
		}
		return res;
	}

	public static Integer valorNumericoIterativo(String s) {
		Integer res = 0;

		for (int i = 0; i < s.indexOf('$'); i++) {
			res += valor(s.charAt(i));
		}
		return res;
	}

	public static Boolean comprobarIntegridad(String s) {
		Boolean res;
		// Tenemos que hacer un casting al substring para convertirlo en
		// Integer. O con parsInt que lo convierte en Integer
		if (valorNumerico(s).equals(
				Integer.parseInt(s.substring(s.indexOf('$') + 1)))) {
			res = true;
		} else
			res = false;
		return res;
	}

	public static int valor(char c) {
		return (int) c;
	}
}