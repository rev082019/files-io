package eg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileRead {

	public static void main(String[] args) throws Exception {

		String file = "books.txt";
		FileReader reader = null;
		BufferedReader br = null;
		int i;
		try {
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			while ((i = br.read()) != -1) {
				char line = (char)br.read();
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}

	}

}
