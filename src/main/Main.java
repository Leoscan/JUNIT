package main;

import classes.CriaScript;

public class Main {

	public static void main(String[] args) {
		String NomeTabela = "alunos";
		String NomeColuna = "codigos";
		String Tipo = "INT";
		Boolean NotNull = true;
		Boolean AutoIncrement = true;
		

		if (CriaScript.GeraScript(NomeTabela, NomeColuna, Tipo, NotNull, AutoIncrement)) {
			System.out.println("Script Gerado");
		} else System.out.println("Erro ao criar o Script ");
				
	}

}
