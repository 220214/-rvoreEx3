package view;

import br.mari.arvorechar.Arvore;

public class Main {

	public static void main(String[] args) {
		char[] vetor = {'M','F','S','D','J','P','U','A','E','H','Q','T','W','K'};
		Arvore ar = new Arvore();
		for (char i : vetor) {
			ar.insert(i);
		}
		try {
			ar.remove('F');
			ar.remove('U');
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ar.prefixSearch();
			System.out.println();
			ar.infixSearch();
			System.out.println();
			ar.postfixSearch();
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
