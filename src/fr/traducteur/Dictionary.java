package fr.traducteur;

import java.util.ArrayList;

public class Dictionary {
	// creating two arralists. one for each language
	ArrayList<Word> dictEn = new ArrayList<>();
	ArrayList<Word> dictFr = new ArrayList<>();
	
	public void addWord(Word englishWord, Word frenchWord) {	// adding the words from the user to each dictionary
		dictFr.add(frenchWord);
		dictEn.add(englishWord);
		wordsAdded(englishWord, frenchWord);
	}
	
	public String getFrenchWord(int index) {
		return dictFr.get(index).getWord();
	}
	
	public String getEnglishWord(int index) {
		return dictEn.get(index).getWord();
	}
	
	public void wordsAdded(Word englishWord, Word frenchWord) {
		englishWord.show();
		System.out.print(" and ");
		 frenchWord.show();
		 System.out.println(" hans been added to the dictionary.");
	}
	
}
