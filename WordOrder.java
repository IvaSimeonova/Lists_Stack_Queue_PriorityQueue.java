package Lists_Stack_Queue_PriorityQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;

import com.sun.tools.javac.code.Attribute.Array;

public class WordOrder {

  public static void main(String[] args) {
  ArrayList<String> words = new ArrayLis<> ();
  File myObj = new File("words.txt");
				
				try {
					Scanner myReader = new Scanner(myObj);
					while (myReader.hasNextLine()) {
						String line = myReader.nextLine();
            String lineWords[] = line.split("[\\s.,]+");
            words.addAll(Arrays.asList(lineWords));
					}
					myReader.close();
				} catch (FileNotFoundException e) {
					try {
						myObj.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
        Collections.sort(words);
        System.out.println(words);
  }
}
