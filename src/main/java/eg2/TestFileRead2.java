package eg2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestFileRead2 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("books.txt");

		System.out.println("Reading entire file contents");
		byte[] content1 = Files.readAllBytes(path);
		String contentStr = new String(content1);
		System.out.println(contentStr);

		System.out.println("Reading line by line");
		List<String> lines = Files.readAllLines(path);
		for (String line : lines) {
			System.out.println(line);
		}
	}

}
