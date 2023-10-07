package treinandoMetodos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ManipuladorVetores {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		int opcaoUsuario = 0;

		do {

			try {
				opcaoUsuario = Integer.parseInt(JOptionPane.showInputDialog(

						"Escolha uma opção \n1-Inserir número \n2-Cálcular média \n3-Encontrar valor mínimo \n4-Ordenar array"));

			} catch (NumberFormatException | NullPointerException erro) {
				JOptionPane.showMessageDialog(null,
						"Você inseriu um dado não númerico ou fechou o programa incorretamente");
			}

			switch (opcaoUsuario) {

			case 1:

				Vetores.insereNumero(numeros);

				break;

			case 2:

				Vetores.insereNumero(numeros, 0);

				break;

			case 3:

				Vetores.insereNumero(numeros, 0, 0);

				break;

			case 4:

				Vetores.ordenaArray(numeros);

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"O programa foi finalizado, nenhuma opção disponível foi selecionada!!");

				break;

			}

		} while (opcaoUsuario > 0);

	}

}
