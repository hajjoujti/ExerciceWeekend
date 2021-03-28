package fr.traducteur;

import java.util.ArrayList;

public class Translator {
	ArrayList<Dictionary> dict = new ArrayList<>();	// initializing array list
	Dictionary dictionary = new Dictionary();	// initializing a object of class dictionary
	private String translationFr, translationEn;


	public void addWord(Word englishWord, Word frenchWord) {	// adds the words from the user to the dictionary
		dictionary.addWord(englishWord, frenchWord);
		dict.add(dictionary);
	}

	public String scan(String word) {	// scans for the translation of the word from the user
		int index = 0;
		for(Dictionary d : dict) {
			if(d.getEnglishWord(index).equals(word)) {
				translationFr = d.getFrenchWord(index);
				return translationFr;
			}
			else if(d.getFrenchWord(index).equals(word)) {
				translationEn = d.getEnglishWord(index);
				return translationEn;
			}
			index++;
		}
		return null;
	}


	public void showTranslation(String word) {	// method that prints out the translation
		if(scan(word) == null) {
			System.out.println("This word does not exist in dictionary.");
			askingUser();
		}
		else if(scan(word).equals(translationFr)){
			System.out.println("the French translation of " + word + " is " + scan(word));
			askingUser();
		}
		else {
			System.out.println("the English translation of " + word + " is " + scan(word));
			askingUser();
		}
	}
	
	public void askingUser() {	// method asking the user to type
		System.out.println("In order to add words to the dictionary please type:"
				+ " \"+ englisshWord frenchWord\""
					+ "\nOtherwise type another word to search for it's translation.");
	}
	
	public void welcome() {
		System.out.println("Welcome to the Translator.");
	}
	
	public void explanation() {
		System.out.println("This translator asks you to type in a word then checks the language of this word.");
		System.out.println("If the word is in French it will print out its English tranlation and vice versa.");
	}
	
	public void exit() {
		System.out.println("You can also type \"exit translator\" to exit the program.");
	}
	
	public void goodBye() {
		System.out.println("You have exit the translator. Goodbye");
	}

}
