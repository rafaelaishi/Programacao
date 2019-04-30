package br.cesed.si.p3.listasequencial;

import java.util.Arrays;

public class Lista {

	private static final int ALOCACAO = 3;
	private Object[] arrayInterno = new Object[ALOCACAO];
	private int inseridos;

	public void inserir(Object obj) {

		if(obj == null) {
			throw new NullPointerException();
		}
		
		if (inseridos == arrayInterno.length) {
			Object[] novoArray = new Object[arrayInterno.length + ALOCACAO];
			for (int i = 0; i < inseridos; i++) {
				;
				novoArray[i] = arrayInterno[i];
			}
			arrayInterno = novoArray;
		}

		if (obj != null) {
			arrayInterno[inseridos] = obj;
			inseridos++;
		}

	}

	//MELHORAR EXCEÇÃO: melhorar para aceitar qualquer objeto inválido, não apenas null.
	public void remover(Object obj)  {

		if(obj == null) {
			throw new NullPointerException();
		}
		
		if (obj != null) {
			for (int i = 0; i < inseridos; i++) {
				if (arrayInterno[i].equals(obj)) {
					arrayInterno[i] = null;
					for (int j = i; j < inseridos-1; j++) {
						arrayInterno[j] = arrayInterno[j + 1];
					}
				}

			}
			inseridos--;
		}

	}

	public void remover(int pos) {
		
		//MELHORAR EXCEÇÃO: melhorar para aceitar qualquer valor de posição inválida, não apenas -1.
		if(pos == -1) {
			throw new NullPointerException();
		}
		
		arrayInterno[pos] = null;
		
		for(int i = pos; i < inseridos-1; i++) {
			arrayInterno[i] = arrayInterno[i+1];
		}
		inseridos--;
	}

	public int tamanho() {
		return inseridos;
	}

	public boolean isEmpty() {
		
		return inseridos == 0;
	}

	public int index() {
		return inseridos;
	}

	@Override
	public String toString() {
		return "Lista [arrayInterno=" + Arrays.toString(arrayInterno) + "]";
	}
	

}
