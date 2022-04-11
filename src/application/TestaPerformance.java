package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

//--------------------------------------------------------------        
    	
    	Collection<Integer> numHash = new HashSet<Integer>();
    	
    	long inicHash = System.currentTimeMillis();
    	
    	for (int i = 1; i <= 10000; i++) {
    		numHash.add(i);
    	}
    	long fimCargaHash = System.currentTimeMillis();
    	
    	for (Integer numero : numHash) {
    		numHash.contains(numero);
    	}
    	
    	long fimHash = System.currentTimeMillis();
    	
    	long tempoDeExecucaoCargaHash = fimCargaHash - inicHash;
    	long tempoDeExecucaoContaHash = fimHash - fimCargaHash;
    	long tempoDeExecucaoHash = fimHash - inicHash;
    	
    	System.out.println("Tempo gasto: " + tempoDeExecucaoHash);
    	System.out.println("Tempo Carga: " + tempoDeExecucaoCargaHash);
    	System.out.println("Tempo Conta: " + tempoDeExecucaoContaHash);
    	
//        ------------------------------------------------------------

Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 10000; i++) {
            numeros.add(i);
        }
        long fimCargaList = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucaoCarga = fimCargaList - inicio;
        long tempoDeExecucaoConta = fim - fimCargaList;
        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto Carga : " + tempoDeExecucaoCarga);
        System.out.println("Tempo gasto Conta : " + tempoDeExecucaoConta);
        System.out.println("Tempo gasto       : " + tempoDeExecucao);

    }

}




