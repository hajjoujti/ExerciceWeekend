package fr.traducteur;

public class Word {
	private String word = "";
	
	public Word() {
		
	}

	public Word(String word) {
		this.word = word;

	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public void show() {
		System.out.print(word);
	}


}
