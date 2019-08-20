package eg2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileWrite2 {

	public static void main(String[] args) throws IOException {

		
		String content = "";
		content = content + "C,200\n";
		content = content + "Java,250\n";
		content = content + "C++,350\n";
		System.out.println(content);
		
		byte[] bytes = content.getBytes();
		
		Path path = Paths.get("books1.txt");
		Files.write(path, bytes);
	}

}
