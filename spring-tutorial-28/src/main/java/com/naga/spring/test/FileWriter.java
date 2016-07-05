package com.naga.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;

public class FileWriter implements LogWriter {

	public void write(String text) {
		// Write to a file here.
		// Dummy implementation
		System.out.println("Write to file: " + text);
		
	}

}
