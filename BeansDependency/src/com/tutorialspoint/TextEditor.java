package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor (SpellChecker spellChecker) {
		System.out.println("inside TextEditor constructor");
		
		this.spellChecker=spellChecker;
	}
	public void spellCheck() {
		 spellChecker.checkSpelling();
	}

}
