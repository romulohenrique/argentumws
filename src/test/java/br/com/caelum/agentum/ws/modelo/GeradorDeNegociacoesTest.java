package br.com.caelum.agentum.ws.modelo;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.argentum.ws.modelo.Data;
import br.com.caelum.argentum.ws.modelo.GeradorNegociacoes;
import br.com.caelum.argentum.ws.modelo.Negociacao;
import br.com.caelum.argentum.ws.modelo.Quantidade;

public class GeradorDeNegociacoesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void deveSempreGerarAMesmaQuantidadeDeNegociacoesParaOMesmoMes() {

		Quantidade um = Quantidade.UM;
		Calendar cal = new GregorianCalendar(2012, 1, 1);
		Data dataFinal = new Data(cal);
		Data dataInicio = dataFinal.mesesAtras(um);
		GeradorNegociacoes gerado = new GeradorNegociacoes(dataInicio, dataFinal);
		List<Negociacao> negocios = gerado.getNegociacoes();
		
		assertEquals(124, negocios.size());
	}

}
