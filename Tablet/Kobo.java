package Tablet;

import Biblioteca.Scanner;

public class Kobo extends Reader implements Tela, Comparable {

	private Scanner input;

	private int paginaatual;

	private int versao;

	private int atualizacoes;

	public void Kobo(int paginaatual, int versao) {

	}

	public void menu() {

	}

	public void pagina() {

	}

	public void versao() {

	}

	public String toString() {
		return null;
	}

	public boolean equals(Object other) {
		return false;
	}


	/**
	 * @see Tablet.Tela#ler()
	 */
	public void ler() {

	}


	/**
	 * @see Tablet.Comparable#compareTo(Tablet.Object)
	 */
	public int compareTo(Object obj) {
		return 0;
	}

}
