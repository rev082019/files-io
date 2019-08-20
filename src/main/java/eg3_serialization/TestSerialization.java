package eg3_serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) throws Exception {

		
		Book book1 = new Book("C",250);
		 
		String fileName = "book1.ser";
        //Saving of object in a file 
        FileOutputStream file = new FileOutputStream(fileName); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
          
        // Method for serialization of object 
        out.writeObject(book1); 
          
        out.close(); 
        file.close(); 
          
        System.out.println("Object has been serialized"); 
	}

}
