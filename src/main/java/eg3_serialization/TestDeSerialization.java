package eg3_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeSerialization {

	public static void main(String[] args) throws Exception {

		String fileName = "book1.ser";
		
		// Reading the object from a file
		FileInputStream file = new FileInputStream(fileName);
		ObjectInputStream in = new ObjectInputStream(file);

		// Method for deserialization of object
		Book book1 = (Book) in.readObject();
		System.out.println(book1);

		in.close();
		file.close();
		System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
	}

}
