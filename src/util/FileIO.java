package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Aufgabe 7
 * Schreibe eine Klasse, die Strings in eine Datei schreibt.
 */
public class FileIO {
	
	private static final String NL = "\n";
	public static void writeIntoFile(String fileName, String data) {
		
			
//		FileWriter fileWriter = null;
		try (FileWriter fileWriter = new FileWriter(fileName, true)){
					

//			Überflüssig
//			FileWriter fileWriter = new FileWriter(fileName);
	
//			In Java werden FileWriter und BufferedWriter beide verwendet, 
//			um Text in Dateien zu schreiben. Sie unterscheiden sich j
//			edoch grundlegend in ihrer internen Arbeitsweise und 
//			Performance.
//			Der Hauptunterschied liegt im Puffern (Buffering): 
//			BufferedWriter schreibt Daten blockweise in eine Datei, 
//			während FileWriter jedes Zeichen direkt an das Betriebssystem 
//			weitergibt, was deutlich langsamer ist.
//			BufferedWriter writer = new BufferedWriter(fileWriter);
			
//			writer.write(data + NL);
			fileWriter.write(data + NL);
			
//			writer.close();
			
//			fileWriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
		
//		try {
//			fileWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	public static void main(String[] args) {
		
		writeIntoFile("./data/Test", "aaaaa");
		writeIntoFile("./data/Test", "bbbbb");
		writeIntoFile("./data/Test", "ccccc");
// w3school:		
//	    try (BufferedWriter bw = new BufferedWriter(new FileWriter("./data/filename.txt"))) {
//	      bw.write("First line");
//	      bw.newLine();  // add line break
//	      bw.write("Second line");
//	      System.out.println("Successfully wrote to the file.");
//	    } catch (IOException e) {
//	      System.out.println("Error writing file.");
//	    }
	  }

}
