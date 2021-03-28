package fr.traducteur;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// initializing an array list translator
		Translator translator = new Translator();
		
		// initializing dog and cat in the translator to be available to user from the start
		Word dog = new Word("dog");
		Word chien = new Word("chien");
		translator.addWord(dog, chien);	// adding dog and chien to the words in the dictionary of the translator

		Word cat = new Word("cat");
		Word chat = new Word("chat");
		translator.addWord(cat, chat);
		
		// initiating words for the user to input
		Word englishWord = new Word();
		Word frenchWord = new Word();

		//Greetings + explanation for how the translator works
		translator.welcome();
		translator.explanation();
		String exit;	// Define whether to continue or exit the translator
		
		translator.askingUser();	// asking the user for his input
		translator.exit();
		Scanner input = new Scanner(System.in);	
		exit = input.nextLine(); // asking the user to input a string
		
		// starting the loop of the translator
		while(!exit.equals("exit translator")) {
			if(exit.charAt(0) == '+') {
				String[] addingWord = exit.split(" ");
				englishWord.setWord(addingWord[1]);
				frenchWord.setWord(addingWord[2]);
				translator.addWord(englishWord, frenchWord);	// adding the words of the user to the dictionary
				translator.askingUser();
			}
			else {
				translator.showTranslation(exit);	// printing the translation
			}
			
			translator.exit();
			exit = input.nextLine();

		}
		translator.goodBye();
		input.close();

	}

}
