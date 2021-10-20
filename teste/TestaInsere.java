package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	 static Contato contato = new Contato();
	

	public static void main(String[] args) {
		  contato.setNome("Caelum");
		  contato.setEmail("contato@caelum.com.br");
		  contato.setEndereco("R. Vergueiro 3185 cj57");
		  
		  contato.setDataDeNascimento(Calendar.getInstance());
		  
				  ContatoDao dao = new ContatoDao();
		  dao.adiciona(contato);
	}

}
