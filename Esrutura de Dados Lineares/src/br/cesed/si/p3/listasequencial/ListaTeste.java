package br.cesed.si.p3.listasequencial;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class ListaTeste extends Lista {
	
	Lista lista = new Lista();
	
	@Test
	void testInserirUmElemento() {
		
		lista.inserir("A");
		
		Assert.assertEquals(1, lista.tamanho());
	}
	
	@Test
	void testInserirTresElementos() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		
		Assert.assertEquals(3, lista.tamanho());
	}
	
	@Test
	void testInserirQuatroElementos() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		lista.inserir("D");
		
		Assert.assertEquals(4, lista.tamanho());
	}
	
	@Test
	void testInserirElementoInvalido() {
		
		lista.inserir("");
		
		assertThrows(NullPointerException.class, () ->{
			lista.inserir(null);
		});
	}
	
	@Test
	void testRemoverSegundoElemento() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		
		Assert.assertEquals(3, lista.tamanho());
		
		lista.remover("B");
		
		Assert.assertEquals(2, lista.tamanho());
	}
	
	@Test
	void testRemoverTerceiroElemento() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		
		Assert.assertEquals(3, lista.tamanho());
		
		lista.remover("C");
		
		Assert.assertEquals(2, lista.tamanho());
	}
	
	@Test
	void testRemoverQuartoElemento() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		lista.inserir("D");
		
		Assert.assertEquals(4, lista.tamanho());
		
		lista.remover("D");
		
		Assert.assertEquals(3, lista.tamanho());
	}
	
	@Test
	void testRemoverElementoInvalido() {
		
		lista.inserir("A");
		lista.inserir("B");
		
		Assert.assertEquals(2, lista.tamanho());
		
		assertThrows(NullPointerException.class, () ->{
			lista.remover(null);
		});
	}
	
	@Test
	void testListaIsEmpty() {
		
		Assert.assertEquals(0, lista.tamanho());
	}
	
	@Test
	void testTamanhoLista() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		lista.inserir("D");
		lista.inserir("E");
		lista.inserir("F");
		lista.inserir("G");
		lista.inserir("H");
		lista.inserir("I");
		lista.inserir("J");
		
		Assert.assertEquals(10, lista.tamanho());
	}
	
	@Test
	void testRemoverElementoPosicao0() {
		
		lista.inserir("A");
		lista.inserir("B");
		
		Assert.assertEquals(2, lista.tamanho());
		
		lista.remover(0);
		
		Assert.assertEquals(1, lista.tamanho());
	}
	
	@Test
	void testRemoverElementoPosicao2() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		lista.inserir("D");
		
		Assert.assertEquals(4, lista.tamanho());
		
		lista.remover(2);
		
		Assert.assertEquals(3, lista.tamanho());
	}
	
	@Test
	void testRemoverElementoPosicao3() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		lista.inserir("D");
		
		Assert.assertEquals(4, lista.tamanho());
		
		lista.remover(3);
		
		Assert.assertEquals(3, lista.tamanho());
	}
	
//	MELHORAR TESTE: melhorar o método index() para ser usado nesse teste.
	@Test
	void testRemoverElementoPosicao4() {
		
		lista.inserir("A");
		lista.inserir("B");
		lista.inserir("C");
		lista.inserir("D");
		
		Assert.assertEquals(4, lista.tamanho());
		
		lista.remover(4);
		
		Assert.assertEquals(3, lista.index());
	}
		
	@Test
	void testRemoverElementoPosicaoInvalida() {
		
		lista.inserir("A");
		lista.inserir("B");
		
		Assert.assertEquals(2, lista.tamanho());
		
		assertThrows(NullPointerException.class, () ->{
			lista.remover(-1);
		});
	}
	


}
