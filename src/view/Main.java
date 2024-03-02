package view;

import javax.swing.JOptionPane;
import controller.AparicaoController;

public class Main {

	public static void main(String[] args) {
		int N1 = 0;
		int N2 = 0;

		do {
			N1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número (entre 10 e 999999): "));
			if (N1 < 10 || N1 > 999999) {
				JOptionPane.showMessageDialog(null, "Número inválido, digite novamente!");
			}
		} while (N1 < 10 || N1 > 999999);

		do {
			N2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número (entre 0 e 9): "));
			if (N2 < 0 || N2 > 9) {
				JOptionPane.showMessageDialog(null, "Número inválido, digite novamente!");
			}
		} while (N2 < 0 || N2 > 9);

		AparicaoController aCont = new AparicaoController();
		int resultado = aCont.contAparicao(N1, N2);
		System.out.println("O número " + N2 + " aparece " + resultado + " vez(es) em " + N1);
	}

}
