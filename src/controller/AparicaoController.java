package controller;

public class AparicaoController {

	public AparicaoController() {
		super();
	}

	public int contAparicao(int numero, int digito) {
//		Condição de parada: numero é zero, assim percorreu todos digitos
		if (numero == 0) {
			return 0;
		} 
		
		int ultimoDigito = numero % 10;
		if (ultimoDigito == digito) {
			return 1 + contAparicao(numero/10, digito);
		} else {
			return contAparicao(numero/10, digito);
		}
	}
}
