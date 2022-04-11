package application;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
		try {
			nomes.add("Paulo"); // o que acontece aqui?

		} catch (Exception e) {
			System.out.println("Erro : " + e.getMessage() );
		}
	}

}
