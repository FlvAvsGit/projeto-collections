package application;

import java.util.List;
import java.util.Set;

import entities.Aluno;
import entities.Aula;
import entities.Curso;

public class TestaCursoComAluno {
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
		
		System.out.println("===============================================");

		Aluno a1 = new Aluno("Flavio", 77828);
		Aluno a2 = new Aluno("Joao", 99828);
		Aluno a3 = new Aluno("Carlos", 31648);
		Aluno a4 = new Aluno("Sergio", 23828);
		Aluno a5 = new Aluno("Marcelo", 54317);
		Aluno a6 = new Aluno("Marcelo", 54317);
		Aluno a7 = new Aluno(null, 54317);
		
		javaColecoes.matriculaAluno(a1);
		javaColecoes.matriculaAluno(a2);
		javaColecoes.matriculaAluno(a3);
		javaColecoes.matriculaAluno(a4);
		javaColecoes.matriculaAluno(a5);
		javaColecoes.matriculaAluno(a6);
		javaColecoes.matriculaAluno(a7);
		
		Set<Aluno> alunos = javaColecoes.getAlunos();	
		
		System.out.println(alunos);
		javaColecoes.getAlunos().forEach(v -> System.out.println(v));
		
		System.out.println();
		System.out.println("o Aluno a6 está matriculado? : " + javaColecoes.taMatriculado(a6));
		System.out.println("a5.hashcode: " + a5.hashCode() + " a6.hashcode: " + a6.hashCode());
	}
}