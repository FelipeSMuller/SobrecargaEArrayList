package treinandoMetodos;

import java.util.ArrayList;

import java.util.Collections;

import javax.swing.JOptionPane;

public class Vetores {

	// Método para inserir valores em um array de inteiros
	public static void insereNumero(ArrayList<Integer> inteiros) {

		// Chamando o método trata erro, que além de permitir que o usuário insira os
		// valores do array, ainda irá tratar um possível valor inválido
		trataErro(inteiros);

		// Apenas itera sobre o array e imprime o valor no console.
		for (int i = 0; i < inteiros.size(); i++) {

			System.out.print(inteiros.get(i) + "  ");
		}

	}

	// Método para cálcular a média entre os valores fornecidos, método com
	// sobrecarga.
	public static void insereNumero(ArrayList<Integer> inteiros, int media) {

		// Tratamento de erro, recebe o array como parametro.
		trataErro(inteiros);

		// Itera sob todo o array e adiciona os valores presentes no array na variavel
		// soma, itera e soma sobre cada valor.
		for (int i = 0; i < inteiros.size(); i++) {

			media += inteiros.get(i);
		}

		// Imprime no prompt o cálculo da média.
		JOptionPane.showMessageDialog(null, "Média entre os números fornecidos =  " + media / inteiros.size());

	}

	// Método sobrecarregado, recebe duas variaveis que armazenarão o menor e maior
	// número respectivamente
	public static void insereNumero(ArrayList<Integer> inteiros, int valorMinimo, int valorMaximo) {

		// O método trata erro, verifica os valores inseridos pelo usuário em um método
		// que recebe como parametro um array dinâmico
		trataErro(inteiros);

		// Ordena o array através da classe collections
		Collections.sort(inteiros);

		// Armazena o primeiro indice em uma variavel
		valorMinimo = inteiros.get(0);

		// Adiciona o último indice em uma variavel
		valorMaximo = inteiros.get(inteiros.size() - 1);

		// Imprime os dois valores armazenados nas variaveis.
		JOptionPane.showMessageDialog(null,
				"Menor valor do array :  " + valorMinimo + "\nMaior valor do array :  " + valorMaximo);

	}

	public static void ordenaArray(ArrayList<Integer> inteiros) {

		trataErro(inteiros);

		Collections.sort(inteiros);

		// ArrayOrdenado
		for (int i = 0; i < inteiros.size(); i++) {

			System.out.print(inteiros.get(i) + "  ");
		}

	}

	// Tratamento de erro, o programa verifica todos os números de entrada
	public static void trataErro(ArrayList<Integer> inteiro) {

		int contagem = 1;

		do {

			try {

				int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + contagem + "° número"));

				// Se o número for negativo ou zero o programa cai em um erro.
				if (numero <= 0) {

					JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo, tente novamente");

					break;
				}

				// caso contrario o número sera inserido no array.
				else {

					inteiro.add(numero);

					contagem++;
				}

				// Se o valor for um dado não numerico ou o programa for finalizado
				// incorretamente cai em um erro
			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você inseriu valores não numéricos ou finalizou o programa incorretamente");

				break;

			}

		} while (contagem < 4);

	}

}
