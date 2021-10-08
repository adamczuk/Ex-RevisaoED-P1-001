package controller;

public class MultiplicacaoController {
	public int multiplicar (int valor, int vezes) {
		
		/*LOGICA DE PARADA:
		 * 
		 * Se eu estiver multiplicando por 0, retorno 0
		 * 
		 */
		if (vezes == 0) {
			return 0;
		}
		
		/*
		 * pega o valor a ser multiplicado, e soma ele com ele mesmo n-1 vezes, até 0 (condicao de parada)
		 * 
		 * EX: 4 * 3 =  4 + (4 * 2) -> 4 + (4 * 1) -> 4 + (4 * 0) 
		 * 
		 */
		else {		
			
			return valor + multiplicar(valor, vezes -1);
		}
	}
}
