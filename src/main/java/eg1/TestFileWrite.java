package eg1;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {

	public static void main(String[] args) throws IOException  {

		//checked Exception
		String file = "books.txt";
		FileWriter writer = null;		
		try {
			writer = new FileWriter(file);
			writer.append("C,200");
			writer.append("\n");
			writer.append("Java,500");
			writer.append("\n");
			writer.append("C++,300");
			System.out.println("File write - completed");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
		
	}

}
