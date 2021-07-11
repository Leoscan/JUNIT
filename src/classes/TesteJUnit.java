package classes;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;


public class TesteJUnit {
	
	@Test
	public void TesteCriacaoScript() {
		String NomeTabela = "alunos";
		String NomeColuna = "codigos";
		String Tipo = "INT";
		Boolean NotNull = true;
		Boolean AutoIncrement = true;
		
		boolean cria = CriaScript.GeraScript(NomeTabela, NomeColuna, Tipo, NotNull, AutoIncrement);
		
		Assert.assertTrue(cria);
	}
	
	@Test
	public void Teste1() {
		BufferedReader buffRead;
		String NomeTabela = "tabelas";
		String NomeColuna = "codigos";
		String Tipo = "INT";
		Boolean NotNull = true;
		Boolean AutoIncrement = true;
		
		String message = "ALTER TABLE tabelas ADD codigos INT NOT NULL AUTO_INCREMENT;";
		
		CriaScript.GeraScript(NomeTabela, NomeColuna, Tipo, NotNull, AutoIncrement);
		try {
			buffRead = new BufferedReader(new FileReader("src/arquivosGerados/Script.sql"));
			String teste1 = buffRead.readLine();
			Assert.assertEquals(message, teste1);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	@Test
	public void Teste2() {
		BufferedReader buffRead;
		String NomeTabela = "tabelas";
		String NomeColuna = "codigos";
		String Tipo = "INT";
		Boolean NotNull = false;
		Boolean AutoIncrement = true;
		
		String message = "ALTER TABLE tabelas ADD codigos INT AUTO_INCREMENT;";
		
		CriaScript.GeraScript(NomeTabela, NomeColuna, Tipo, NotNull, AutoIncrement);
		try {
			buffRead = new BufferedReader(new FileReader("src/arquivosGerados/Script.sql"));
			String teste1 = buffRead.readLine();
			Assert.assertEquals(message, teste1);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	@Test
	public void Teste3() {
		BufferedReader buffRead;
		String NomeTabela = "tabelas";
		String NomeColuna = "codigos";
		String Tipo = "INT";
		Boolean NotNull = false;
		Boolean AutoIncrement = false;
		
		String message = "ALTER TABLE tabelas ADD codigos INT;";
		
		CriaScript.GeraScript(NomeTabela, NomeColuna, Tipo, NotNull, AutoIncrement);
		try {
			buffRead = new BufferedReader(new FileReader("src/arquivosGerados/Script.sql"));
			String teste1 = buffRead.readLine();
			Assert.assertEquals(message, teste1);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
	
	@Test
	public void Teste4() {
		BufferedReader buffRead;
		String NomeTabela = "tabelas";
		String NomeColuna = "codigos";
		String Tipo = "INT";
		Boolean NotNull = true;
		Boolean AutoIncrement = false;
		
		String message = "ALTER TABLE tabelas ADD codigos INT NOT NULL;";
		
		CriaScript.GeraScript(NomeTabela, NomeColuna, Tipo, NotNull, AutoIncrement);
		try {
			buffRead = new BufferedReader(new FileReader("src/arquivosGerados/Script.sql"));
			String teste1 = buffRead.readLine();
			Assert.assertEquals(message, teste1);
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}
}
