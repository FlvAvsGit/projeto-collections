package entities;

import java.util.Objects;

public class Aluno {
	private String nome;
	private int	numMatricula;
	
	public Aluno() {
	}

	public Aluno(String nome, int numMatricula) {
		if(nome == null) {
			throw new NullPointerException("nome nao pode ser 'Null'" );
		}
		this.nome = nome;
		this.numMatricula = numMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=");
		builder.append(nome);
		builder.append(", numMatriculaxx=");
		builder.append(numMatricula);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numMatricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numMatricula == other.numMatricula;
	}

		
}