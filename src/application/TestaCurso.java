package application;

import java.util.Collections;
import java.util.List;

import entities.Aula;
import entities.Curso;

public class TestaCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Java Collections", 21));
		javaColecoes.adiciona(new Aula("TDD - testes automatizados", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 59));
		javaColecoes.adiciona(new Aula("Git e GitHub estratégias, conflitos", 34));
		javaColecoes.adiciona(new Aula("Spring Boot API", 58));
		javaColecoes.adiciona(new Aula("Bigquery", 42));

		// tentando adicionar da maneira "antiga". Podemos fazer isso? Teste:
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

//        Como o método getAulas devolve uma cópia "NãoModificacvel" da coleção de aulas, o add acima
//        nao irá funcionar.

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulax = javaColecoes.getAulas();

//		Collections.sort(aulax);
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}
}