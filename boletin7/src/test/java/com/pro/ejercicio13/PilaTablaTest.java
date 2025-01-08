package com.pro.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTablaTest {
	PilaTabla pilaTabla = new PilaTabla();
	
	@BeforeEach
	void setUp() throws Exception {
		
		pilaTabla.apilar(3);
		pilaTabla.apilar(5);
	}

	@Test
	void pruebaDesapilar() {
		Integer resultadoEsperado = 5;
		Integer resultado = pilaTabla.desapilar();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void pruebaApilar() {
		Integer resultadoEsperado = 4;
		pilaTabla.apilar(4);
		Integer resultado = pilaTabla.desapilar();
		assertEquals(resultadoEsperado, resultado);
	}

}
